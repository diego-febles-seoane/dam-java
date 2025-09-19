package es.ies.puerto.cuarenta.CINCUENTA;

import es.ies.puerto.treinta.dos.Paciente;
import java.util.Objects;

public class Hospital {
    private int numMedicos;
    private int numPacientes;
    private Medicos[]medicos;
    private Pacientes[]pacientes;
    public Hospital(int numPacientes,int numMedicos){
        this.numMedicos=0;
        this.numPacientes=0;
        this.pacientes=new Pacientes[numPacientes];
        this.medicos=new Medicos[numMedicos];
    }
    public boolean addPaciente(Pacientes paciente){
        if(numPacientes>=pacientes.length){
            return false;
        }
        pacientes[numPacientes]=paciente;
        numPacientes++;
        return true;
    }
    public boolean addMedico(Medicos medico){
        if(numMedicos>=medicos.length){
            return false;
        }
        medicos[numMedicos]=medico;
        numMedicos++;
        return true;
    }
    public boolean deletePaciente(Pacientes paciente){
        for (int i = 0; i < pacientes.length; i++) {
            if(pacientes[i].equals(paciente)){
                pacientes[i]=null;
                for (int j = i; j < pacientes.length-1; j++) {
                    pacientes[j]=pacientes[j+1];
                }
                numPacientes--;
                return true;
            }
        }
        return false;
    }
    public boolean deleteMedicos(Pacientes medico){
        for (int i = 0; i < medicos.length; i++) {
            if(medicos[i].equals(medico)){
                medicos[i]=null;
                for (int j = i; j < medicos.length-1; j++) {
                    medicos[j]=medicos[j+1];
                    medicos[medicos.length-1]=null;
                }
                numMedicos--;
                return true;
            }
        }
        return false;
    }

    public Hospital() {
    }

    public Hospital(int numMedicos, int numPacientes, Medicos[] medicos, Pacientes[] pacientes) {
        this.numMedicos = numMedicos;
        this.numPacientes = numPacientes;
        this.medicos = medicos;
        this.pacientes = pacientes;
    }

    public int getNumMedicos() {
        return this.numMedicos;
    }

    public void setNumMedicos(int numMedicos) {
        this.numMedicos = numMedicos;
    }

    public int getNumPacientes() {
        return this.numPacientes;
    }

    public void setNumPacientes(int numPacientes) {
        this.numPacientes = numPacientes;
    }

    public Medicos[] getMedicos() {
        return this.medicos;
    }

    public void setMedicos(Medicos[] medicos) {
        this.medicos = medicos;
    }

    public Pacientes[] getPacientes() {
        return this.pacientes;
    }

    public void setPacientes(Pacientes[] pacientes) {
        this.pacientes = pacientes;
    }

    public Hospital numMedicos(int numMedicos) {
        setNumMedicos(numMedicos);
        return this;
    }

    public Hospital numPacientes(int numPacientes) {
        setNumPacientes(numPacientes);
        return this;
    }

    public Hospital medicos(Medicos[] medicos) {
        setMedicos(medicos);
        return this;
    }

    public Hospital pacientes(Pacientes[] pacientes) {
        setPacientes(pacientes);
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
        return numMedicos == hospital.numMedicos && numPacientes == hospital.numPacientes && Objects.equals(medicos, hospital.medicos) && Objects.equals(pacientes, hospital.pacientes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numMedicos, numPacientes, medicos, pacientes);
    }

    @Override
    public String toString() {
        return "{" +
            " numMedicos='" + getNumMedicos() + "'" +
            ", numPacientes='" + getNumPacientes() + "'" +
            ", medicos='" + getMedicos() + "'" +
            ", pacientes='" + getPacientes() + "'" +
            "}";
    }
    
}
