package es.ies.puerto.treinta.dos;
import java.util.Objects;

public class Hospital {
    private String nombre;
    private Paciente[] pacientes;
    private int numPacientes;

    /**
     * Constructor vacío por defecto
     */
    public Hospital() {
        
    }
    
    /**
     * Constructor con nombre y numero de pacientes
     * @param nombre
     * @param numPacientes
     */
    public Hospital(String nombre, int numPacientes) {
        this.nombre = nombre;
        this.pacientes = new Paciente[numPacientes];
        this.numPacientes = 0;
    }
    /**
     * Metodo para añadir un paciente a la lista
     * @param addPaciente
     */
    public boolean addPaciente(Paciente paciente) {
        if(numPacientes<pacientes.length){
            pacientes[numPacientes]=paciente;
            numPacientes++;return true;
        }
        return false;
    }
    /**
     * Metodo para eliminar un paciente de la lista
     * @param eliminarPaciente
     */
    public boolean eliminarPaciente(Paciente paciente) {
        for (int i = 0; i < pacientes.length; i++) {
            if(pacientes[i].equals(paciente)){
                pacientes[i]=null;
                for (int j = i; j < pacientes.length-1; j++) {
                    pacientes[j]=pacientes[j+1];
                    pacientes[pacientes.length-1]=null;
                }
                numPacientes--;
                return true;
            }
        }
        return false;
    }

    public Hospital(String nombre, Paciente[] pacientes, int numPacientes) {
        this.nombre = nombre;
        this.pacientes = pacientes;
        this.numPacientes = numPacientes;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Paciente[] getPacientes() {
        return this.pacientes;
    }

    public void setPacientes(Paciente[] pacientes) {
        this.pacientes = pacientes;
    }

    public int getNumPacientes() {
        return this.numPacientes;
    }

    public void setNumPacientes(int numPacientes) {
        this.numPacientes = numPacientes;
    }

    public Hospital nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Hospital pacientes(Paciente[] pacientes) {
        setPacientes(pacientes);
        return this;
    }

    public Hospital numPacientes(int numPacientes) {
        setNumPacientes(numPacientes);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Hospital)) {
            return false;
        }
        Hospital hospital = (Hospital) o;
        return Objects.equals(nombre, hospital.nombre) && Objects.equals(pacientes, hospital.pacientes) && numPacientes == hospital.numPacientes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, pacientes, numPacientes);
    }

    @Override
    public String toString() {
        String mensaje="";
        for (int i = 0; i < pacientes.length; i++) {
           
                mensaje+=pacientes[i];
           
        }
        return "{" +
            " Nombre del hospital:'" + nombre + "'" +
            ", Numero de Pacientes='" + numPacientes + "'" +
            "}"+mensaje;
    }
    

}
