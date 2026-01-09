package com.docencia.composicion.ejercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio3Test {

    @Test
    void registrarConsulta_y_contarConsultasDe() {
        var centro = new CentroSalud();
        var p1 = new Paciente("Ana");
        var p2 = new Paciente("Luis");

        centro.registrarConsulta(p1, "Fiebre");
        centro.registrarConsulta(p1, "Dolor de cabeza");
        centro.registrarConsulta(p2, "Revisión");
        centro.registrarConsulta(null, "???");            // no válida
        centro.registrarConsulta(p1, "   ");               // no válida

        assertEquals(2, centro.contarConsultasDe(" ANA "));
        assertEquals(1, centro.contarConsultasDe("luis"));
        assertEquals(0, centro.contarConsultasDe("   "));
    }
}
