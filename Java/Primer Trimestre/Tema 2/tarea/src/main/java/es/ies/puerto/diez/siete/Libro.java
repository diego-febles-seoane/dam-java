package es.ies.puerto.diez.siete;
import java.util.Objects;
/**
 * Crea una clase Libro con atributos titulo, autor, y paginas.
 * Sobrescribe equals() para comparar libros por su número de páginas y toString() para mostrar los detalles del libro.
 * @author emsantamaria
 * @version 1.0.0
 */
public class Libro{
    private int paginas;
    private String autor;
    private String titulo;
    /**
     * Constructor vacio por defecto
     */
    public Libro(){
    }
    /**
     * Constructor con todos los atributos
     * @param paginas
     * @param autor
     * @param titulo
     * @return 
     */
    public Libro(int paginas, String autor, String titulo){
        this.paginas = paginas;
        this.autor = autor;
        this.titulo = titulo;
    }

    public int getPaginas() {
        return this.paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Libro paginas(int paginas) {
        setPaginas(paginas);
        return this;
    }

    public Libro autor(String autor) {
        setAutor(autor);
        return this;
    }

    public Libro titulo(String titulo) {
        setTitulo(titulo);
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
        return paginas == libro.paginas;
    }

    @Override
    public int hashCode() {
        return Objects.hash(paginas, autor, titulo);
    }

    @Override
    public String toString() {
        return "Libro:{" +
            " Num. paginas:'" + getPaginas() + "'" +
            ", Nombre autor:'" + getAutor() + "'" +
            ", Titulo:'" + getTitulo() + "'" +
            "}";
    }
    
}
