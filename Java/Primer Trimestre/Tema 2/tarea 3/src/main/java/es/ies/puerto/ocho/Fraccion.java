package es.ies.puerto.ocho;
/**
 * Crea una clase Fraccion con atributos numerador y denominador. Implementa métodos para sumar, restar, multiplicar y dividir fracciones. Sobrescribe toString() para mostrar la fracción en formato numerador/denominador.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Fraccion {
    private int numerador;
    private int denominador;

    /**
     * Constructor por defecto
     */
    public Fraccion() {}

    /**
     * Constructor general
     * @param numerador Numerador de la fraccion
     * @param denominador Denominador de la fraccion
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
     * Suma de dos fracciones
     * @param fraccion Fraccion a sumar
     * @return Nueva fraccion resultado de la suma
     */
    public Fraccion sumar(Fraccion fraccion) {
        int nuevoNumerador = (this.numerador * fraccion.getDenominador()) + (fraccion.getNumerador() * this.denominador);
        int nuevoDenominador = this.denominador * fraccion.getDenominador();
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    /**
     * Resta de dos fracciones
     * @param fraccion Fraccion a restar
     * @return Nueva fraccion resultado de la resta
     */

    public Fraccion restar(Fraccion fraccion) {
        int nuevoNumerador = (this.numerador * fraccion.getDenominador()) - (fraccion.getNumerador() * this.denominador);
        int nuevoDenominador = this.denominador * fraccion.getDenominador();
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    /**
     * Multiplicación de dos fracciones
     * @param fraccion Fraccion a multiplicar
     * @return Nueva fraccion resultado de la multiplicación
     */

    public Fraccion multiplicar(Fraccion fraccion) {
        int nuevoNumerador = this.numerador * fraccion.getNumerador();
        int nuevoDenominador = this.denominador * fraccion.getDenominador();
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    /**
     * División de dos fracciones
     * @param fraccion Fraccion a dividir
     * @return Nueva fraccion resultado de la división
     */

    public Fraccion dividir(Fraccion fraccion) {
        int nuevoNumerador = this.numerador * fraccion.getDenominador();
        int nuevoDenominador = this.denominador * fraccion.getNumerador();
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }


    @Override
    public String toString() {
        return "{" + numerador + "/" + denominador +  "}";
    }
    
    


}
