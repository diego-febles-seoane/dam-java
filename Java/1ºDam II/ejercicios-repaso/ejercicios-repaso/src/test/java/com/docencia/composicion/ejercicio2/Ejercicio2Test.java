package com.docencia.composicion.ejercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio2Test {

    @Test
    void registrarNota_y_mediaAlumno() {
        Aula aula = new Aula();
        aula.registrarNota(" Ana ", "Matemáticas", 8.0);
        aula.registrarNota("ana", "Lengua", 6.0);
        aula.registrarNota("ana", "Historia", -1.0); // no válida
        aula.registrarNota("   ", "Ciencias", 7.0);   // no válida

        double media = aula.mediaAlumno(" ANA ");
        assertEquals(7.0, media, 0.0001);
    }

    @Test
    void mediaAlumno_sinNotas() {
        Aula aula = new Aula();
        assertEquals(0.0, aula.mediaAlumno("Ana"), 0.0001);
    }
}
