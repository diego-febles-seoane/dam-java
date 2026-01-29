package com.docencia.interfaces.ejercicio7;

import java.util.Objects;
import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */
/**
 * Implementacion concreta de Exportable.
 */
public class JsonExporter implements Exportable {

    private UUID id;
    private boolean pretty;
    private int indent;

    public JsonExporter(UUID id, boolean pretty, int indent) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.pretty = pretty;
        this.indent = indent;
    }

    public UUID getId() {
        return id;
    }

    public boolean getPretty() {
        return pretty;
    }

    public int getIndent() {
        return indent;
    }

    @Override
    public String exportar() {
        return pretty ? "JSON(pretty)" : "JSON";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        JsonExporter that = (JsonExporter) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
    @Override
    public String toString() {
        return "JsonExporter{" +
                "id=" + id +
                ", pretty=" + pretty +
                ", indent=" + indent +
                '}';
    }
}
