package com.docencia.composicion.ejercicio10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio10Test {

@Test
void crearProyecto_conNombreValido_debeRetornarProyecto() {
    var gestor = new GestorProyectos();
    var proyecto = gestor.crearProyecto(" Proyecto A ");
    
    assertNotNull(proyecto);
    assertEquals("Proyecto A", proyecto.getNombre());
}

@Test
void crearProyecto_conNombreVacioODescuidad_debeRetornarNull() {
    var gestor = new GestorProyectos();
    var proyectoVacio = gestor.crearProyecto("");
    var proyectoEspacios = gestor.crearProyecto("   ");
    var proyectoNull = gestor.crearProyecto(null);
    
    assertNull(proyectoVacio);
    assertNull(proyectoEspacios);
    assertNull(proyectoNull);
}

@Test
void crearProyecto_nombreDebeSerTrimmeado() {
    var gestor = new GestorProyectos();
    var proyecto = gestor.crearProyecto(" Proyecto con espacios ");
    
    assertNotNull(proyecto);
    assertEquals("Proyecto con espacios", proyecto.getNombre());
}

@Test
void anadirTareaAProyecto_conProyectoExistenteYNombreValido_debeRetornarTrue() {
    var gestor = new GestorProyectos();
    gestor.crearProyecto("Proyecto A");
    
    assertTrue(gestor.anadirTareaAProyecto("proyecto a", "Tarea 1"));
    assertTrue(gestor.anadirTareaAProyecto("Proyecto A", "Tarea 2"));
}

@Test
void anadirTareaAProyecto_elNombreDelProyectoDebeSerCaseInsensitive() {
    var gestor = new GestorProyectos();
    gestor.crearProyecto("Proyecto A");
    
    assertTrue(gestor.anadirTareaAProyecto("proyecto a", "Tarea 1"));
    assertTrue(gestor.anadirTareaAProyecto("PROYECTO A", "Tarea 2"));
    assertTrue(gestor.anadirTareaAProyecto("ProYeCtO a", "Tarea 3"));
}

@Test
void anadirTareaAProyecto_conProyectoInexistente_debeRetornarFalse() {
    var gestor = new GestorProyectos();
    gestor.crearProyecto("Proyecto A");
    
    assertFalse(gestor.anadirTareaAProyecto("Inexistente", "Tarea X"));
    assertFalse(gestor.anadirTareaAProyecto("", "Tarea X"));
    assertFalse(gestor.anadirTareaAProyecto(null, "Tarea X"));
}

@Test
void anadirTareaAProyecto_conNombreDeTareaInvalido_debeRetornarFalse() {
    var gestor = new GestorProyectos();
    gestor.crearProyecto("Proyecto A");
    
    assertFalse(gestor.anadirTareaAProyecto("Proyecto A", ""));
    assertFalse(gestor.anadirTareaAProyecto("Proyecto A", "   "));
    assertFalse(gestor.anadirTareaAProyecto("Proyecto A", null));
}

@Test
void anadirTareaAProyecto_conEspaciosEnNombreProyecto_debeFuncionar() {
    var gestor = new GestorProyectos();
    gestor.crearProyecto("Proyecto A");
    
    assertTrue(gestor.anadirTareaAProyecto(" proyecto a ", "Tarea 1"));
}

@Test
void contarTareasPendientes_debeContarSoloTareasNoCompletadas() {
    var gestor = new GestorProyectos();
    var proyecto = gestor.crearProyecto("Proyecto A");
    
    gestor.anadirTareaAProyecto("Proyecto A", "Tarea 1");
    gestor.anadirTareaAProyecto("Proyecto A", "Tarea 2");
    
    // Marcar una tarea como completada
    proyecto.getTareas().get(0).marcarCompletada();
    
    assertEquals(1, gestor.contarTareasPendientes("proyecto a"));
}

@Test
void contarTareasPendientes_conProyectoInexistente_debeRetornarCero() {
    var gestor = new GestorProyectos();
    
    assertEquals(0, gestor.contarTareasPendientes("proyecto inexistente"));
    assertEquals(0, gestor.contarTareasPendientes(""));
    assertEquals(0, gestor.contarTareasPendientes(null));
}

@Test
void contarTareasPendientes_conEspaciosEnNombreProyecto_debeFuncionar() {
    var gestor = new GestorProyectos();
    gestor.crearProyecto("Proyecto A");
    
    gestor.anadirTareaAProyecto("Proyecto A", "Tarea 1");
    gestor.anadirTareaAProyecto("Proyecto A", "Tarea 2");
    
    assertEquals(2, gestor.contarTareasPendientes(" proyecto a "));
}

@Test
void tareasDebenMarcarseComoCompletadasCorrectamente() {
    var gestor = new GestorProyectos();
    var proyecto = gestor.crearProyecto("Proyecto A");
    
    gestor.anadirTareaAProyecto("Proyecto A", "Tarea 1");
    var tarea = proyecto.getTareas().get(0);
    
    assertFalse(tarea.isCompletada());
    tarea.marcarCompletada();
    assertTrue(tarea.isCompletada());
}

@Test
void proyectoDebeInicializarConListaDeTareasVacia() {
    var gestor = new GestorProyectos();
    var proyecto = gestor.crearProyecto("Proyecto A");
    
    assertNotNull(proyecto.getTareas());
    assertTrue(proyecto.getTareas().isEmpty());
}
}
