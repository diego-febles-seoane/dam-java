package com.docencia.examen.herencia;

//TODO: Completar clase Directivo con las funciones necesarias, y documenta la clase.
public class Directivo extends Empleado {

    private String categoria;
    private double complemento;

    public Directivo() {
        super();
    }

    public Directivo(String identificador) {
        super(identificador);
    }

    public Directivo(String identificador,
            String nombre,
            String apellidos,
            String departamento,
            double salario,
            String categoria,
            double complemento) {
        super(identificador, nombre, apellidos, departamento, salario);
        this.categoria = categoria;
        this.complemento = complemento;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getComplemento() {
        return complemento;
    }

    // TODO: devuelve el salario total (salario base + complemento)
    public double getSalarioTotal() {
        return getSalario() + complemento;
    }

    @Override
    public String toString() {
        return "Directivo{" +
                "identificador='" + getIdentificador() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", apellidos='" + getApellidos() + '\'' +
                ", departamento='" + getDepartamento() + '\'' +
                ", salarioBase=" + getSalario() +
                ", categoria='" + categoria + '\'' +
                ", complemento=" + complemento +
                ", salarioTotal=" + getSalarioTotal() +
                '}';
    }

}
