package es.ies.puerto.tre;
/**
 * Define la clase Coche con atributos marca, modelo, año y velocidad. Incluye métodos acelerar() y frenar(), que modifiquen la velocidad. 
 * Usa getters y setters para controlar el acceso a los atributos.
 * @author emsantamaria
 * @version 1.0.0
 */
public class Coche {
    private String marca;
    private String modelo;
    private int año;
    private float velocidad;

    /**
     * Constructor vacio por defecto
     */
    public Coche() {
    }

    /**
     * Constructor para
     * @param marca
     * @param modelo
     * @param año
     * @param velocidad
     */
    public Coche(String marca, String modelo, int año, float velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.velocidad = velocidad;
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

    public int getAño() {
        return this.año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public float getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * Acelera el coche en un incremento de 5 km/h
     * @param acelerar
     */
    public void acelerar(float acelerar) {
        this.velocidad += acelerar;
    }

    /**
     * Frena el coche en un decremento de 5 km/h
     * @param frenar
     */
    public void frenar(float frenar) {
        this.velocidad -= frenar;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "Marca='" + marca + '\'' +
                ", Modelo='" + modelo + '\'' +
                ", Año=" + año +
                ", Velocidad=" + velocidad +
                '}';
    }
}

    