package com.ejemplo.support;

import com.ejemplo.repository.sqlite.SQLiteConnectionManager;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public final class TestDatabaseSupport extends SQLiteConnectionManager {

    private TestDatabaseSupport() {
    }

    public static void clearSocios() {
        execute("DELETE FROM reserva");
        execute("DELETE FROM socio");
    }

    public static void clearClases() {
        execute("DELETE FROM reserva");
        execute("DELETE FROM clase");
    }

    public static void clearTable(String tableName) {
        execute("DELETE FROM " + tableName);
    }

    private static void execute(String sql) {
        try (Connection connection = new TestDatabaseSupport().getConnection();
             Statement statement = connection.createStatement()) {
            statement.execute(sql);
        } catch (SQLException exception) {
            throw new IllegalStateException(exception);
        }
    }
}
