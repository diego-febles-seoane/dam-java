package es.ies.puerto.treinta.nueve;
import java.util.Objects;
/**
 * Crea una clase Tienda que almacene una lista (array) de artículos (clase Articulo ejercicio 22). 
 * Implementa métodos para agregar y eliminar artículos y usar toString() para mostrar los detalles de la tienda.
 * @author emsantamaria
 * @version 1.0.0
 */
public class Tienda {
    private int numArticulos;
    private Articulo[]articulos;
    /**
     * Constructor vacio por defecto
     */
    public Tienda(){}
    /**
     * Constructor con numero de articulos
     * @param numArticulos
     */
    public Tienda(int numArticulos){
        this.numArticulos=0;
        this.articulos=new Articulo[numArticulos];
    }
    /**
     * Metodo para añadir articulos
     * @param addArticulo
     */
    public boolean addArticulo(Articulo articulo){
        for (int i = 0; i < articulos.length; i++) {
             if(numArticulos<articulos.length){
                articulos[numArticulos]=articulo;
                numArticulos++;
                return true;
             }
        }
        return false;
    }
    /**
     * Metodo para eliminar articulos
     * @param deleteArticulo
     */
    public boolean deleteArticulo(Articulo articulo){
        for (int i = 0; i < articulos.length; i++) {
            if(articulos[i].equals(articulo)){
                articulos[i]=null;
                for(int j=i; j<articulos.length-1;j++){
                    articulos[j]=articulos[j+1];
                    articulos[articulos.length-1]=null;
                }
            numArticulos--;
            return true;
            }
        }
        return false;
    }
    public Tienda(int numArticulos, Articulo[] articulos) {
        this.numArticulos = numArticulos;
        this.articulos = articulos;
    }

    public int getNumArticulos() {
        return this.numArticulos;
    }

    public void setNumArticulos(int numArticulos) {
        this.numArticulos = numArticulos;
    }

    public Articulo[] getArticulos() {
        return this.articulos;
    }

    public void setArticulos(Articulo[] articulos) {
        this.articulos = articulos;
    }

    public Tienda numArticulos(int numArticulos) {
        setNumArticulos(numArticulos);
        return this;
    }

    public Tienda articulos(Articulo[] articulos) {
        setArticulos(articulos);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Tienda)) {
            return false;
        }
        Tienda tienda = (Tienda) o;
        return numArticulos == tienda.numArticulos && Objects.equals(articulos, tienda.articulos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numArticulos, articulos);
    }

    @Override
    public String toString() {
        String mensaje = "";
        for (int i = 0; i < articulos.length; i++) {
            mensaje+=articulos[i];
        }
        return "{" +
            " numArticulos='" + getNumArticulos() + "'" +
            "}"+mensaje;
    }
    
}
