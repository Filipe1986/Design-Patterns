package com.singleton;

public class BillPughLogger {

    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";

    private BillPughLogger() {}

    // Step 2: Static inner class to hold the Singleton instance
    private static class SingletonHelper {
        private static final BillPughLogger INSTANCE = new BillPughLogger();
    }

    public static BillPughLogger getInstance() {
        return SingletonHelper.INSTANCE;
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
        // Access the Logger singleton instance
        BillPughLogger log = BillPughLogger.getInstance();
        log.info("This is a basic logger Singleton using Bill Pugh implementation.");
        log.debug("Debug message.");
        log.warn("Warning message.");
        log.error("Error message.");
    }
}
