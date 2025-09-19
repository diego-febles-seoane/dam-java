package es.ies.puerto.Ejercicio18;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int combustible;

    public Vehiculo() {

    }

    public Vehiculo(String marca, String modelo, int combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.combustible = combustible;
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

    public int getCombustible() {
        return this.combustible;
    }

    public void setCombustible(int combustible) {
        if (combustible < 0) {
            this.combustible = 0;
        } else {
            this.combustible = combustible;
        }
    }

    @Override
    public String toString() {
        return "{" +
                " marca='" + getMarca() + "'" +
                ", modelo='" + getModelo() + "'" +
                ", combustible='" + getCombustible() + "'" +
                "}";
    }

    // Método para agregar combustible
    public void agregarCombustible(int litros) {
        if (litros < 0) {
            System.out.println("No se puede agregar una cantidad negativa");
        } else {
            this.combustible += combustible;
        }
    }
}
