package es.ies.puerto.set;

import java.util.HashSet;
import java.util.Set;

import es.ies.puerto.Libro;

public class LibroSet {
    Set<Libro> libros;

    public LibroSet() {
        this.libros = new HashSet<>();
    }

    public boolean agregar(Libro libro) {
        if (!libros.contains(libro)){
            return libros.add(libro);
        } else {
            return false;
        }
    }

    public Set<Libro> listar() {
        return new HashSet(libros);
    }

    public Libro buscar(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)){
                return libro;
            }
        }
        return null;
    }

    public boolean actualizar(String isbn, Libro libro) {
        Libro libroBuscar = buscar(isbn);
        if (libroBuscar != null){
            eliminar(isbn);
            return agregar(libro);
        }
        return false;
    }

    public boolean eliminar(String isbn) {
        Libro libroAEliminar = new Libro(isbn);
        return libros.remove(libroAEliminar);
    }

}
