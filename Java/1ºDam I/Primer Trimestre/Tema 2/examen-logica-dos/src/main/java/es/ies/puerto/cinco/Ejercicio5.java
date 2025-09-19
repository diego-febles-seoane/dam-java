package es.ies.puerto.cinco;

public class Ejercicio5 {

    /**
     * Crea una clase llamada Círculo que represente un círculo. Debe de poseer como atributo su radio, del cual vamos a obtener el perímetro de este.
     * Crear una instancia de la clase Círculo con un radio de 5.
     * Muestra el valor de circulo.
     * Mostrar el área y el perímetro del círculo.
     * Modificar el radio a 7 y mostrar nuevamente el área y el perímetro.
     * Muestra el valor de circulo.
     * @author diego-febles-seoane
     * @version 1.0.0
     */
    public static class Círculo {
        private double radio;
        public Círculo(double radio) {
            this.radio = radio;
        }
        public double getCirculo() {
            return 2 * Math.PI * radio;
        }
        public double getArea() {
            return Math.PI * Math.pow(radio, 2);
        }
        public double calcularÁrea() {
            return getArea();
        }
        public double calcularPerímetro() {
            return 2 * Math.PI * radio;
        }
        public void setRadio(double radio) {
            this.radio = radio;
        }
        public double getRadio() {
            return radio;
        }

    public static void main(String[] args) {

        Círculo circulo = new Círculo(5);

        System.out.println("Valor de circulo: " + circulo.getCirculo());

        System.out.println("Área del círculo: " + circulo.calcularÁrea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerímetro());

        circulo.setRadio(7);
        System.out.println("Área del círculo modificado: " + circulo.calcularÁrea());
        System.out.println("Perímetro del círculo modificado: " + circulo.calcularPerímetro());

        System.out.println("Valor de circulo modificado: " + circulo.getCirculo());
        }
    }
}