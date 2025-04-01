package es.ies.puerto.cuarenta.cuatro;
import java.util.Objects;
/**
 * Crea una clase Viaje que tenga una lista (array) de destinos (clase Destinocon las propiedades: pais, ciudad, fecha ). 
 * Implementa métodos para agregar destinos al itinerario y usa toString() para describir el viaje.
 */
public class Viaje {
    private int numDestinos;
    private Destinos[]destinos;
    /**
     * Constructor
     */
    public Viaje(){}
    /**
     * Constructor numero de destinos
     */
    public Viaje (int numDestinos){
        this.numDestinos=0;
        this.destinos=new Destinos[numDestinos];
    }
    public boolean addDestino(Destinos destino){
        if(numDestinos<destinos.length){
            destinos[numDestinos]=destino;
            numDestinos++;
            return true;
        }
        return false;
    }

    public Viaje(int numDestinos, Destinos[] destinos) {
        this.numDestinos = numDestinos;
        this.destinos = destinos;
    }

    public int getNumDestinos() {
        return this.numDestinos;
    }

    public void setNumDestinos(int numDestinos) {
        this.numDestinos = numDestinos;
    }

    public Destinos[] getDestinos() {
        return this.destinos;
    }

    public void setDestinos(Destinos[] destinos) {
        this.destinos = destinos;
    }

    public Viaje numDestinos(int numDestinos) {
        setNumDestinos(numDestinos);
        return this;
    }

    public Viaje destinos(Destinos[] destinos) {
        setDestinos(destinos);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Viaje)) {
            return false;
        }
        Viaje viaje = (Viaje) o;
        return numDestinos == viaje.numDestinos && Objects.equals(destinos, viaje.destinos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numDestinos, destinos);
    }

    @Override
    public String toString() {
        return "{" +
            " numDestinos='" + getNumDestinos() + "'" +
            ", destinos='" + getDestinos() + "'" +
            "}";
    }
    
}
