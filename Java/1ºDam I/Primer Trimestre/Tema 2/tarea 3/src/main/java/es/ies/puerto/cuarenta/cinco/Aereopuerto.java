package es.ies.puerto.cuarenta.cinco;
import java.util.Objects;
/**
 * Crea una clase Aeropuerto que almacene una lista (array) de vuelos (clase Vuelo, con las propiedades: aerolinea, fecha, numero). 
 * Implementa métodos para agregar y eliminar vuelos, y usa toString() para mostrar los detalles del aeropuerto.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Aereopuerto {
    private int numVuelos;
    private Vuelo[]vuelos;
    public Aereopuerto(){}
    public Aereopuerto(int numVuelos){
        this.numVuelos=0;
        this.vuelos=new Vuelo[numVuelos];
    }
    public boolean addVuelo(Vuelo vuelo){
        if(numVuelos<vuelos.length){
            vuelos[numVuelos]=vuelo;
            numVuelos++;
            return true;
        }
        return false;
    }

    public Aereopuerto(int numVuelos, Vuelo[] vuelos) {
        this.numVuelos = numVuelos;
        this.vuelos = vuelos;
    }

    public int getNumVuelos() {
        return this.numVuelos;
    }

    public void setNumVuelos(int numVuelos) {
        this.numVuelos = numVuelos;
    }

    public Vuelo[] getVuelos() {
        return this.vuelos;
    }

    public void setVuelos(Vuelo[] vuelos) {
        this.vuelos = vuelos;
    }

    public Aereopuerto numVuelos(int numVuelos) {
        setNumVuelos(numVuelos);
        return this;
    }

    public Aereopuerto vuelos(Vuelo[] vuelos) {
        setVuelos(vuelos);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Aereopuerto)) {
            return false;
        }
        Aereopuerto aereopuerto = (Aereopuerto) o;
        return numVuelos == aereopuerto.numVuelos && Objects.equals(vuelos, aereopuerto.vuelos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numVuelos, vuelos);
    }

    @Override
    public String toString() {
        String mensaje = "";
        for (int i = 0; i < vuelos.length; i++) {
            if(vuelos[i]!=null){
                mensaje+=vuelos[i];
            }
        }
        return "{" +
            " numVuelos='" + getNumVuelos() + "'" +
mensaje+
            "}";
    }



}
