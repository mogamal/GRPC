package common.blog.service;

import com.proto.blog.Blog;
import com.proto.blog.BlogId;
import io.grpc.stub.StreamObserver;

public interface BlogService {
    public void createBlog(Blog request, StreamObserver<BlogId> responseObserver);
}
