package es.ies.puerto.Ejercicio6;

public class Rectangulo {
    private float base;
    private float altura;

    public Rectangulo() {

    }

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return this.base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "{" +
                " base='" + getBase() + "'" +
                ", altura='" + getAltura() + "'" +
                "}";
    }

    public float area() {
        return base * altura;
    }

    // Ejercicio 6
    // Método para calcular el perímetro
    public float perimetro() {
        return 2 * (base + altura);
    }
}