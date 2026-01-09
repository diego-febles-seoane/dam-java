package com.docencia.composicion.ejercicio13;


import java.util.ArrayList;
import java.util.List;


public class Biblioteca {
    private final List<Libro> libros = new ArrayList<>();

    public void agregarLibro(String titulo, String autor, int anio) {
        // TODO: validar según enunciado/tests.
        if (titulo != null && autor != null && anio > 0) {
            libros.add(new Libro(titulo, autor, anio));
        }
    }

    public List<Libro> buscarPorAutor(String autor) {
        // TODO: filtrar por autor (case-insensitive, trim).
        return new ArrayList<>();
    }

    public long contarLibrosAnterioresA(int anioLimite) {
        // TODO: contar libros con anio < anioLimite.
        return 0L;
    }

    public List<Libro> getLibros() {
        return new ArrayList<>(libros);
    }
}
