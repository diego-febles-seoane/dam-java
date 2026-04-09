package com.ejemplo.centro;

import com.ejemplo.centro.model.CentroData;
import com.ejemplo.centro.model.EstadoCentro;
import com.ejemplo.centro.model.Evaluacion;
import com.ejemplo.centro.model.Incidencia;
import com.ejemplo.centro.model.Modulo;
import com.ejemplo.centro.model.Profesor;
import com.ejemplo.centro.util.JsonManager;
import com.ejemplo.centro.util.XmlManager;
import java.nio.file.Path;
import java.util.List;

public final class TestDataHelper {
    private TestDataHelper() {
    }

    public static void seedXml(Path xmlPath) {
        CentroData data = new CentroData(
                List.of(
                        new Profesor("P01", "Ana Pérez", "Informática"),
                        new Profesor("P02", "Luis Martín", "FOL"),
                        new Profesor("P03", "Marta Suárez", "Bases de Datos")
                ),
                List.of(
                        new Modulo("M01", "Programación", "P01"),
                        new Modulo("M02", "Acceso a datos", "P01"),
                        new Modulo("M03", "Formación y Orientación Laboral", "P02"),
                        new Modulo("M04", "Bases de Datos", "P03")
                )
        );
        new XmlManager().write(xmlPath, data);
    }

    public static void seedJson(Path jsonPath) {
        EstadoCentro estado = new EstadoCentro(
                List.of(
                        new Evaluacion("Pedro", "M01", 8.5),
                        new Evaluacion("Laura", "M01", 6.5),
                        new Evaluacion("Mario", "M02", 9.0),
                        new Evaluacion("Lucía", "M03", 7.5),
                        new Evaluacion("Nora", "M04", 8.0),
                        new Evaluacion("Iván", "M04", 5.5)
                ),
                List.of(
                        new Incidencia("P01", "Falta cable HDMI en el aula A1", "2026-04-10"),
                        new Incidencia("P01", "Incidencia con el proyector", "2026-04-11"),
                        new Incidencia("P02", "Aula cerrada al inicio de la sesión", "2026-04-12"),
                        new Incidencia("P03", "Equipos sin conexión a la base de datos", "2026-04-13")
                )
        );
        new JsonManager().write(jsonPath, estado);
    }

    public static void seedEmptyJson(Path jsonPath) {
        new JsonManager().write(jsonPath, new EstadoCentro());
    }
}
