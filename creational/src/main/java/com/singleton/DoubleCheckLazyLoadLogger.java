package com.singleton;

public class DoubleCheckLazyLoadLogger {

    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";


    private static volatile DoubleCheckLazyLoadLogger instance = null;

    private DoubleCheckLazyLoadLogger() {}

    public static DoubleCheckLazyLoadLogger getInstance() {
        if (instance == null) {
            synchronized (LazyLoadLogger.class) {
                if (instance == null) {
                    instance = new DoubleCheckLazyLoadLogger();
                }
            }
        }
        return instance;
    }

    public void info(String message) {
        System.out.println(BLUE + "[INFO]: " + message + RESET);
    }

    public void debug(String message) {
        System.out.println(GREEN + "[DEBUG]: " + message + RESET);
    }

    public void warn(String message) {
        System.out.println(YELLOW + "[WARN]: " + message + RESET);
    }

    public void error(String message) {
        System.err.println("[ERROR]: " + message);
    }

    public static void main(String[] args) {
        DoubleCheckLazyLoadLogger log = DoubleCheckLazyLoadLogger.getInstance();
        log.info("This is a Double check lazy load logger Singleton.");

        log.debug("log message.");
        log.info("log message.");
        log.warn("log message.");
        log.error("log message.");
    }
}
