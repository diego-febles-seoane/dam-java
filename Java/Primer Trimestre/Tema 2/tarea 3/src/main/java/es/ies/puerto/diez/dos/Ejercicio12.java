package es.ies.puerto.diez.dos;

public class Ejercicio12 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(5.0f, 2.0f);
        System.out.println("Los numeros: "+calculadora);
        System.out.println("Su suma da como resultado:");
        System.out.println( calculadora.sumar());
        System.out.println("Su resta da como resultado:");
        System.out.println(calculadora.restar());
        System.out.println("Su divicion da como resultado:");
        System.out.println(calculadora.dividir());
        System.out.println("Su multiplicacion da como resultado:");
        System.out.println(calculadora.multiplicar());
    }
}
