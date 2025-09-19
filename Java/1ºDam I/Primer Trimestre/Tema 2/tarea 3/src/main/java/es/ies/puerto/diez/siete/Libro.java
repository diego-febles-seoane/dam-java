package es.ies.puerto.diez.siete;
/**
 * Crea una clase Libro con atributos titulo, autor, y paginas. Sobrescribe equals() para comparar libros por su número de páginas y toString() para mostrar los detalles del libro.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Libro {
    private String titulo;
    private String autor;
    int paginas;

    /**
     * Constructor por defecto
     */
    public Libro() {
    }

    /**
     * Constructor general
     */
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Libro)) {
            return false;
        }
        Libro libro = (Libro) obj;
        return this.paginas == libro.paginas;
    
    }


    @Override
    public String toString() {
        return "{" +
            " titulo='" + getTitulo() + "'" +
            ", autor='" + getAutor() + "'" +
            ", paginas='" + getPaginas() + "'" +
            "}";
    }

}
