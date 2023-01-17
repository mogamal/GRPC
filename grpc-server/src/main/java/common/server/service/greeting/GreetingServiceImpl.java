package common.server.service.greeting;

import com.proto.greeting.GreetingRequest;
import com.proto.greeting.GreetingResponse;
import com.proto.greeting.GreetingServiceGrpc;
import common.server.utils.Sleeper;
import io.grpc.Context;
import io.grpc.stub.StreamObserver;

import java.util.StringJoiner;

public class GreetingServiceImpl extends GreetingServiceGrpc.GreetingServiceImplBase {

    private Sleeper sleeper;

    public GreetingServiceImpl(Sleeper sleeper) {
        this.sleeper = sleeper;
    }

    @Override
    public void greet(GreetingRequest request, StreamObserver<GreetingResponse> responseObserver) {
        responseObserver.onNext(GreetingResponse.newBuilder().setResult("Hello " + request.getFirstName()).build());
        System.out.println(".............. Sending the response .............. ");
        responseObserver.onCompleted();
    }

    @Override
    public void greetManyTimes(GreetingRequest request, StreamObserver<GreetingResponse> responseObserver) {
        for (int i = 0; i < 10; i++) {
            responseObserver.onNext(GreetingResponse.newBuilder().setResult("Hello " + request.getFirstName() + " ,Number " + i).build());
        }
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<GreetingRequest> greetEveryOne(StreamObserver<GreetingResponse> responseObserver) {
        return new StreamObserver<GreetingRequest>() {
            @Override
            public void onNext(GreetingRequest greetingRequest) {
                responseObserver.onNext(GreetingResponse.newBuilder().setResult("Hello " + greetingRequest.getFirstName()).build());
            }

            @Override
            public void onError(Throwable t) {
                responseObserver.onError(t);
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<GreetingRequest> longGreet(StreamObserver<GreetingResponse> responseObserver) {
        StringJoiner joiner = new StringJoiner("!\n");
        return new StreamObserver<GreetingRequest>() {
            @Override
            public void onNext(GreetingRequest greetingRequest) {
                joiner.add(String.format("Hello (%S)", greetingRequest.getFirstName()));
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(GreetingResponse.newBuilder().setResult(joiner.toString()).build());
                responseObserver.onCompleted();

            }
        };
    }

    @Override
    public void greetWithDeadline(GreetingRequest request, StreamObserver<GreetingResponse> responseObserver) {
        Context context = Context.current();

        try {

            for (int i = 0; i < 3; i++) {
                if (context.isCancelled()) {
                    return;
                }
                this.sleeper.sleep(100);
            }
            responseObserver.onNext(GreetingResponse.newBuilder().setResult("Hello " + request.getFirstName()).build());
            responseObserver.onCompleted();
        } catch (InterruptedException exception) {
            responseObserver.onError(exception);
        }
    }
}
