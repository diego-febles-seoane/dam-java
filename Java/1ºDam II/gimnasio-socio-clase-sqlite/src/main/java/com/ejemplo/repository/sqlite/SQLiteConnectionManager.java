package com.ejemplo.repository.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class SQLiteConnectionManager {

    protected static final String DEFAULT_DATABASE_PATH = "src/main/resources/data/sqlite/gimnasio.db";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:sqlite:" + DEFAULT_DATABASE_PATH);
    }

    protected Connection getConnection(String databasePath) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:" + databasePath);
        try (Statement statement = connection.createStatement()) {
            statement.execute("PRAGMA foreign_keys = ON");
        }
        return connection;
    }
}
