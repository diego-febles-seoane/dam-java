package es.ies.puerto.treinta.dos;

public class Ejercicio32 {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("MArio cd", 6);
        Paciente paciente1 = new Paciente("Juan", "37f86f46fgu3", 30);
        Paciente paciente2 = new Paciente("Perdo", "23u7489h", 20);
        Paciente paciente3 = new Paciente("Maria", "12g489f", 40);
        Paciente paciente4 = new Paciente("Luis", "78h49g", 35);
        hospital.addPaciente(paciente1);
        hospital.addPaciente(paciente2);
        hospital.addPaciente(paciente3);
        hospital.eliminarPaciente(paciente1);
        
        hospital.addPaciente(paciente4);
        System.out.println(hospital);
    }
}
