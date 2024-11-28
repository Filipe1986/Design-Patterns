package com.factory.database;

class DatabaseFactory {

    public Database getDatabase(String dbType) {
        if (dbType == null) {
            return null;
        }
        if (dbType.equalsIgnoreCase("MYSQL")) {
            return new MySQLDatabase();
        } else if (dbType.equalsIgnoreCase("ORACLE")) {
            return new OracleDatabase();
        }
        return null;
    }

    public static void main(String[] args) {
        DatabaseFactory databaseFactory = new DatabaseFactory();

        // Get an object of MySQLDatabase and call its methods
        Database database1 = databaseFactory.getDatabase("MYSQL");
        database1.connect();
        database1.disconnect();

        // Get an object of OracleDatabase and call its methods
        Database database2 = databaseFactory.getDatabase("ORACLE");
        database2.connect();
        database2.disconnect();
    }
}