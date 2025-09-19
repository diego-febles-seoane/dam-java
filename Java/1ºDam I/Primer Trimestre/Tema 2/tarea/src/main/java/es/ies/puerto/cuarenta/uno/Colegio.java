package es.ies.puerto.cuarenta.uno;
import java.util.Objects;
/**
 * Crea una clase Colegio que almacene una lista (array) de estudiantes. 
 * Implementa métodos para agregar y eliminar estudiantes, y usa toString() para mostrar los detalles del colegio.
 * @author emsantamaria
 * @version 1.0.0
 */
public class Colegio {
    private int numEstudiantes;
    private Estudiante[] estudiantes;
    /**
     * Constructor
     */
    public Colegio (){}
    /**
     * Constructor
     */
    public Colegio(int numEstudiantes){
        this.numEstudiantes=0;
        this.estudiantes=new Estudiante[numEstudiantes];
    }
    /**
     * Añadir el estudiante
     * @param addEstudiante
     */
    public boolean addEstudiante(Estudiante estudiante){
        if(numEstudiantes<estudiantes.length){
            estudiantes[numEstudiantes]=estudiante;
            numEstudiantes++;
            return true;
        }
        return false;
    }
    /**
     * Eliminar el estudiante
     * @param eliminarEstudiante
     */ 
    public boolean eliminarEstudiante(Estudiante estudiante){
        for (int i = 0; i < estudiantes.length; i++) {
            if(estudiantes[i].equals(estudiante)){
                for (int j = i; j < estudiantes.length-1; j++) {
                    estudiantes[j]=estudiantes[j+1];
                }
                numEstudiantes--;
                return true;
            }
        }
        return false;
    }

    public Colegio(int numEstudiantes, Estudiante[] estudiantes) {
        this.numEstudiantes = numEstudiantes;
        this.estudiantes = estudiantes;
    }

    public int getNumEstudiantes() {
        return this.numEstudiantes;
    }

    public void setNumEstudiantes(int numEstudiantes) {
        this.numEstudiantes = numEstudiantes;
    }

    public Estudiante[] getEstudiantes() {
        return this.estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Colegio numEstudiantes(int numEstudiantes) {
        setNumEstudiantes(numEstudiantes);
        return this;
    }

    public Colegio estudiantes(Estudiante[] estudiantes) {
        setEstudiantes(estudiantes);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Colegio)) {
            return false;
        }
        Colegio colegio = (Colegio) o;
        return numEstudiantes == colegio.numEstudiantes && Objects.equals(estudiantes, colegio.estudiantes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numEstudiantes, estudiantes);
    }

    @Override
    public String toString() {
        String mensaje="";
        for (int i = 0; i < estudiantes.length; i++) {
            if(estudiantes[i]!=null){
                mensaje+=estudiantes[i];
            }
        }
        return "{" +
            " numEstudiantes='" + getNumEstudiantes() + "'" +
            "}"+mensaje;
    }
    
}
