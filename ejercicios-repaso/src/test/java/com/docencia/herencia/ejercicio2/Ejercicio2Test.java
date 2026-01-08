package com.docencia.herencia.ejercicio2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio2Test {

    @Test
    void costeTotalNomina_basico() {
        Empleado e1 =
                new EmpleadoFijo("Ana", 1000.0);
        Empleado e2 =
                new EmpleadoPorHoras("Luis", 80, 10.0); // 800

        double total = EmpleadoPorHoras.costeTotalNomina(Arrays.asList(e1, e2, null));
        assertEquals(1800.0, total, 0.0001);
    }

    @Test
    void empleadoPorHoras_valoresNegativos() {
        Empleado e =
                new EmpleadoPorHoras("Ana", -5, 10.0);
        // horas negativas -> salario 0
        assertEquals(0.0, e.calcularSalarioMensual(), 0.0001);
    }
}
