package es.ies.puerto.diez.ocho;
import java.util.Objects;
/**
 * Define una clase Circulo con el atributo radio. Implementa los métodos area() y perimetro(). Usa equals() para comparar círculos por su radio.
 * @author emsantamaria
 * @version 1.0.0
 */
public class Circulo {
    private float radio;

    /**
     * Constructor vacío por defecto
     */
    public Circulo() {
    }
    /**
     * Constructor con el radio
     * @param radio;
     */
    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return this.radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public Circulo radio(float radio) {
        setRadio(radio);
        return this;
    }

    public float area(){
        return (float) (Math.PI * Math.pow(radio, 2));
    }
    public float perimetro(){
        return (float) (2 * Math.PI * radio);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Circulo)) {
            return false;
        }
        Circulo circulo = (Circulo) o;
        return radio == circulo.radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
            " Radio='" + getRadio() + "'" +
            "}";
    }
    
}
