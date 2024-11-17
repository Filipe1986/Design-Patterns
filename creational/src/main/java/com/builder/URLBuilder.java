package com.builder;

import java.util.HashMap;
import java.util.Map;

public class URLBuilder {
    private final String protocol;
    private final String host;
    private final int port;
    private final String path;
    private final Map<String, String> queryParams;

    private URLBuilder(Builder builder) {
        this.protocol = builder.protocol;
        this.host = builder.host;
        this.port = builder.port;
        this.path = builder.path;
        this.queryParams = builder.queryParams;
    }

    @Override
    public String toString() {
        StringBuilder url = new StringBuilder();
        url.append(protocol).append("://").append(host);
        if (port != -1) {
            url.append(":").append(port);
        }
        if (path != null && !path.isEmpty()) {
            url.append("/").append(path);
        }
        if (!queryParams.isEmpty()) {
            url.append("?");
            queryParams.forEach((key, value) -> url.append(key).append("=").append(value).append("&"));
            url.setLength(url.length() - 1); // Remove the last '&'
        }
        return url.toString();
    }

    public static class Builder {
        private String protocol;
        private String host;
        private int port = -1;
        private String path = "";
        private Map<String, String> queryParams = new HashMap<>();

        public Builder setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setHost(String host) {
            this.host = host;
            return this;
        }

        public Builder setPort(int port) {
            this.port = port;
            return this;
        }

        public Builder setPath(String path) {
            this.path = path;
            return this;
        }

        public Builder addQueryParam(String key, String value) {
            this.queryParams.put(key, value);
            return this;
        }

        public URLBuilder build() {
            if (protocol == null || host == null) {
                throw new IllegalStateException("Protocol and host must be provided");
            }
            return new URLBuilder(this);
        }
    }

    public static void main(String[] args) {
        URLBuilder url = new URLBuilder.Builder()
                .setProtocol("https")
                .setHost("example.com")
                .setPath("api/v1/users")
                .addQueryParam("id", "1234")
                .addQueryParam("format", "json")
                .setPort(443)
                .build();

        System.out.println(url);
        //https://example.com:443/api/v1/users?id=1234&format=json
    }
}
