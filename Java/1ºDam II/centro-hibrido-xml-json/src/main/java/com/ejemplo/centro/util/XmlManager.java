package com.ejemplo.centro.util;

import com.ejemplo.centro.model.CentroData;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class XmlManager {
    private final XmlMapper xmlMapper = new XmlMapper();

    public CentroData read(Path path) {
        try {
            if (path == null || !Files.exists(path)) {
                return new CentroData();
            }
            return xmlMapper.readValue(path.toFile(), CentroData.class);
        } catch (IOException e) {
            throw new IllegalStateException("No se pudo leer el XML", e);
        }
    }

    public void write(Path path, CentroData data) {
        try {
            if (path == null) {
                throw new IllegalArgumentException("La ruta XML no puede ser null");
            }
            if (path.getParent() != null) {
                Files.createDirectories(path.getParent());
            }
            xmlMapper.writerWithDefaultPrettyPrinter().writeValue(path.toFile(), data);
        } catch (IOException e) {
            throw new IllegalStateException("No se pudo escribir el XML", e);
        }
    }
}
