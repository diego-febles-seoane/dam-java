package es.ies.puerto.diez.ocho;
/**
 * Define una clase Circulo con el atributo radio. Implementa los métodos area() y perimetro(). Usa equals() para comparar círculos por su radio.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Circulo {
    private float radio;

    /**
     * Constructor de la clase Circulo.
     * @param radio El radio del círculo.
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

    /**
     * Calcula y devuelve el área del círculo.
     * @return El área del círculo.
     */

    public float area() {
        return (float) (Math.PI * Math.pow(radio, 2));
    }

    /**
     * Calcula y devuelve el perímetro del círculo.
     * @return El perímetro del círculo.
     */

    public float perimetro() {
        return (float) (2 * Math.PI * radio);
    }

    /**
     * Compara este círculo con otro círculo por su radio.
     * @param obj El círculo con el que se compara.
     * @return true si los radios son iguales, false en caso contrario.
     */

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Circulo))
            return false;
        Circulo circulo = (Circulo) obj;
        return Float.compare(circulo.radio, radio) == 0;
    
    }


    @Override
    public String toString() {
        return "{" +
            " radio='" + getRadio() + "'" +
            "}";
    }

}
