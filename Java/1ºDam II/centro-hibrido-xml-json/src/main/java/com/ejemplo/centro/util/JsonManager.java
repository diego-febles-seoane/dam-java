package com.ejemplo.centro.util;

import com.ejemplo.centro.model.EstadoCentro;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class JsonManager {
    private final ObjectMapper objectMapper = new ObjectMapper();

    public EstadoCentro read(Path path) {
        try {
            if (path == null || !Files.exists(path)) {
                return new EstadoCentro();
            }
            return objectMapper.readValue(path.toFile(), EstadoCentro.class);
        } catch (IOException e) {
            throw new IllegalStateException("No se pudo leer el JSON", e);
        }
    }

    public void write(Path path, EstadoCentro data) {
        try {
            if (path == null) {
                throw new IllegalArgumentException("La ruta JSON no puede ser null");
            }
            if (path.getParent() != null) {
                Files.createDirectories(path.getParent());
            }
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(path.toFile(), data);
        } catch (IOException e) {
            throw new IllegalStateException("No se pudo escribir el JSON", e);
        }
    }
}
