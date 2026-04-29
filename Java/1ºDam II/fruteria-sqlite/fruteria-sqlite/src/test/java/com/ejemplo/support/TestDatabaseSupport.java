package com.ejemplo.support;
import com.ejemplo.repository.sqlite.SQLiteConnectionManager;
import java.nio.file.*;
public class TestDatabaseSupport {
    public static final String TEST_DB = "src/main/resources/data/sqlite/fruteria.db";
    public static void resetDatabase(){ try{ Files.createDirectories(Path.of("target")); Files.copy(Path.of("src/test/resources/backup.db"), Path.of(TEST_DB), StandardCopyOption.REPLACE_EXISTING); SQLiteConnectionManager.setDatabasePath(TEST_DB);} catch(Exception e){ throw new RuntimeException(e);} }
}
