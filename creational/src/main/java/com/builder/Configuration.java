package com.builder;

public class Configuration {
    private final String databaseUrl;
    private final String username;
    private final String password;
    private final int maxConnections;
    private final String logLevel;

    private Configuration(Builder builder) {
        this.databaseUrl = builder.databaseUrl;
        this.username = builder.username;
        this.password = builder.password;
        this.maxConnections = builder.maxConnections;
        this.logLevel = builder.logLevel;
    }

    public static class Builder {
        private String databaseUrl;
        private String username;
        private String password;
        private int maxConnections = 10; // Default value
        private String logLevel = "INFO"; // Default value

        public Builder databaseUrl(String databaseUrl) {
            this.databaseUrl = databaseUrl;
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder maxConnections(int maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }

        public Builder logLevel(String logLevel) {
            this.logLevel = logLevel;
            return this;
        }

        public Configuration build() {
            return new Configuration(this);
        }

    }

    @Override
    public String toString() {
        return "Builder{" +
                "databaseUrl='" + databaseUrl + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", maxConnections=" + maxConnections +
                ", logLevel='" + logLevel + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Configuration config = new Configuration.Builder()
                .databaseUrl("jdbc:mysql://localhost:3306/mydb")
                .logLevel("DEBUG")
                .username("user")
                .password("pass")
                .maxConnections(20)

                .build();

        System.out.println(config.toString());
    }
}