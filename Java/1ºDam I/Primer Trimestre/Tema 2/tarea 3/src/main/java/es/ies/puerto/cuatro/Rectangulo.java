package es.ies.puerto.cuatro;
import java.util.Objects;
/**
 * Crea una clase Rectangulo con atributos ancho y alto. Implementa los métodos area() y perimetro(). 
 * Sobrescribe equals() para comparar rectángulos por sus dimensiones y toString() para describir el rectángulo.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Rectangulo {
    private float ancho;
    private float alto;

    /**
     * Constructor vacio por defecto
     */
    public Rectangulo() {
    }

    /**
     * Constructor para crear un rectángulo con un ancho y alto
     * @param ancho
     * @param alto
     */

     public Rectangulo(float ancho, float alto) {
        this.ancho = ancho;
        this.alto = alto;
    }


    public float getAncho() {
        return this.ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getAlto() {
        return this.alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }
    public float area() {
        return this.ancho * this.alto;
    }

    public float perimetro() {
        return 2 * (this.ancho + this.alto);
    }
     @Override
    public String toString() {
        return "{" +
            " Ancho='" + getAncho() + "'" +
            ", Alto='" + getAlto() + "'" +
            "}";
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Rectangulo)) {
            return false;
        }
        Rectangulo rectangulo = (Rectangulo) o;
        return ancho == rectangulo.ancho && alto == rectangulo.alto;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ancho, alto);
    }
    
    
}
