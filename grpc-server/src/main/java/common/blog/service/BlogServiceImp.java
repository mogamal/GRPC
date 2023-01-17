package common.blog.service;

import com.google.protobuf.Empty;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.InsertOneResult;
import com.proto.blog.Blog;
import com.proto.blog.BlogId;
import com.proto.blog.BlogServiceGrpc;
import common.blog.model.DocumentModel;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.bson.Document;
import org.bson.types.ObjectId;

import java.util.Objects;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.combine;
import static com.mongodb.client.model.Updates.set;
import static common.constants.Constants.*;

public class BlogServiceImp extends BlogServiceGrpc.BlogServiceImplBase implements BlogService {

    private final MongoCollection<Document> mongoCollection;

    public BlogServiceImp(MongoClient client) {
        MongoDatabase mongoDatabase = client.getDatabase(BLOG_DATABASE);
        this.mongoCollection = mongoDatabase.getCollection(BLOG_COLLECTION);
    }

    @Override
    public void createBlog(Blog request, StreamObserver<BlogId> responseObserver) {
        System.out.println("Create a new blog request .. ");

        System.out.println("Inserting new blog ...........");

        InsertOneResult result;
        try {
            result = this.mongoCollection.insertOne(DocumentModel.getDocument(request));

        } catch (MongoException exception) {
            responseObserver.onError(error(Status.INTERNAL, BLOG_COULDNT_BE_CREATED, exception.getLocalizedMessage()));
            return;
        }
        if (!result.wasAcknowledged() || Objects.isNull(result.getInsertedId())) {
            responseObserver.onError(error(Status.INTERNAL, BLOG_COULDNT_BE_CREATED));
            return;
        }
        String id = result.getInsertedId().asObjectId().getValue().toString();
        System.out.println(String.format("Inserted Blog id = %s", id));

        responseObserver.onNext(BlogId.newBuilder().setId(id).build());
        responseObserver.onCompleted();
    }

    @Override
    public void readBlog(BlogId request, StreamObserver<Blog> responseObserver) {
        if (request.getId().isEmpty()) {
            responseObserver.onError(error(Status.INVALID_ARGUMENT, ID_CANNOT_BE_EMPTY));
            return;
        }

        String id = request.getId();
        Document result = this.mongoCollection.find(eq("_id", new ObjectId(id))).first();
        if (Objects.isNull(result)) {
            System.out.println("Blog not found ");
            responseObserver.onError(error(Status.NOT_FOUND, BLOG_WAS_NOT_FOUND, "BlogId: " + id));
            return;
        }
        System.out.println("Blog found, sending response");
        responseObserver.onNext(DocumentModel.documentToBlog(result));
        responseObserver.onCompleted();
    }

    @Override
    public void updateBlog(Blog request, StreamObserver<Empty> responseObserver) {
        if (request.getId().isEmpty()) {
            responseObserver.onError(error(Status.INVALID_ARGUMENT, ID_CANNOT_BE_EMPTY));
            return;
        }
        String id = request.getId();
        Document result = this.mongoCollection.findOneAndUpdate(eq("_id", new ObjectId(request.getId())), combine(set("author", request.getAuthor()), set("title", request.getTitle()), set("content", request.getContent())

        ));
        if (Objects.isNull(result)) {
            System.out.println("Blog not found ...");
            responseObserver.onError(error(Status.NOT_FOUND, BLOG_WAS_NOT_FOUND, "BlogId: =" + id));
            return;
        }
        System.out.println("Updated ! sending as response .... ");
        responseObserver.onNext(Empty.getDefaultInstance());
        responseObserver.onCompleted();
    }

    @Override
    public void delete(BlogId request, StreamObserver<Empty> responseObserver) {
        System.out.println("Received Delete Blog Request ... ");
        if( request.getId().isEmpty())
        {
            responseObserver.onError(error(Status.INVALID_ARGUMENT,ID_CANNOT_BE_EMPTY));
            return ;
        }
        String id = request.getId();
        System.out.println(" Searching for a blog with id : "+ id );
        DeleteResult result = this.mongoCollection.deleteOne(eq("_id", new ObjectId(id)));
        if(!result.wasAcknowledged())
        {
            System.out.println("Blog could not be deleted ");
            responseObserver.onError(error(Status.INTERNAL, BLOG_COULDNT_BE_DELETED));
            return ;
        }

        if( result.getDeletedCount() == 0)
        {
            System.out.println("Blog not found ");
            responseObserver.onError(error(Status.INTERNAL, BLOG_WAS_NOT_FOUND));
            return ;
        }
        System.out.println("Blog is deleted ");
        responseObserver.onNext(Empty.getDefaultInstance());
        responseObserver.onCompleted();
    }

    public void listBlogs(Empty request , StreamObserver<Blog> respoObserver)
    {
        System.out.println("Received list blog request ... ");
        for(Document document : this.mongoCollection.find())
        {
            respoObserver.onNext(DocumentModel.documentToBlog(document));
        }
        respoObserver.onCompleted();
    }
}
