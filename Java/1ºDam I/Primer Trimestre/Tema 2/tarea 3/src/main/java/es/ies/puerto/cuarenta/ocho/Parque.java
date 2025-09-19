package es.ies.puerto.cuarenta.ocho;
import java.util.Objects;
/**
 * Crea una clase Parque con una lista (array) de atracciones (clase Atraccion, con las propiedades:precio, nombre). 
 * Implementa métodos para agregar y eliminar atracciones, y usa toString() para describir el parque.
 */
public class Parque {
    private int numAtracciones;
    private Atracciones[]atracciones;


    public Parque() {
        this.numAtracciones = 0;
        this.atracciones = new Atracciones[5];
    }

    public boolean addAtraccion(Atracciones atraccion){
        if(numAtracciones<atracciones.length){
            atracciones[numAtracciones]=atraccion;
            numAtracciones++;
            return true;
        }
        return false;
    }

    public boolean deleteAtraccion(Atracciones atraccion){
        for (int i = 0; i < atracciones.length; i++) {
            if(atracciones[i].equals(atraccion)){
                atracciones[i]=null;
                for (int j = i; j < atracciones.length-1; j++) {
                    atracciones[j]=atracciones[j+1];
                    atracciones[atracciones.length-1]=null;
                }
                numAtracciones--;
                return true;
            }
        }
        return false;
    }

    public Parque(int numAtracciones, Atracciones[] atracciones) {
        this.numAtracciones = numAtracciones;
        this.atracciones = atracciones;
    }

    public int getNumAtracciones() {
        return this.numAtracciones;
    }

    public void setNumAtracciones(int numAtracciones) {
        this.numAtracciones = numAtracciones;
    }

    public Atracciones[] getAtracciones() {
        return this.atracciones;
    }

    public void setAtracciones(Atracciones[] atracciones) {
        this.atracciones = atracciones;
    }

    public Parque numAtracciones(int numAtracciones) {
        setNumAtracciones(numAtracciones);
        return this;
    }

    public Parque atracciones(Atracciones[] atracciones) {
        setAtracciones(atracciones);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Parque)) {
            return false;
        }
        Parque parque = (Parque) o;
        return numAtracciones == parque.numAtracciones && Objects.equals(atracciones, parque.atracciones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numAtracciones, atracciones);
    }

    @Override
    public String toString() {
        return "{" +
            " numAtracciones='" + getNumAtracciones() + "'" +
            ", atracciones='" + getAtracciones() + "'" +
            "}";
    }
    
}
