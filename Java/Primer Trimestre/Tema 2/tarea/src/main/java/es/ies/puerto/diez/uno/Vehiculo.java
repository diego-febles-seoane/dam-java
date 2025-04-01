package es.ies.puerto.diez.uno;
import java.util.Objects;
/**
 * Define una clase base Vehiculo con atributos marca y modelo. Usa toString() para describir el vehículo.
 * @author emsantamaria
 * @version 1.0.0
 */
public class Vehiculo {
    private String marca;
    private String modelo;

    /**
     * Constructor por defecto
     */

     public Vehiculo() {
    }
    
    /**
     * Constructor con parámetros
     * @param marca Marca del vehículo
     * @param modelo Modelo del vehículo
     */

     public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
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

    public Vehiculo marca(String marca) {
        setMarca(marca);
        return this;
    }

    public Vehiculo modelo(String modelo) {
        setModelo(modelo);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Vehiculo)) {
            return false;
        }
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(marca, vehiculo.marca) && Objects.equals(modelo, vehiculo.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo);
    }

    @Override
    public String toString() {
        return "{" +
            " Marca:'" + getMarca() + "'" +
            ", Modelo:'" + getModelo() + "'" +
            "}";
    }
    
}
