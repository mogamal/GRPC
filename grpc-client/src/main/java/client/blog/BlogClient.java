package client.blog;

import com.google.protobuf.Empty;
import com.proto.blog.Blog;
import com.proto.blog.BlogId;
import com.proto.blog.BlogServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.Objects;
import java.util.StringJoiner;

import static common.constants.Constants.BLOG_PORT;
import static common.constants.Constants.LOCALHOST_NAME;

public class BlogClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(LOCALHOST_NAME, BLOG_PORT).usePlaintext().build();
        run(channel);
    }

    private static void run(ManagedChannel channel) {
        BlogServiceGrpc.BlogServiceBlockingStub stub = BlogServiceGrpc.newBlockingStub(channel);
        BlogId blogId = createBlog(stub);
        if (Objects.isNull(blogId)) {
            return;
        }
        readBlog(stub, blogId);
        String blogIdString = blogId.getId().toString();
        updateBlog(stub, getBlogId(blogIdString));
        updateBlog(stub, getBlogId(blogIdString));
        listBlog(stub, System.out);
        deleteBlog(stub, getBlogId(blogIdString));


    }

    private static void deleteBlog(BlogServiceGrpc.BlogServiceBlockingStub stub, BlogId blogId) {
        System.out.println("Deleting Blog ....");
        stub.delete(blogId);

        System.out.println("Blog Deleted : = " + blogId.getId());
    }

    private static void listBlog(BlogServiceGrpc.BlogServiceBlockingStub stub, PrintStream out) {
        Iterator<Blog> iterator = stub.listBlogs(Empty.getDefaultInstance());
        iterator.forEachRemaining(out::println);

    }

    private static void updateBlog(BlogServiceGrpc.BlogServiceBlockingStub stub, BlogId blogId) {

        Blog blog = Blog.newBuilder().setId(blogId.getId()).setAuthor("Change Author ").setContent("Changed Content ").setTitle("Changed Title").build();
        if (Objects.isNull(blog)) {
            System.out.println("blog not exist ");
            return;
        }
        System.out.println("Updating blog .....");
        stub.updateBlog(blog);
        System.out.println("Blog Updated .....");
        System.out.println(blog);
    }

    private static BlogId getBlogId(String blogId) {
        return BlogId.newBuilder().setId(blogId).build();
    }

    private static void readBlog(BlogServiceGrpc.BlogServiceBlockingStub stub, BlogId blogId) {
        Blog blog = stub.readBlog(blogId);
        StringJoiner joiner = new StringJoiner("\n");

        joiner.add("Details of the request ");
        joiner.add("Id : " + blog.getId());
        joiner.add("Author : " + blog.getAuthor());
        joiner.add("Title : " + blog.getTitle());
        joiner.add("Content : " + blog.getContent());

        System.out.println(joiner.toString());

    }

    private static BlogId createBlog(BlogServiceGrpc.BlogServiceBlockingStub stub) {
        BlogId blogId = stub.createBlog(Blog.newBuilder().setAuthor("Mohammed").setTitle("Ahmed Title").setContent("Mohammed Gamal Content").build());
        System.out.println("Blog created := " + blogId.getId());
        return blogId;
    }
}
