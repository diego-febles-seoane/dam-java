package es.ies.puerto.once;
import java.util.Objects;

public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;


    public Vehiculo(){}

    public Vehiculo(String matricula){
        this.matricula = matricula;
    }

    public Vehiculo (String marca, String modelo, String matricula){
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }


    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }



    @Override
    public String toString() {
        return "{" +
            " matricula='" + getMatricula() + "'" +
            ", marca='" + getMarca() + "'" +
            ", modelo='" + getModelo() + "'" +
            "}";
    }
    



    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Vehiculo)) {
            return false;
        }
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(matricula, vehiculo.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula, marca, modelo);
    }
    
    

}
