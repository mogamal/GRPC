package client.calculator;

import com.proto.calculator.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static common.constants.Constants.*;

public class CalculatorClient {
    public static void main(String[] args) throws InterruptedException {
        if (Objects.nonNull(args) && args.length > 0) {
            var channel = ManagedChannelBuilder.forAddress(LOCALHOST_NAME, CALCULATOR_PORT).usePlaintext().build();
            switch (args[0]) {
                case SUM_OPERATION -> doSum(channel);
                case AVG_OPERATION -> doAverage(channel);
                case PRIMES_OPERATION -> doPrimes(channel);
                case MAX_OPERATION -> doMax(channel);
                case SQRT_OPERATION -> doSqrt(channel);
                default -> System.err.println("invalid Option ");
            }
        }
    }

    private static void doSqrt(ManagedChannel channel) {
        System.out.println("Enter doSqrt ....");
        CalculatorServiceGrpc.CalculatorServiceBlockingStub stub = CalculatorServiceGrpc.newBlockingStub(channel);
        SqrtResponse response = stub.sqrt(SqrtRequest.newBuilder().setNumber(25).build());
        System.out.println("Response = " + response.getResult());


    }

    private static void doMax(ManagedChannel channel) throws InterruptedException {
        System.out.println("Enter the Sum");
        CalculatorServiceGrpc.CalculatorServiceStub stub = CalculatorServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);
        StreamObserver<MaxRequest> streamObserver = stub.max(new StreamObserver<MaxResponse>() {
            @Override
            public void onNext(MaxResponse response) {
                System.out.println("Max := " + response.getMax());

            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                latch.countDown();
            }
        });

        Arrays.asList(1, 5, 3, 6, 2, 20).forEach(number -> streamObserver.onNext(MaxRequest.newBuilder().setNumber(number).build()));
        streamObserver.onCompleted();
        ;
        latch.await(3, TimeUnit.SECONDS);
    }

    private static void doPrimes(ManagedChannel channel) {
        System.out.println("Enter  doPrimes ");
        CalculatorServiceGrpc.CalculatorServiceBlockingStub stub = CalculatorServiceGrpc.newBlockingStub(channel);
        Iterator<PrimeResponse> responseIterator = stub.primes(PrimeRequest.newBuilder().setNumber(567890).build());
        responseIterator.forEachRemaining(item -> System.out.println("Factory value = " + item.getPrimeFactory()));


    }

    private static void doAverage(ManagedChannel channel) throws InterruptedException {
        System.out.println("Enter do average ... ");
        CountDownLatch latch = new CountDownLatch(1);
        CalculatorServiceGrpc.CalculatorServiceStub stub = CalculatorServiceGrpc.newStub(channel);
        StreamObserver<AvgRequest> streamObserver = stub.avg(new StreamObserver<AvgResponse>() {
            @Override
            public void onNext(AvgResponse avgResponse) {
                System.out.println("Average : = " + avgResponse.getResult());

            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                System.out.println("Execution Completed");
                latch.countDown();

            }
        });

        IntStream.range(1, 50).forEach(value -> streamObserver.onNext(AvgRequest.newBuilder().setNumber(value).build()));

        streamObserver.onCompleted();
        latch.await();

    }

    private static void doSum(ManagedChannel channel) {
        System.out.println("-------------- Enter doSum -----------------");
        CalculatorServiceGrpc.CalculatorServiceBlockingStub stub = CalculatorServiceGrpc.newBlockingStub(channel);
        SumResponse sumResponse = stub.sum(SumRequest.newBuilder().setFirstNumber(10).setSecondNumber(5).build());

        System.out.println("Sum = " + sumResponse.getResult());

    }
}
