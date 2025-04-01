package es.ies.puerto.treinta.cuatro;
import java.util.Objects;
/**
 * Crea una clase Restaurante con una lista (array) de platos (clase Plato). 
 * Implementa métodos para agregar y eliminar platos del menú y usar toString() para mostrar los detalles del restaurante.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Menu {
    private int numPlatos;
    private Plato[] platos;

    /**
     * Constructor vacio por defecto
     */
    public Menu() {
        numPlatos = 0;
        platos = new Plato[numPlatos];
    }
    
    /**
     * Añade un plato al menú
     * @param addPlato
     */
    public boolean addPlato(Plato plato){
        if(numPlatos<platos.length){
            platos[numPlatos]=plato;
            numPlatos++;
            return true;
        }
        return false;
    }
    
    /**
     * Elimina un plato del menú
     * @param removePlato
     */
    public boolean removePlato(Plato plato){
        for (int i = 0; i < platos.length-1; i++) {
            if(platos[i].equals(plato)){
                platos[i]=null;
                numPlatos--;
                for (int j = i; j < platos.length-1; j++) {
                    platos[j]=platos[j+1];
                    platos[platos.length-1]=null;
                }
            }
            return true;
        }
        return false;
    }

    public Menu(int numPlatos, Plato[] platos) {
        this.numPlatos = numPlatos;
        this.platos = platos;
    }

    public int getNumPlatos() {
        return this.numPlatos;
    }

    public void setNumPlatos(int numPlatos) {
        this.numPlatos = numPlatos;
    }

    public Plato[] getPlatos() {
        return this.platos;
    }

    public void setPlatos(Plato[] platos) {
        this.platos = platos;
    }

    public Menu numPlatos(int numPlatos) {
        setNumPlatos(numPlatos);
        return this;
    }

    public Menu platos(Plato[] platos) {
        setPlatos(platos);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Menu)) {
            return false;
        }
        Menu menu = (Menu) o;
        return numPlatos == menu.numPlatos && Objects.equals(platos, menu.platos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numPlatos, platos);
    }

    @Override
    public String toString() {
        String mensaje="";
        for (int i = 0; i < platos.length-1; i++) {
            if(platos[i]!=null){
                mensaje+=platos[i];
            }
        }
        return "{" +
            " numPlatos='" + getNumPlatos() + "'" +
            "}"+mensaje;
    }
    
}
