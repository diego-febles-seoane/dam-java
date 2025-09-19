package es.ies.puerto.cuarenta.dos;
import java.util.Objects;
/**
 * Crea una clase Cine que almacene una lista (array) de proyecciones (clase Proyeccion, clase con propiedades: ciudad, hora, y fecha). 
 * Implementa métodos para agregar y eliminar proyecciones, y usa toString() para mostrar los detalles del cine.
 * @author emsantamaria
 * @version 1.0.0
 */
public class Proyecciones {
   private int numProyecciones;
   private Proyeccion[] proyecciones;
   public Proyecciones(){}
   public Proyecciones(int numProyecciones){
    this.numProyecciones=0;
    this.proyecciones=new Proyeccion[numProyecciones];
   }
   public boolean addProyeccion(Proyeccion proyeccion){
    if(numProyecciones<proyecciones.length){
        for (int i = 0; i < proyecciones.length; i++) {
            proyecciones[numProyecciones]=proyeccion;
            numProyecciones++;
            return true;
        }
    }
    return false;
   }
   public boolean eliminarProyeccion(Proyeccion proyeccion){
    for (int i = 0; i < proyecciones.length; i++) {
        if(proyecciones[i].equals(proyeccion)){
            proyecciones[i]=null;
            for (int j = i; j < proyecciones.length-1; j++) {
                proyecciones[j]=proyecciones[j+1];
                proyecciones[proyecciones.length-1]=null;
            }
            numProyecciones--;
            return true;
        }
    }
    return false;
   }

    public Proyecciones(int numProyecciones, Proyeccion[] proyecciones) {
        this.numProyecciones = numProyecciones;
        this.proyecciones = proyecciones;
    }

    public int getNumProyecciones() {
        return this.numProyecciones;
    }

    public void setNumProyecciones(int numProyecciones) {
        this.numProyecciones = numProyecciones;
    }

    public Proyeccion[] getProyecciones() {
        return this.proyecciones;
    }

    public void setProyecciones(Proyeccion[] proyecciones) {
        this.proyecciones = proyecciones;
    }

    public Proyecciones numProyecciones(int numProyecciones) {
        setNumProyecciones(numProyecciones);
        return this;
    }

    public Proyecciones proyecciones(Proyeccion[] proyecciones) {
        setProyecciones(proyecciones);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Proyecciones)) {
            return false;
        }
        Proyecciones proyecciones = (Proyecciones) o;
        return numProyecciones == proyecciones.numProyecciones && Objects.equals(proyecciones, proyecciones.proyecciones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numProyecciones, proyecciones);
    }

    @Override
    public String toString() {
        String mensaje="";
        for (int i = 0; i < proyecciones.length; i++) {
            if(proyecciones[i]!=null){
                mensaje+=proyecciones[i];
            }
        }
        return "{" +
            " numProyecciones='" + getNumProyecciones() + "'" +
            "}"+mensaje;
    }
   
}
