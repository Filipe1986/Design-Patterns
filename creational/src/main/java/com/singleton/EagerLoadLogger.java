package com.singleton;

public class EagerLoadLogger {

    // ANSI escape codes for colors
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";

    private static final EagerLoadLogger instance = new EagerLoadLogger();

    private EagerLoadLogger() {
        // Prevent instantiation
    }

    public static EagerLoadLogger getInstance() {
        return instance;
    }

    // Info level logging
    public void info(String message) {
        System.out.println(BLUE + "[INFO]: " + message + RESET);
    }

    // Debug level logging
    public void debug(String message) {
        System.out.println(GREEN + "[DEBUG]: " + message + RESET);
    }

    // Warning level logging
    public void warn(String message) {
        System.out.println(YELLOW + "[WARN]: " + message + RESET);
    }

    // Error level logging
    public void error(String message) {
        System.err.println("[ERROR]: " + message);
    }

    public static void main(String[] args) {
        // Step 4: Access the Logger singleton instance

        EagerLoadLogger log = EagerLoadLogger.getInstance();
        log.info("This is an Eager load logger Singleton.");

        log.debug("log message.");
        log.info("log message.");
        log.warn("log message.");
        log.error("log message.");
    }
}
