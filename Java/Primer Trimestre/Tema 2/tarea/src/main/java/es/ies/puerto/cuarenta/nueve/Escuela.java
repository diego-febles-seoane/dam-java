package es.ies.puerto.cuarenta.nueve;
import java.util.Objects;

public class Escuela {
    private int numProfesores;
    private Profesor[]profesores;

    public Escuela() {
    }

    public Escuela(int numProfesores) {
        this.numProfesores = 0;
        this.profesores = new Profesor[numProfesores];
    }

    public boolean addProfesor(Profesor profesor) {
        if (numProfesores < profesores.length) {
            profesores[numProfesores] = profesor;
            numProfesores++;
            return true;
        }
        return false;
    }
    public boolean eliminarProfesor(Profesor profesor){
        for (int i = 0; i < profesores.length; i++) {
            if(profesores[i].equals(profesor)){
                profesores[i]=null;
                for (int j = i; j < profesores.length-1; j++) {
                    profesores[j]=profesores[j+1];
                    profesores[profesores.length-1]=null;
                }
                numProfesores--;
                return true;
            }
        }
        return false;
    }
    public int getNumProfesores() {
        return this.numProfesores;
    }

    public void setNumProfesores(int numProfesores) {
        this.numProfesores = numProfesores;
    }

    public Profesor[] getProfesores() {
        return this.profesores;
    }

    public void setProfesores(Profesor[] profesores) {
        this.profesores = profesores;
    }

    public Escuela numProfesores(int numProfesores) {
        setNumProfesores(numProfesores);
        return this;
    }

    public Escuela profesores(Profesor[] profesores) {
        setProfesores(profesores);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Escuela)) {
            return false;
        }
        Escuela escuela = (Escuela) o;
        return numProfesores == escuela.numProfesores && Objects.equals(profesores, escuela.profesores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numProfesores, profesores);
    }

    @Override
    public String toString() {
        return "{" +
            " numProfesores='" + getNumProfesores() + "'" +
            ", profesores='" + getProfesores() + "'" +
            "}";
    }
    
}
