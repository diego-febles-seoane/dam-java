package es.ies.puerto.Ejercicio9;

public class Empleado {
    private String nombre;
    private String puesto;
    private double salario;

    public Empleado() {

    }

    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        setPuesto(puesto);
        setSalario(salario);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        if (puesto != null && !puesto.trim().isEmpty()) {
            this.puesto = puesto;
        } else {
            System.out.println("El puesto no puede ser nulo o quedar vacío.");
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("El salario no puede ser negativo.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Empleado [Nombre: " + nombre + ", Puesto: " + puesto + ", Salario: " + salario + "]");
    }
}
