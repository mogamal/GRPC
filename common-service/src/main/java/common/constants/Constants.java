package common.constants;

import io.grpc.Status;

public interface Constants {

    String LOCALHOST_NAME = "localhost";
    int GREETING_PORT = 50051;
    String GREETING_GREET = "greet";
    String GREET_MANY_TIMES = "greet_many_times";
    String GREET_LONG = "greet_long";
    String GREET_EVERYONE = "greet_everyone";
    String GREET_WITH_DEADLINE = "greet_with_deadline";
    int CALCULATOR_PORT = 50052;
    int BLOG_PORT = 50053;


    // calculator Operation
    String SUM_OPERATION = "sum";
    String AVG_OPERATION = "avg";
    String PRIMES_OPERATION = "primes";
    String MAX_OPERATION = "max";
    String SQRT_OPERATION = "sqrt";

    // db configuration
    String BLOG_DATABASE = "blogdb";
    String BLOG_COLLECTION = "blog";

    // Error Message
    String BLOG_COULDNT_BE_CREATED = "The blog could not be created";
    String BLOG_WAS_NOT_FOUND = "The blog with the corresponding id was not found";
    String ID_CANNOT_BE_EMPTY = "The blog ID cannot be empty";
    String BLOG_COULDNT_BE_DELETED = "The blog could not be deleted";

    static io.grpc.StatusRuntimeException error(Status status, String message, String augmentMessage) {
        return status.withDescription(message)
                .augmentDescription(augmentMessage)
                .asRuntimeException();
    }

    static io.grpc.StatusRuntimeException error(Status status, String message) {
        return status.withDescription(message).asRuntimeException();
    }

}
