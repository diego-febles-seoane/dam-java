package es.ies.puerto.veinte.siete;
/**
 * Define una clase Planeta con atributos nombre, masa, y radio. Implementa métodos para calcular la gravedad en la superficie del planeta. Usa toString() para describir el planeta.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Planeta {
    private String nombre;
    private double masa;
    private double radio;

    public Planeta(){}

    public Planeta(String nombre, double masa, double radio) {
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

    public double getMasa() {
        return this.masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularGravedad(){
        final double G = 6.67430e-11; // Constante de gravitación universal en m^3 kg^-1 s^-2
        return (G * masa) / (radio * radio);
    }


    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", masa='" + getMasa() + "'" +
            ", radio='" + getRadio() + "'" +
            "}";
    }

    
}
