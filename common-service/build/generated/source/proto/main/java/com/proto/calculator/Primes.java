// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: calculator/primes.proto

package com.proto.calculator;

public final class Primes {
  private Primes() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_PrimeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_PrimeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_PrimeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_PrimeResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027calculator/primes.proto\022\ncalculator\"\036\n" +
      "\014PrimeRequest\022\016\n\006number\030\001 \001(\005\"%\n\rPrimeRe" +
      "sponse\022\024\n\014primeFactory\030\001 \001(\005B\030\n\024com.prot" +
      "o.calculatorP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_calculator_PrimeRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_calculator_PrimeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_PrimeRequest_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_calculator_PrimeResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_calculator_PrimeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_PrimeResponse_descriptor,
        new java.lang.String[] { "PrimeFactory", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
