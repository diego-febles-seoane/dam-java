package com.docente.modelo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlumnoTest {

    private Alumno alumno;

    @BeforeEach
    void setUp() {
        alumno = new Alumno("A001", "Juan Perez", 20, "Matemáticas");
    }


    @Test
    void testConstructor() {
        assertNotNull(alumno);
    }

    @Test
    void testIdentificador() {
        alumno = new Alumno("A002");
        assertNotNull(alumno);
        assert alumno.getIdentificador().equals("A002");
    }



    @Test
    void getterSetterTest() {
        assert alumno.getIdentificador().equals("A001");
        assert alumno.getNombre().equals("Juan Perez");
        assert alumno.getEdad() == 20;
        assert alumno.getCurso().equals("Matemáticas"); 
    }

    @Test
    void equalsTestOk() {
        Alumno alumnoEqualsAlumno = new Alumno("A001");
         assertNotNull(alumnoEqualsAlumno);
        assert alumno.equals(alumnoEqualsAlumno);
    }

    @Test
    void equalsNullTestFalse() {
        assertFalse(alumno.equals(null));
    }

    @Test
    void equalsTestSame() {
        assert(alumno.equals(alumno));
    }

    @Test
    void equalsIdentificadorNullTest() {
        Alumno alumnoEquals = new Alumno(null);
        assertFalse(alumno.equals(alumnoEquals));
        assertFalse(alumnoEquals.equals(alumno));
    }

}
