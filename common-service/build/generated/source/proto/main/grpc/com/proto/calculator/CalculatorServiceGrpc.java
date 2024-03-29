package com.proto.calculator;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: calculator/calculator.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CalculatorServiceGrpc {

  private CalculatorServiceGrpc() {}

  public static final String SERVICE_NAME = "calculator.CalculatorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.SumRequest,
      com.proto.calculator.SumResponse> getSumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sum",
      requestType = com.proto.calculator.SumRequest.class,
      responseType = com.proto.calculator.SumResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.calculator.SumRequest,
      com.proto.calculator.SumResponse> getSumMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.SumRequest, com.proto.calculator.SumResponse> getSumMethod;
    if ((getSumMethod = CalculatorServiceGrpc.getSumMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getSumMethod = CalculatorServiceGrpc.getSumMethod) == null) {
          CalculatorServiceGrpc.getSumMethod = getSumMethod =
              io.grpc.MethodDescriptor.<com.proto.calculator.SumRequest, com.proto.calculator.SumResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.SumRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.SumResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("sum"))
              .build();
        }
      }
    }
    return getSumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.PrimeRequest,
      com.proto.calculator.PrimeResponse> getPrimesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Primes",
      requestType = com.proto.calculator.PrimeRequest.class,
      responseType = com.proto.calculator.PrimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.calculator.PrimeRequest,
      com.proto.calculator.PrimeResponse> getPrimesMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.PrimeRequest, com.proto.calculator.PrimeResponse> getPrimesMethod;
    if ((getPrimesMethod = CalculatorServiceGrpc.getPrimesMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getPrimesMethod = CalculatorServiceGrpc.getPrimesMethod) == null) {
          CalculatorServiceGrpc.getPrimesMethod = getPrimesMethod =
              io.grpc.MethodDescriptor.<com.proto.calculator.PrimeRequest, com.proto.calculator.PrimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Primes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.PrimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.PrimeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("Primes"))
              .build();
        }
      }
    }
    return getPrimesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.AvgRequest,
      com.proto.calculator.AvgResponse> getAvgMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "avg",
      requestType = com.proto.calculator.AvgRequest.class,
      responseType = com.proto.calculator.AvgResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.calculator.AvgRequest,
      com.proto.calculator.AvgResponse> getAvgMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.AvgRequest, com.proto.calculator.AvgResponse> getAvgMethod;
    if ((getAvgMethod = CalculatorServiceGrpc.getAvgMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getAvgMethod = CalculatorServiceGrpc.getAvgMethod) == null) {
          CalculatorServiceGrpc.getAvgMethod = getAvgMethod =
              io.grpc.MethodDescriptor.<com.proto.calculator.AvgRequest, com.proto.calculator.AvgResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "avg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.AvgRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.AvgResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("avg"))
              .build();
        }
      }
    }
    return getAvgMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.MaxRequest,
      com.proto.calculator.MaxResponse> getMaxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "max",
      requestType = com.proto.calculator.MaxRequest.class,
      responseType = com.proto.calculator.MaxResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.calculator.MaxRequest,
      com.proto.calculator.MaxResponse> getMaxMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.MaxRequest, com.proto.calculator.MaxResponse> getMaxMethod;
    if ((getMaxMethod = CalculatorServiceGrpc.getMaxMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getMaxMethod = CalculatorServiceGrpc.getMaxMethod) == null) {
          CalculatorServiceGrpc.getMaxMethod = getMaxMethod =
              io.grpc.MethodDescriptor.<com.proto.calculator.MaxRequest, com.proto.calculator.MaxResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "max"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.MaxRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.MaxResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("max"))
              .build();
        }
      }
    }
    return getMaxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.SqrtRequest,
      com.proto.calculator.SqrtResponse> getSqrtMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sqrt",
      requestType = com.proto.calculator.SqrtRequest.class,
      responseType = com.proto.calculator.SqrtResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.calculator.SqrtRequest,
      com.proto.calculator.SqrtResponse> getSqrtMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.SqrtRequest, com.proto.calculator.SqrtResponse> getSqrtMethod;
    if ((getSqrtMethod = CalculatorServiceGrpc.getSqrtMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getSqrtMethod = CalculatorServiceGrpc.getSqrtMethod) == null) {
          CalculatorServiceGrpc.getSqrtMethod = getSqrtMethod =
              io.grpc.MethodDescriptor.<com.proto.calculator.SqrtRequest, com.proto.calculator.SqrtResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sqrt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.SqrtRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.SqrtResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("sqrt"))
              .build();
        }
      }
    }
    return getSqrtMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CalculatorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceStub>() {
        @java.lang.Override
        public CalculatorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculatorServiceStub(channel, callOptions);
        }
      };
    return CalculatorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CalculatorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceBlockingStub>() {
        @java.lang.Override
        public CalculatorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculatorServiceBlockingStub(channel, callOptions);
        }
      };
    return CalculatorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CalculatorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceFutureStub>() {
        @java.lang.Override
        public CalculatorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculatorServiceFutureStub(channel, callOptions);
        }
      };
    return CalculatorServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CalculatorServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sum(com.proto.calculator.SumRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.SumResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSumMethod(), responseObserver);
    }

    /**
     */
    public void primes(com.proto.calculator.PrimeRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.PrimeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPrimesMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.calculator.AvgRequest> avg(
        io.grpc.stub.StreamObserver<com.proto.calculator.AvgResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getAvgMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.calculator.MaxRequest> max(
        io.grpc.stub.StreamObserver<com.proto.calculator.MaxResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getMaxMethod(), responseObserver);
    }

    /**
     */
    public void sqrt(com.proto.calculator.SqrtRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.SqrtResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSqrtMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSumMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.calculator.SumRequest,
                com.proto.calculator.SumResponse>(
                  this, METHODID_SUM)))
          .addMethod(
            getPrimesMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.calculator.PrimeRequest,
                com.proto.calculator.PrimeResponse>(
                  this, METHODID_PRIMES)))
          .addMethod(
            getAvgMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.proto.calculator.AvgRequest,
                com.proto.calculator.AvgResponse>(
                  this, METHODID_AVG)))
          .addMethod(
            getMaxMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.proto.calculator.MaxRequest,
                com.proto.calculator.MaxResponse>(
                  this, METHODID_MAX)))
          .addMethod(
            getSqrtMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.calculator.SqrtRequest,
                com.proto.calculator.SqrtResponse>(
                  this, METHODID_SQRT)))
          .build();
    }
  }

  /**
   */
  public static final class CalculatorServiceStub extends io.grpc.stub.AbstractAsyncStub<CalculatorServiceStub> {
    private CalculatorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculatorServiceStub(channel, callOptions);
    }

    /**
     */
    public void sum(com.proto.calculator.SumRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.SumResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void primes(com.proto.calculator.PrimeRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.PrimeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getPrimesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.calculator.AvgRequest> avg(
        io.grpc.stub.StreamObserver<com.proto.calculator.AvgResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getAvgMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.calculator.MaxRequest> max(
        io.grpc.stub.StreamObserver<com.proto.calculator.MaxResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getMaxMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void sqrt(com.proto.calculator.SqrtRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.SqrtResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSqrtMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CalculatorServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CalculatorServiceBlockingStub> {
    private CalculatorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculatorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.calculator.SumResponse sum(com.proto.calculator.SumRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSumMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.proto.calculator.PrimeResponse> primes(
        com.proto.calculator.PrimeRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getPrimesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.calculator.SqrtResponse sqrt(com.proto.calculator.SqrtRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSqrtMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CalculatorServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CalculatorServiceFutureStub> {
    private CalculatorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculatorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.calculator.SumResponse> sum(
        com.proto.calculator.SumRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSumMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.calculator.SqrtResponse> sqrt(
        com.proto.calculator.SqrtRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSqrtMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUM = 0;
  private static final int METHODID_PRIMES = 1;
  private static final int METHODID_SQRT = 2;
  private static final int METHODID_AVG = 3;
  private static final int METHODID_MAX = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CalculatorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CalculatorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUM:
          serviceImpl.sum((com.proto.calculator.SumRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.calculator.SumResponse>) responseObserver);
          break;
        case METHODID_PRIMES:
          serviceImpl.primes((com.proto.calculator.PrimeRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.calculator.PrimeResponse>) responseObserver);
          break;
        case METHODID_SQRT:
          serviceImpl.sqrt((com.proto.calculator.SqrtRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.calculator.SqrtResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AVG:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.avg(
              (io.grpc.stub.StreamObserver<com.proto.calculator.AvgResponse>) responseObserver);
        case METHODID_MAX:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.max(
              (io.grpc.stub.StreamObserver<com.proto.calculator.MaxResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CalculatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CalculatorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.calculator.Calculator.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CalculatorService");
    }
  }

  private static final class CalculatorServiceFileDescriptorSupplier
      extends CalculatorServiceBaseDescriptorSupplier {
    CalculatorServiceFileDescriptorSupplier() {}
  }

  private static final class CalculatorServiceMethodDescriptorSupplier
      extends CalculatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CalculatorServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CalculatorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CalculatorServiceFileDescriptorSupplier())
              .addMethod(getSumMethod())
              .addMethod(getPrimesMethod())
              .addMethod(getAvgMethod())
              .addMethod(getMaxMethod())
              .addMethod(getSqrtMethod())
              .build();
        }
      }
    }
    return result;
  }
}
