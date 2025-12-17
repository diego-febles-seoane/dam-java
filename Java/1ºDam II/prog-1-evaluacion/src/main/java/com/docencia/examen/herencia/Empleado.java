package com.docencia.examen.herencia;

import com.docencia.examen.clases.Usuario;

//TODO: Completar clase Empleado con las funciones necesarias, y documenta la clase.
public class Empleado extends Usuario {

    private String departamento;
    private double salario;

    public Empleado() {
        super();
    }

    public Empleado(String identificador) {
        super(identificador);
    }

    public Empleado(String identificador, String nombre, String apellidos,
            String departamento, double salario) {
        super(identificador, nombre, apellidos);
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "identificador='" + getIdentificador() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", apellidos='" + getApellidos() + '\'' +
                ", departamento='" + departamento + '\'' +
                ", salario=" + salario +
                '}';
    }

}
