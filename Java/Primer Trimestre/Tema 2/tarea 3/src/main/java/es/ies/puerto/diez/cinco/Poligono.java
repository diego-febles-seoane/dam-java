package es.ies.puerto.diez.cinco;
import java.util.Objects;
/**
 * Crea una clase Poligono con un método area(). Implementa los métodos toString()y equals.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Poligono {
    private float perimetro;
    private float ap;

    /**
     * Constructor vacio por defecto
     */
    public Poligono() {
    }
    /**
     *Constructor que recibe el apotema y el perimetro
     * @param ap El apotema del poligono
     * @param perimetro El perimetro del poligono
     */
    public Poligono(float ap, float perimetro) {
        this.ap = ap;
        this.perimetro = perimetro;
    }

    public float getPerimetro() {
        return this.perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    public float getAp() {
        return this.ap;
    }

    public void setAp(float ap) {
        this.ap = ap;
    }

    public Poligono perimetro(float perimetro) {
        setPerimetro(perimetro);
        return this;
    }

    public Poligono ap(float ap) {
        setAp(ap);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Poligono)) {
            return false;
        }
        Poligono poligono = (Poligono) o;
        return perimetro == poligono.perimetro && ap == poligono.ap;
    }
    /**
     * Metodo para calcular el area de un poligono regular
     * @param area
     */
    public float area(){
        return (perimetro*ap)/2;
    }
    @Override
    public int hashCode() {
        return Objects.hash(perimetro, ap);
    }

    @Override
    public String toString() {
        return "{" +
            " perimetro='" + getPerimetro() + "'" +
            ", ap='" + getAp() + "'" +
            "}";
    }
    
}
