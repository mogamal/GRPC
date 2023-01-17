package common.server.greeting;

import static common.constants.Constants.*;
import common.server.service.greeting.GreetingServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class ServerImpl {
    public static void main(String[] args) throws IOException, InterruptedException {

        Server server = ServerBuilder.forPort(GREETING_PORT)
                .addService(new GreetingServiceImpl(Thread::sleep))
                .build();

        server.start();

        System.out.println("Server Started .......");
        System.out.println("Listening on Port : " + GREETING_PORT);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Received Shutdown Request");
            server.shutdown();
            System.out.println("Server Stopped ");

        }));

        server.awaitTermination();
    }
}
