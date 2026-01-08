package com.docencia.composicion.ejercicio15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio15Test {

    @Test
    void empresa_basico() {
        var empresa = new Empresa();
        var d1 = empresa.crearDepartamento(" Desarrollo ");
        var dInvalido = empresa.crearDepartamento("   ");
        assertNotNull(d1);
        assertNull(dInvalido);

        assertTrue(empresa.anadirTrabajador("desarrollo", "Ana", 2000.0));
        assertTrue(empresa.anadirTrabajador("DESARROLLO", "Luis", 1000.0));
        assertFalse(empresa.anadirTrabajador("Inexistente", "X", 1000.0));
        assertFalse(empresa.anadirTrabajador("Desarrollo", "  ", 1000.0));
        assertFalse(empresa.anadirTrabajador("Desarrollo", "Pepe", -5.0));

        assertEquals(1500.0, empresa.salarioMedioDepartamento(" desarrollo "), 0.0001);
        assertEquals(3000.0, empresa.salarioTotalEmpresa(), 0.0001);
    }

    @Test
    void empresa_sinDepartamentosNiTrabajadores() {
        var empresa = new Empresa();
        assertEquals(0.0, empresa.salarioMedioDepartamento("X"), 0.0001);
        assertEquals(0.0, empresa.salarioTotalEmpresa(), 0.0001);
    }
}
