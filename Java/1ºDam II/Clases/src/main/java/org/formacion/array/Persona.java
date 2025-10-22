package org.formacion.array;
import java.util.Objects;

public class Persona {
    private String identificador;
    private String nombre;
    private int edad;
    private String apellido1;
    private String apellido2;
    private String fechaNacimiento;

    /**
     * Constructor por defecto
     */
    public Persona() {
    }


    /**
     * Constructor de la clase persona
     * @param identificador parametro de identificacion de la clase
     */
    public Persona(String identificador) {
        this.identificador = identificador;
    }  

    /**
     * Constructor de la clase persona
     * @param identificador parametro de identificacion
     * @param nombre nombre de la persona
     * @param edad edad de la persona
     * @param apellido1 primer apellido de la persona 
     * @param apellido2 segundo apellido de la persona
     * @param fechaNacimiento fecha de nacimiento de la persona
     */
    public Persona(String identificador, String nombre, int edad, String apellido1, String apellido2, String fechaNacimiento) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.edad = edad;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNacimiento = fechaNacimiento;
    }
    


    public String getIdentificador() {
        return this.identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellido1() {
        return this.apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return this.apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Persona)) {
            return false;
        }
        Persona persona = (Persona) o;
        return Objects.equals(identificador, persona.identificador);
    }
    


    @Override
    public String toString() {
        return "{" +
            " identificador='" + getIdentificador() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", edad='" + getEdad() + "'" +
            ", apellido1='" + getApellido1() + "'" +
            ", apellido2='" + getApellido2() + "'" +
            ", fechaNacimiento='" + getFechaNacimiento() + "'" +
            "}";
    }
    

    


    


}
