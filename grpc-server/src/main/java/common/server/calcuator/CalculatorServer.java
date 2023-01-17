package common.server.calcuator;

import common.server.service.calculator.CalculatorServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.protobuf.services.ProtoReflectionService;

import java.io.IOException;

import static common.constants.Constants.CALCULATOR_PORT;

public class CalculatorServer {
    public static void main(String[] args) throws IOException, InterruptedException {


        Server server = ServerBuilder.forPort(CALCULATOR_PORT).addService(new CalculatorServiceImpl())
                .addService(ProtoReflectionService.newInstance()).build();
        server.start();


        System.out.println(String.format("Server Start Listing int port %d", CALCULATOR_PORT
        ));

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Received Shutdown Request");
            server.shutdown();
            System.out.println("Server Stopped");
        }));

        server.awaitTermination();

    }
}
