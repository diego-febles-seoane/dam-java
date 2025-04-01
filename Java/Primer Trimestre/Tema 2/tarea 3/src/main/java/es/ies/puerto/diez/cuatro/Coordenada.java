package es.ies.puerto.diez.cuatro;
/**
 * Define una clase Coordenada con atributos x y y. Implementa métodos para calcular la distancia a otra coordenada y el desplazamiento a partir de un ángulo y una distancia. Sobrescribe toString() para mostrar la coordenada.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Coordenada {
    private int x;
    private int y;

    /**
     * Constructor por defecto
     */
    public Coordenada() {}

    /**
     * Constructor general
     */

     public Coordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    /**
     * Calcula la distancia entre dos coordenadas
     * @param coord La coordenada a la que se calcula la distancia
     * @return La distancia entre las coordenadas
     */

    public double distancia(Coordenada coord) {
        int dx = this.x - coord.x;
        int dy = this.y - coord.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    /**
     * Desplaza la coordenada a partir de un ángulo y una distancia
     * @param angulo El ángulo en radianes
     * @param distancia La distancia a desplazar
     */

    public void desplazar(double angulo, double distancia) {
        double dx = distancia * Math.cos(angulo);
        double dy = distancia * Math.sin(angulo);
        this.x += (int) dx;
        this.y += (int) dy;
    }

    /**
     * Sobrescribe toString() para mostrar la coordenada
     * @return La representación de la coordenada en formato "(x, y)"
     */

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
