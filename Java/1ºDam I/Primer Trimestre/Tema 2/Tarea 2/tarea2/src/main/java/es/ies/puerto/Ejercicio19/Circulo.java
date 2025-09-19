package es.ies.puerto.Ejercicio19;

public class Circulo {
    private double radio;

    public Circulo() {

    }
    
    public Circulo(double radio) {
        setRadio(radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if (radio <= 0) {
            System.out.println("El radio debe ser mayor a 0");
            this.radio = 1;
        } else {
            this.radio = radio;
        }
    }

    @Override
    public String toString() {
        return "{" +
            " radio='" + getRadio() + "'" +
            "}";
    }

    // Método para calcular el área
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    // Método para calcular el perímetro
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
