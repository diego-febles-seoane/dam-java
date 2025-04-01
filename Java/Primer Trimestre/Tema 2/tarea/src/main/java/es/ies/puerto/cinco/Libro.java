package es.ies.puerto.cinco;
/**
 * Define una clase Libro con atributos titulo, autor y paginas. 
 * Crea varios constructores para inicializar diferentes combinaciones de estos atributos. Implementa toString() para devolver una descripción del libro.
 * @author emsantamaria
 * @version 1.0.0
 */
public class Libro {
    private String titulo;
    private String autor;
    private int paginas;

     /**
     * Constructor vacio por defecto
     */
    public Libro() {
    }

    /**
     * Constructor con título, autor y páginas
     * @param titulo
     * @param autor
     * @param paginas
     */
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    /**
     * Constructor con título y autor
     * @param titulo
     * @param autor
     */
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    /**
     * Constructor con título y número de páginas
     * @param titulo
     * @param paginas
     */
    public Libro(String titulo, int paginas) {
        this.titulo = titulo;
        this.paginas = paginas;
    }

    /**
     * Constructor con titulo
     * @param titulo
     */
    public Libro(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Constructor con paginas
     * @param paginas
     */
    public Libro(int paginas){
        this.titulo=titulo;
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
        return "Libro{" +
                "Titulo: '" + titulo + "'" +
                ", Autor: '" + autor + "'" +
                ", Paginas: " + paginas +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)return true;   
        if (!(o instanceof Libro)) {
            return false;
        }
        Libro libro = (Libro) o;
        return titulo.equals(libro.titulo);
    }
}
