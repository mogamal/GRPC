package client.greeting;

import com.proto.greeting.GreetingRequest;
import com.proto.greeting.GreetingResponse;
import com.proto.greeting.GreetingServiceGrpc;
import io.grpc.*;
import io.grpc.stub.StreamObserver;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static common.constants.Constants.*;

public class GreetingClient {


    public static void main(String[] args) throws InterruptedException {

        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress(LOCALHOST_NAME, GREETING_PORT).usePlaintext().build();

        switch (args[0]) {
            case GREETING_GREET:
                doGreet(managedChannel);
                break;
            case GREET_MANY_TIMES:
                doGreetManyTimes(managedChannel);
                break;
            case GREET_LONG:
                doGreetLong(managedChannel);
                break;
            case GREET_EVERYONE:
                doGreetEveryone(managedChannel);
                break;
            case GREET_WITH_DEADLINE:
                doGreetWithDeadline(managedChannel);
                break;
            default:
                System.out.println("invalid input ");


        }
        System.out.println("...... Shutting Down ......");
        managedChannel.shutdown();

    }

    private static void doGreetWithDeadline(ManagedChannel managedChannel) {
        System.out.println("Enter do Greet with data ");
        GreetingServiceGrpc.GreetingServiceBlockingStub stub = GreetingServiceGrpc.newBlockingStub(managedChannel);
        var greetingResponse = stub.withDeadline(Deadline.after(3, TimeUnit.SECONDS)).greetWithDeadline(GreetingRequest.newBuilder().setFirstName("Clement").build());
        System.out.println("Greeting with deadline :=  " + greetingResponse.getResult());

        try {
            greetingResponse = stub.withDeadline(Deadline.after(100, TimeUnit.MILLISECONDS))
                    .greetWithDeadline(GreetingRequest.newBuilder().setFirstName("Clement 1 ").build());
            System.out.println("Greeting with deadline = " + greetingResponse.getResult());

        } catch (StatusRuntimeException e) {
            if (Status.Code.DEADLINE_EXCEEDED == e.getStatus().getCode()) {
                System.out.println("Deadline has been exceeded !");
            } else {
                System.out.println("Got and exception in greetingWithDeadline ...");
                e.printStackTrace();
            }
        }


    }

    private static void doGreetEveryone(ManagedChannel managedChannel) throws InterruptedException {
        System.out.println("Enter doGreetEveryone");
        GreetingServiceGrpc.GreetingServiceStub stub = GreetingServiceGrpc.newStub(managedChannel);
        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<GreetingRequest> greetingRequestStreamObserver = stub.greetEveryOne(new StreamObserver<GreetingResponse>() {
            @Override
            public void onNext(GreetingResponse greetingResponse) {
                System.out.println(greetingResponse.getResult());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                latch.countDown();

            }
        });

        Arrays.asList("Clement", "Marie", "Test").forEach(name -> greetingRequestStreamObserver.onNext(GreetingRequest.newBuilder().setFirstName(name).build()));
        greetingRequestStreamObserver.onCompleted();

        latch.await(3, TimeUnit.SECONDS);
    }

    private static void doGreetLong(ManagedChannel managedChannel) throws InterruptedException {
        System.out.println("do LongGreet ............");
        CountDownLatch latch = new CountDownLatch(1);
        GreetingServiceGrpc.GreetingServiceStub stub = GreetingServiceGrpc.newStub(managedChannel);
        StreamObserver<GreetingRequest> greetingStreamObserver = stub.longGreet(new StreamObserver<GreetingResponse>() {
            @Override
            public void onNext(GreetingResponse greetingResponse) {
                System.out.println(String.format("Getting Stream Response  = %s", greetingResponse.getResult()));
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                System.out.println("Waiting time before  shutdown");
                latch.countDown();
            }
        });
        Arrays.asList("Clement", "Marie", "Test").forEach(name -> greetingStreamObserver.onNext(GreetingRequest.newBuilder().setFirstName(name).build()));
        System.out.println("Sending the stream now ");


        greetingStreamObserver.onCompleted();
        latch.await(3, TimeUnit.SECONDS);

    }

    private static void doGreetManyTimes(ManagedChannel managedChannel) {
        System.out.println("Enter do many greet times ......");
        GreetingServiceGrpc.GreetingServiceBlockingStub stub = GreetingServiceGrpc.newBlockingStub(managedChannel);
        Iterator<GreetingResponse> greetingResponse = stub.greetManyTimes(GreetingRequest.newBuilder().setFirstName("First Name do many ...").build());
        greetingResponse.forEachRemaining(System.out::println);


    }

    private static void doGreet(ManagedChannel managedChannel) {
        System.out.println("Enter doGreet");
        GreetingServiceGrpc.GreetingServiceBlockingStub stub = GreetingServiceGrpc.newBlockingStub(managedChannel);
        GreetingResponse greetingResponse = stub.greet(GreetingRequest.newBuilder().setFirstName("First Name Test ...").build());
        System.out.println("Greeting : " + greetingResponse.getResult());
    }
}
