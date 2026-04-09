package com.examen.profesores.util;

import com.examen.profesores.model.Profesores;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class XmlManager {

    private final XmlMapper xmlMapper;

    public XmlManager() {
        this.xmlMapper = new XmlMapper();
        this.xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    public Profesores read(Path path) {
        try {
            if (Files.notExists(path) || Files.size(path) == 0) {
                return new Profesores();
            }
            return xmlMapper.readValue(path.toFile(), Profesores.class);
        } catch (IOException e) {
            throw new IllegalStateException("No se pudo leer el XML", e);
        }
    }

    public void write(Path path, Profesores profesores) {
        try {
            if (path.getParent() != null) {
                Files.createDirectories(path.getParent());
            }
            xmlMapper.writeValue(path.toFile(), profesores);
        } catch (IOException e) {
            throw new IllegalStateException("No se pudo escribir el XML", e);
        }
    }
}
