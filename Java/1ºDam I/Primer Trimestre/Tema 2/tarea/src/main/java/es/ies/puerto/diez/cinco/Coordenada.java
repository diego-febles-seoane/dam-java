package es.ies.puerto.diez.cinco;
import java.util.Objects;
/**
 * Define una clase Coordenada con atributos x y y. 
 * Implementa métodos para calcular la distancia a otra coordenada y el desplazamiento a partir de un ángulo y una distancia. 
 * Sobrescribe toString() para mostrar la coordenada.
 * @author emsantamaria
 * @version 1.0.0
 */
public class Coordenada {
    private int x;
    private int y;

    /**
     * Constructor por defecto
     */
    public Coordenada() {
    }

    /**
     * Constructor con parámetros
     * @param y
     * @param x
     */
    public Coordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Coordenada x(int x) {
        setX(x);
        return this;
    }

    public Coordenada y(int y) {
        setY(y);
        return this;
    }
    /**
     * Calcula la distancia entre dos puntos segun sus coordenadas
     * @param distancia
     */
    public double distancia(Coordenada otro) {
        int dx = getX() - otro.getX();
        int dy = getY() - otro.getY();
        return dx+dy;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Coordenada)) {
            return false;
        }
        Coordenada coordenada = (Coordenada) o;
        return x == coordenada.x && y == coordenada.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "{" +
            " Coordenada x='" + getX() + "'" +
            ", Coordenada y='" + getY() + "'" +
            "}";
    }
    
}
