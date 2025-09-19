package es.ies.puerto.tres;

/**
 * Define la clase Coche con atributos marca, modelo, año y velocidad. Incluye métodos acelerar() y frenar(), que modifiquen la velocidad. Usa getters y setters para controlar el acceso a los atributos.
 * @author diego-febles-seoane
 * @version 1.0.0
 */

public class Coche {
    private String marca;
    private String modelo;
    private float velocidad;
    private int anio;

    /**
     * Constructor por defecto
     * 
     */
    public Coche() {
    }

    /**
     * Constructor general
     * 
     * @param marca       de el producto
     * @param modelo   de el producto
     * @param velocidad   de el producto
     * @param anio de el producto
     */

    public Coche(String marca, String modelo, float velocidad, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.anio = anio;
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

    public double getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void acelerar() {
        this.velocidad += 50;
    }

    public void frenar(){
        this.velocidad -= 80;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidad=" + velocidad +
                ", anio=" + anio +
                '}';
    }

}
