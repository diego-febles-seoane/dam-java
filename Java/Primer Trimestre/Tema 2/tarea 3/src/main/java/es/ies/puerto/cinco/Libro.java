package es.ies.puerto.cinco;

/**
 * Define una clase Libro con atributos titulo, autor y paginas. Crea varios constructores para inicializar diferentes combinaciones de estos atributos. Implementa toString() para devolver una descripción del libro.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Libro {
    private String titulo;
    private String autor;
    private int paginas;
    
    /**
     * Constructor por defecto
     */
    public Libro() {}

    /**
     * Constructor general
     */
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }


    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return this.paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
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
