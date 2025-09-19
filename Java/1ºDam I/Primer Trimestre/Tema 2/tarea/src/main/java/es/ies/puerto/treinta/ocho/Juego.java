package es.ies.puerto.treinta.ocho;
import java.util.Objects;
/**
 * Crea una clase Juego que almacene una lista (array) de jugadores (clase Jugador). 
 * Implementa métodos para agregar y eliminar jugadores, y usar toString() para mostrar los detalles del juego.
 * @author emsantamria
 * @version 1.0.0
 */
public class Juego {
    private int numJugadores;
    private Jugador[] jugadores;
    /**
     * Constructor vacio por defecto
     */
    public Juego(){}
    /**
     * Constructor con numero de jugadores 
     * @param numJugadores
     */
    public Juego(int numJugadores){
        this.numJugadores=0;
        this.jugadores=new Jugador[numJugadores];
    }
    /**
     * Metodo para añadir jugadores al juego
     * @param addJugadores
     */
    public boolean addJugadores(Jugador jugador){
        if(numJugadores<jugadores.length){
            jugadores[numJugadores]=jugador;
            numJugadores++;
            return true;
        }
        return false;
    }
    /**
     * Metodo para eliminar jugadores
     * @param deleteJugador
     */
    public boolean deleteJugador(Jugador jugador){
        for (int i = 0; i < jugadores.length; i++) {
            if(jugadores[i].equals(jugador)){
                jugadores[i]=null;
                for (int j = i; j < jugadores.length-1; j++) {
                    jugadores[j]=jugadores[j+1];
                    jugadores[jugadores.length-1]=null;
                }
            }
            numJugadores--;
            return true;
        }
        return false;
    }

    public Juego(int numJugadores, Jugador[] jugadores) {
        this.numJugadores = numJugadores;
        this.jugadores = jugadores;
    }

    public int getNumJugadores() {
        return this.numJugadores;
    }

    public void setNumJugadores(int numJugadores) {
        this.numJugadores = numJugadores;
    }

    public Jugador[] getJugadores() {
        return this.jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    public Juego numJugadores(int numJugadores) {
        setNumJugadores(numJugadores);
        return this;
    }

    public Juego jugadores(Jugador[] jugadores) {
        setJugadores(jugadores);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Juego)) {
            return false;
        }
        Juego juego = (Juego) o;
        return numJugadores == juego.numJugadores && Objects.equals(jugadores, juego.jugadores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numJugadores, jugadores);
    }

    @Override
    public String toString() {
        String mensaje="";
        for (int i = 0; i < jugadores.length; i++) {
            if(jugadores[i]!=null){
            mensaje+=jugadores[i];
            }
        }
        return "{" +
            " numJugadores='" + getNumJugadores() + "'" +
            "}"+mensaje;
    }
    
}
