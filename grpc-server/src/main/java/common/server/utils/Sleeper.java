package common.server.utils;

@FunctionalInterface
public interface Sleeper {
    void sleep(long millis) throws InterruptedException;
}
