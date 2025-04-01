package es.ies.puerto.diez.tres;

/**
 * Crea una clase Alumno con los atributos nombre, notaMatematicas, notaCiencias y notaProgramacion. Implementa un método promedio() y usa equals() para comparar alumnos por sus notas.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Alumno {
    private String nombre;
    private double notaMatematicas;
    private double notaCiencias;
    private double notaProgramacion;
    private double promedio;

    /**
     * Constructor por defecto
     */
    public Alumno() {
    }

    /**
     * Constructor general
     */
    public Alumno(String nombre, double notaMatematicas, double notaCiencias, double notaProgramacion) {
        this.nombre = nombre;
        this.notaMatematicas = notaMatematicas;
        this.notaCiencias = notaCiencias;
        this.notaProgramacion = notaProgramacion;
        this.promedio = promedio();
    }

    /**
     * Creamos los geters y seter
     */

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaMatematicas() {
        return this.notaMatematicas;
    }

    public void setNotaMatematicas(double notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }

    public double getNotaCiencias() {
        return this.notaCiencias;
    }

    public void setNotaCiencias(double notaCiencias) {
        this.notaCiencias = notaCiencias;
    }

    public double getNotaProgramacion() {
        return this.notaProgramacion;
    }

    public void setNotaProgramacion(double notaProgramacion) {
        this.notaProgramacion = notaProgramacion;
    }

    /**
     * Método para calcular el promedio de las notas
     * 
     * @return promedio de las notas
     */

    public double promedio() {
        return (this.notaMatematicas + this.notaCiencias + this.notaProgramacion) / 3;
    }

    public double getPromedio() {
        return this.promedio;
    }

    public void setPromedio(){
        this.promedio = promedio();
    }


    /**
     * Método para comparar alumnos por sus notas
     * @param o el objeto con el que se compara
     * @return true si las notas son iguales, false si no
     */

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Alumno)) {
            return false;
        }
        Alumno alumno = (Alumno) o;
        return this.getNotaMatematicas() == alumno.getNotaMatematicas() && this.getNotaCiencias() == alumno.getNotaCiencias() && this.getNotaProgramacion() == alumno.getNotaProgramacion();
    }
    
    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", notaMatematicas=" + notaMatematicas +
                ", notaCiencias=" + notaCiencias +
                ", notaProgramacion=" + notaProgramacion +
                '}';
    }
}
