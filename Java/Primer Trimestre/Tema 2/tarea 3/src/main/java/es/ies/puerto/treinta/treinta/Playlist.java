package es.ies.puerto.treinta.treinta;
import java.util.Objects;
/**
 * Crea una clase Playlist que almacene una lista(array) de canciones (clase Cancion). 
 * Implementa métodos para agregar, eliminar y listar canciones. Usa toString() para mostrar la lista.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Playlist {
    private Cancion[] canciones;
    private int numCanciones;
    /**
     * Método constructor vacío por defecto
     */
    public Playlist() {}
    /**
     * Método constructor 
     */
    public Playlist(int numCanciones) {
        this.canciones=new Cancion[numCanciones];
        this.numCanciones=0;
    }
    /**
     * Metodo para agregar una cancion a la playlist
     * @param addCancion
     */
    public boolean addCancion(Cancion cancion){
        if(numCanciones<canciones.length){
            canciones[numCanciones]=cancion;
            numCanciones++;
            return true;
        }
        return false;
    }
    /**
     * Metodo para eliminar
     * @param eliminarCancion
     */
    public boolean eliminarCancion(Cancion cancion){
        for (int i = 0; i < canciones.length; i++) {
            if(canciones[i].equals(cancion)){
               canciones[i]=null;
               for (int j = i; j < canciones.length-1; j++) {
                    canciones[j]=canciones[j+1];
                    canciones[canciones.length-1]=null;
               }
               numCanciones--;
               return true;
                }
            
            }
        
        return false;
    }

    public Playlist(Cancion[] canciones, int numCanciones) {
        this.canciones = canciones;
        this.numCanciones = numCanciones;
    }

    public Cancion[] getCanciones() {
        return this.canciones;
    }

    public void setCanciones(Cancion[] canciones) {
        this.canciones = canciones;
    }

    public int getNumCanciones() {
        return this.numCanciones;
    }

    public void setNumCanciones(int numCanciones) {
        this.numCanciones = numCanciones;
    }

    public Playlist canciones(Cancion[] canciones) {
        setCanciones(canciones);
        return this;
    }

    public Playlist numCanciones(int numCanciones) {
        setNumCanciones(numCanciones);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Playlist)) {
            return false;
        }
        Playlist playlist = (Playlist) o;
        return Objects.equals(canciones, playlist.canciones) && numCanciones == playlist.numCanciones;
    }

    @Override
    public int hashCode() {
        return Objects.hash(canciones, numCanciones);
    }

    @Override
    public String toString() {
        String mensaje="";
        for (int i = 0; i < canciones.length; i++) {
         
                mensaje+=canciones[i];
            
        }
        return "{" +
            " numCanciones='" + getNumCanciones() + "'" +
            "}"+mensaje;
    }
    
}
