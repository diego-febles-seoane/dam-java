package es.ies.puerto.veinte.nueve;
import java.util.Objects;
/**
 * Crea una clase Estanteria con una lista (array) (array) de libros. 
 * Implementa métodos para agregar libros y ordenarlos por título. 
 * Usa toString() para mostrar los detalles de la estantería.
 * @author emsantamaria
 * @version 1.0.0
 */
public class Estanteria {
    private Libro[]libros;
    private int numLibros;

    /**
     * Constructor vacío por defecto
     */
    public Estanteria() {
    }
    /**
     * Contructor con un número de libros inicializado
     * @param numLibros
     */
    public Estanteria(int numLibros) {
        this.libros = new Libro[numLibros];
        this.numLibros=0;
    }
    /**
     * Metodo para agregar un libro a la estantería
     * @param agregarLibro
     */
    public boolean agregarLibro(Libro libro) {
        if(numLibros<libros.length){
            libros[numLibros]=libro;
            numLibros++;
            return true;
        }
        return false;
    }
    /**
     * Metodo para ordenar los libros por título
     * @param ordenarLibros
     */
    public void ordenarLibros(){
        for (int i = 0; i < libros.length; i++) {
            for (int j = i + 1; j < numLibros; j++) {
               if(libros[i].getTitulo().compareTo(libros[j].getTitulo())>0){
                 Libro auxiliar=libros[i];
                 libros[i]=libros[j];
                 libros[j]=auxiliar;
               }
               
            }
        }
        
    }

    public Estanteria(Libro[] libros, int numLibros) {
        this.libros = libros;
        this.numLibros = numLibros;
    }

    public Libro[] getLibros() {
        return this.libros;
    }

    public void setLibros(Libro[] libros) {
        this.libros = libros;
    }

    public int getNumLibros() {
        return this.numLibros;
    }

    public void setNumLibros(int numLibros) {
        this.numLibros = numLibros;
    }

    public Estanteria libros(Libro[] libros) {
        setLibros(libros);
        return this;
    }

    public Estanteria numLibros(int numLibros) {
        setNumLibros(numLibros);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Estanteria)) {
            return false;
        }
        Estanteria estanteria = (Estanteria) o;
        return Objects.equals(libros, estanteria.libros) && numLibros == estanteria.numLibros;
    }

    @Override
    public int hashCode() {
        return Objects.hash(libros, numLibros);
    }

    @Override
    public String toString() {
        String mensaje="";
        for (int i = 0; i < libros.length; i++) {
            if(libros[i]!=null){
                mensaje+=libros[i];
            }
        }
        return "{" +
            ", Numero de Libros='" + numLibros + "'" +
            "}/"+mensaje;
    }

}
