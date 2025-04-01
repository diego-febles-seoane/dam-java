package es.ies.puerto.Ejercicio13;

public class Alumno {
    private String nombre;
    private int nota;

    public Alumno() {

    }

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return this.nota;
    }

    public void calificacion(int nota) {
        if (nota >= 5) {
            System.out.println("Aprobado/a");
        } else {
            System.out.println("Suspendido/a");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + " Nota: " + nota);
    }

    public void verificacion(int nota) {
        if (nota > 10) {
            System.out.println("No es posible sacar más de una 10");
        } else {
            this.nota = nota;
        }
    }
}
