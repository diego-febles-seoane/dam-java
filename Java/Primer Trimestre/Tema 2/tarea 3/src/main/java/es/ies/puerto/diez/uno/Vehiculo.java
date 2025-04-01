package es.ies.puerto.diez.uno;

public class Vehiculo {
    private String marca;
    private String modelo;

    /**
     * Constructor por defecto
     */
    public Vehiculo(){}

    /**
     * Constructor de vehiculo
     * @param marca del vehiculo
     * @param modelo del vehiculo
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


    @Override
    public String toString() {
        return "{" +
            " marca='" + getMarca() + "'" +
            ", modelo='" + getModelo() + "'" +
            "}";
    }


}
