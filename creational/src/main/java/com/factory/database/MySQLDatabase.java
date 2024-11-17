package com.factory.database;

class MySQLDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL Database");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from MySQL Database");
    }
}

