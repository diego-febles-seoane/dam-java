package com.docencia.composicion.ejercicio8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio8Test {

    @Test
    void registroClase_porcentajeAsistencia() {
        var registro = new RegistroClase();
        registro.registrarAsistencia(" Ana ", "2025-01-01", true);
        registro.registrarAsistencia("Ana", "2025-01-02", false);
        registro.registrarAsistencia("Ana", "   ", true);       // inválida
        registro.registrarAsistencia("   ", "2025-01-03", true); // inválida

        double porcentaje = registro.porcentajeAsistencia(" ana ");
        // 1 día presente / 2 registros válidos = 0.5 -> 50.0
        assertEquals(50.0, porcentaje, 0.0001);
    }

    @Test
    void registroClase_sinRegistrosValidos() {
        var registro = new RegistroClase();
        assertEquals(0.0, registro.porcentajeAsistencia("Ana"), 0.0001);
    }
}
