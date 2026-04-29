package com.ejemplo.support;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public final class TestBackupManager {

    private static final Path DEFAULT_DATABASE_PATH = Path.of("src/main/resources/data/sqlite/gimnasio.db");
    private static final Path BACKUP_DATABASE_PATH = Path.of("src/test/resources/backup.db");

    private TestBackupManager() {
    }

    public static void restoreDatabase() {
        try {
            Files.copy(BACKUP_DATABASE_PATH, DEFAULT_DATABASE_PATH, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException exception) {
            throw new IllegalStateException("No se pudo preparar la base de datos de test", exception);
        }
    }
}
