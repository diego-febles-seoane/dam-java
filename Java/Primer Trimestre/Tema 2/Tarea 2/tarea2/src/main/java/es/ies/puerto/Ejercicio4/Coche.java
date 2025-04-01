package es.ies.puerto.Ejercicio4;

public class Coche {
    private String marca;
    private String modelo;
    private int anio;

    public Coche() {

    }

    public Coche(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        setAnio(anio);
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

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        if (anio >= 1886) {
            this.anio = anio;
        } else {
            System.out.println("El año no es >= 1886");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Coche [Marca: " + marca + ", Modelo: " + modelo + ", Año: " + anio + "]");
    }
}
