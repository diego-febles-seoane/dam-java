package es.ies.puerto.veinte.siete;
import java.util.Objects;
/**
 * Define una clase Planeta con atributos nombre, masa, y radio. 
 * Implementa métodos para calcular la gravedad en la superficie del planeta. 
 * Usa toString() para describir el planeta.
 * @author emsantamaria
 * @version 1.0.0
 */
public class Planeta {
    private String nombre;
    private float masa;
    private float radio;
    /**
     * Constructor vacio por defecto
     */
    public Planeta() {}
    /**
     * Constructor con parámetros
     * @param nombre nombre del planeta
     * @param masa masa del planeta
     * @param radio radio del planeta
     */
    public Planeta(String nombre, float masa, float radio) {
        this.nombre = nombre;
        this.masa = masa;
        this.radio = radio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getMasa() {
        return this.masa;
    }

    public void setMasa(float masa) {
        this.masa = masa;
    }

    public float getRadio() {
        return this.radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public Planeta nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Planeta masa(float masa) {
        setMasa(masa);
        return this;
    }

    public Planeta radio(float radio) {
        setRadio(radio);
        return this;
    }
    /**
     * Metodo para calcular la gravedad en la superficie del planeta
     * @param gravedad
     */
    public float gravedad(){
        return (float)((masa*Math.pow(6.674, -11))/Math.pow(radio, 2));
    }
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Planeta)) {
            return false;
        }
        Planeta planeta = (Planeta) o;
        return Objects.equals(nombre, planeta.nombre) && masa == planeta.masa && radio == planeta.radio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, masa, radio);
    }

    @Override
    public String toString() {
        return "Nuevo planeta descubierto{" +
            " Nombre:'" + getNombre() + "'" +
            ", Masa:'" + getMasa() + "'" +
            ", Radio:'" + getRadio() + "'" +
            "}";
    }
    
}
