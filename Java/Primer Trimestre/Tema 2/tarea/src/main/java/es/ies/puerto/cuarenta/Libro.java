package es.ies.puerto.cuarenta;
import java.util.Objects;

public class Libro {
    private String isbn;
    private int anio;

    public Libro() {
    }

    public Libro(String isbn, int anio) {
        this.isbn = isbn;
        this.anio = anio;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Libro isbn(String isbn) {
        setIsbn(isbn);
        return this;
    }

    public Libro anio(int anio) {
        setAnio(anio);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Libro)) {
            return false;
        }
        Libro libro = (Libro) o;
        return Objects.equals(isbn, libro.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, anio);
    }

    @Override
    public String toString() {
        return "{" +
            " isbn='" + getIsbn() + "'" +
            ", anio='" + getAnio() + "'" +
            "}";
    }
    
}
