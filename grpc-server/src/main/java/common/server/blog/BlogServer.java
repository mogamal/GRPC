package common.server.blog;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import common.blog.service.BlogServiceImp;
import static common.constants.Constants.*;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class BlogServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        MongoClient mongoClient = MongoClients.create("mongodb://root:root@localhost:27017/");
        Server server = ServerBuilder.forPort(BLOG_PORT).addService(new BlogServiceImp(mongoClient))
                .build();
        server.start();

        System.out.println("Server started");
        System.out.println(String.format("Server start listing in port %d" , BLOG_PORT));

        Runtime.getRuntime().addShutdownHook(new Thread(()-> {
            System.out.println("Received Shutdown Request");
            server.shutdown();
            System.out.println(" Server Stopped ...");
        }));

        server.awaitTermination();

    }
}
