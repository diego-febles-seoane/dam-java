package com.docencia.herencia.ejercicio7;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Ejercicio7Test {

    // Tests para Estudiante
    @Test
    void estudianteDescripcionRolCorrecta() {
        Estudiante estudiante = new Estudiante("Ana", "Matemáticas");
        assertEquals("Estudiante Ana del curso Matemáticas", estudiante.descripcionRol());
    }
    
    @Test
    void estudianteConstructorYGetter() {
        Estudiante estudiante = new Estudiante("Carlos", "Historia");
        assertEquals("Carlos", estudiante.getNombre());
        assertEquals("Historia", estudiante.getCurso());
    }
    
    @Test
    void estudianteConNombreVacio() {
        Estudiante estudiante = new Estudiante("", "Física");
        assertEquals("Estudiante  del curso Física", estudiante.descripcionRol());
    }
    
    @Test
    void estudianteConCursoVacio() {
        Estudiante estudiante = new Estudiante("Luis", "");
        assertEquals("Estudiante Luis del curso ", estudiante.descripcionRol());
    }

    // Tests para Profesor
    @Test
    void profesorDescripcionRolCorrecta() {
        Profesor profesor = new Profesor("Dr. Pérez", "Matemáticas");
        assertEquals("Profesor Dr. Pérez de Matemáticas", profesor.descripcionRol());
    }
    
    @Test
    void profesorConstructorYGetter() {
        Profesor profesor = new Profesor("Dra. García", "Física");
        assertEquals("Dra. García", profesor.getNombre());
        assertEquals("Física", profesor.getEspecialidad());
    }
    
    @Test
    void profesorConNombreVacio() {
        Profesor profesor = new Profesor("", "Química");
        assertEquals("Profesor  de Química", profesor.descripcionRol());
    }
    
    @Test
    void profesorConEspecialidadVacia() {
        Profesor profesor = new Profesor("Prof. López", "");
        assertEquals("Profesor Prof. López de ", profesor.descripcionRol());
    }

    // Tests para método estático descripciones()
    @Test
    void descripcionesListaVacia() {
        List<Persona> personas = new ArrayList<>();
        List<String> resultado = Profesor.descripciones(personas);
        assertTrue(resultado.isEmpty());
    }
    
    @Test
    void descripcionesListaNull() {
        List<String> resultado = Profesor.descripciones(null);
        assertNotNull(resultado);
        assertTrue(resultado.isEmpty());
    }
    
    @Test
    void descripcionesListaConEstudiantesYProfesores() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Estudiante("Ana", "Matemáticas"));
        personas.add(new Profesor("Dr. Pérez", "Física"));
        personas.add(new Estudiante("Carlos", "Historia"));
        personas.add(new Profesor("Dra. García", "Química"));
        
        List<String> resultado = Profesor.descripciones(personas);
        
        assertEquals(4, resultado.size());
        assertEquals("Estudiante Ana del curso Matemáticas", resultado.get(0));
        assertEquals("Profesor Dr. Pérez de Física", resultado.get(1));
        assertEquals("Estudiante Carlos del curso Historia", resultado.get(2));
        assertEquals("Profesor Dra. García de Química", resultado.get(3));
    }
    
    @Test
    void descripcionesListaConNulls() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Estudiante("Ana", "Matemáticas"));
        personas.add(null);
        personas.add(new Profesor("Dr. Pérez", "Física"));
        personas.add(null);
        
        List<String> resultado = Profesor.descripciones(personas);
        
        assertEquals(2, resultado.size()); // Solo las personas no nulas
        assertEquals("Estudiante Ana del curso Matemáticas", resultado.get(0));
        assertEquals("Profesor Dr. Pérez de Física", resultado.get(1));
    }
    
    @Test
    void descripcionesListaSoloNulls() {
        List<Persona> personas = Arrays.asList(null, null, null);
        List<String> resultado = Profesor.descripciones(personas);
        assertTrue(resultado.isEmpty());
    }
    
    @Test
    void descripcionesListaConUnSoloElemento() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Estudiante("Solo", "Único"));
        
        List<String> resultado = Profesor.descripciones(personas);
        
        assertEquals(1, resultado.size());
        assertEquals("Estudiante Solo del curso Único", resultado.get(0));
    }

    // Tests de polimorfismo
    @Test
    void polimorfismoDescripcionRol() {
        Persona estudiante = new Estudiante("Ana", "Matemáticas");
        Persona profesor = new Profesor("Dr. Pérez", "Física");
        
        assertEquals("Estudiante Ana del curso Matemáticas", estudiante.descripcionRol());
        assertEquals("Profesor Dr. Pérez de Física", profesor.descripcionRol());
    }
    
    @Test
    void listaPolimorficaDescripciones() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Estudiante("Ana", "Matemáticas"));
        personas.add(new Profesor("Dr. Pérez", "Física"));
        personas.add(new Estudiante("Carlos", "Programación"));
        
        for (Persona persona : personas) {
            String descripcion = persona.descripcionRol();
            assertNotNull(descripcion);
            assertTrue(descripcion.contains(persona.getNombre()));
        }
    }

    // Tests adicionales de integración
    @Test
    void compararDescripcionesDirectas() {
        Estudiante e = new Estudiante("María", "Biología");
        Profesor p = new Profesor("Dr. Rodríguez", "Química Orgánica");
        
        assertNotEquals(e.descripcionRol(), p.descripcionRol());
        assertTrue(e.descripcionRol().startsWith("Estudiante"));
        assertTrue(p.descripcionRol().startsWith("Profesor"));
    }
    
    @Test
    void metodoEstaticoNoDependeDeInstancia() {
        // Probar que el método estático funciona sin instanciar Profesor
        List<Persona> personas = new ArrayList<>();
        personas.add(new Estudiante("Test", "Test"));
        
        List<String> resultado = Profesor.descripciones(personas);
        assertEquals(1, resultado.size());
    }
    
    @Test
    void nombresConCaracteresEspeciales() {
        Estudiante estudiante = new Estudiante("José María", "Álgebra");
        Profesor profesor = new Profesor("Ñañez", "Español");
        
        assertEquals("Estudiante José María del curso Álgebra", estudiante.descripcionRol());
        assertEquals("Profesor Ñañez de Español", profesor.descripcionRol());
    }
    
    @Test
    void nombresConNumeros() {
        Estudiante estudiante = new Estudiante("Alumno123", "Curso2024");
        Profesor profesor = new Profesor("Prof2024", "Materia101");
        
        assertEquals("Estudiante Alumno123 del curso Curso2024", estudiante.descripcionRol());
        assertEquals("Profesor Prof2024 de Materia101", profesor.descripcionRol());
    }

    // Test para verificar que Persona es abstracta
    @Test
    void personaEsAbstracta() {
        assertTrue(java.lang.reflect.Modifier.isAbstract(Persona.class.getModifiers()));
    }
    
    @Test
    void estudianteYProfesorSonConcretas() {
        assertFalse(java.lang.reflect.Modifier.isAbstract(Estudiante.class.getModifiers()));
        assertFalse(java.lang.reflect.Modifier.isAbstract(Profesor.class.getModifiers()));
    }
    
    // Test de inmutabilidad
    @Test
    void camposSonFinales() throws NoSuchFieldException {
        // Verificar que los campos de las clases son finales (inmutables después de la construcción)
        assertTrue(Estudiante.class.getDeclaredField("curso").getModifiers() 
            == java.lang.reflect.Modifier.FINAL);
        assertTrue(Profesor.class.getDeclaredField("especialidad").getModifiers() 
            == java.lang.reflect.Modifier.FINAL);
        assertTrue(Persona.class.getDeclaredField("nombre").getModifiers() 
            == java.lang.reflect.Modifier.FINAL);
    }
}