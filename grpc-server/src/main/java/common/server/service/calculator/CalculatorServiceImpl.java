package common.server.service.calculator;

import com.proto.calculator.*;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

public class CalculatorServiceImpl extends CalculatorServiceGrpc.CalculatorServiceImplBase {


    @Override
    public void sum(SumRequest request, StreamObserver<SumResponse> responseObserver) {
        responseObserver.onNext(SumResponse.newBuilder().setResult(request.getFirstNumber() + request.getSecondNumber()).build());
        responseObserver.onCompleted();
    }

    @Override
    public void primes(PrimeRequest request, StreamObserver<PrimeResponse> responseObserver) {
        int number = request.getNumber();
        int divisor = 2;

        while (number > 1) {
            if (number % divisor == 0) {
                number /= divisor;
                responseObserver.onNext(PrimeResponse.newBuilder().setPrimeFactory(divisor).build());
            } else {
                ++divisor;
            }
        }
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<AvgRequest> avg(StreamObserver<AvgResponse> responseObserver) {
        return new StreamObserver<AvgRequest>() {
            int sum = 0, count = 0;

            @Override
            public void onNext(AvgRequest request) {
                sum += request.getNumber();
                count++;
            }

            @Override
            public void onError(Throwable t) {
                responseObserver.onError(t);

            }

            @Override
            public void onCompleted() {
                System.out.println("Calculating the average of the Sum (" + sum + ") , Count (" + count + ") and average " + ((double) sum / count));

                responseObserver.onNext(AvgResponse.newBuilder().setResult((double) sum / count).build());
                responseObserver.onCompleted();

            }
        };
    }

    @Override
    public StreamObserver<MaxRequest> max(StreamObserver<MaxResponse> responseObserver) {
        return new StreamObserver<>() {
            int max = 0;

            @Override
            public void onNext(MaxRequest request) {
                if (request.getNumber() > max) {
                    max = request.getNumber();
                    responseObserver.onNext(MaxResponse.newBuilder().setMax(max).build());
                }
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
    public void sqrt(SqrtRequest request, StreamObserver<SqrtResponse> responseObserver) {
        int number = request.getNumber();
        if (number < 0) {
            responseObserver.onError(Status.INVALID_ARGUMENT.withDescription(" The number being sent can't be negative ...").augmentDescription("Number :=" + number).asRuntimeException());
            return;
        }
        responseObserver.onNext(SqrtResponse.newBuilder().setResult(Math.sqrt(number)).build());
        responseObserver.onCompleted();
    }
}
