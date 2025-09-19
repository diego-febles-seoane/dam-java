package es.ies.puerto.ocho;
/**
 * Crea una clase Fraccion con atributos numerador y denominador. 
 * Implementa métodos para sumar, restar, multiplicar y dividir fracciones. Sobrescribe toString() para mostrar la fracción en formato numerador/denominador.
 * @author emsantamaria
 * @version 1.0.0
 */
public class Fraccion {
    private int numerador;
    private int denominador;

    /**
     * Constructor vacío por defecto
     */
    public Fraccion() {
    }

    /**
     * Constructor con parámetros
     * @param numerador
     * @param denominador
     */

     public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }


    public int getNumerador() {
        return this.numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return this.denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    /**
     * Metodo que suma dos fracciones
     * @param fraccion
     * @return Fraccion suma
     */
    public void sumar(Fraccion fraccion){
        int nuevoNumerador = this.numerador * fraccion.getDenominador() + this.denominador * fraccion.getNumerador();
        int nuevoDenominador = this.denominador * fraccion.getDenominador();
    }
    /**
     * Metodo que resta dos fracciones
     * @param fraccion
     * @return Fraccion resta
     */
    

     @Override
     public String toString(){
         return this.numerador + "/" + this.denominador;
     }
}
