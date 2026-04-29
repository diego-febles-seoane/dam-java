package com.ejemplo.repository.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class SQLiteConnectionManager {

    private static String databasePath = "src/main/resources/data/sqlite/fruteria.db";

    public static void setDatabasePath(String path) {
        databasePath = path;
    }

    public static String getDatabasePath() {
        return databasePath;
    }

    public static Connection getConnection() throws SQLException {
        Connection c = DriverManager.getConnection("jdbc:sqlite:" + databasePath);
        try (Statement st = c.createStatement()) {
            st.execute("PRAGMA foreign_keys = ON");
        }
        return c;
    }
}
