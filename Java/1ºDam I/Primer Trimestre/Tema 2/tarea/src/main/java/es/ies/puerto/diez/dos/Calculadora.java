package es.ies.puerto.diez.dos;
import java.util.Objects;
/**
 * Crea una clase Calculadora con métodos estáticos para sumar, restar, multiplicar y dividir dos números.
 * @author emsantamaria
 * @version 1.0.0
 */
public class Calculadora {
    private float numero1;
    private float numero2;

    /**
     * Constructor por defecto
     */
    public Calculadora() {
    }
    /**
     * Constructor con parámetros
     * @param numero1 Primer número
     * @param numero2 Segundo número
     */
    public Calculadora(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public float getNumero1() {
        return this.numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return this.numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    public Calculadora numero1(float numero1) {
        setNumero1(numero1);
        return this;
    }

    public Calculadora numero2(float numero2) {
        setNumero2(numero2);
        return this;
    }
    /**
     * Suma ambos digitos
     * @param sumar
     */
     public float sumar() {
        return numero1 + numero2;
    }
    /**
     * Resta el 2do numero al 1ro
     * @param restar
     */
    public float restar() {
        return numero1 - numero2;
    }
    /**
     * Multiplica el 1er digito por el segundo
     * @param multiplicar
     */
    public  float multiplicar() {
        return numero1 * numero2;
    }
    /**
     * Divide el 1er digito por el segundo
     * @param dividir
     */
    public float dividir() {
        return numero1/numero2;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Calculadora)) {
            return false;
        }
        Calculadora calculadora = (Calculadora) o;
        return numero1 == calculadora.numero1 && numero2 == calculadora.numero2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero1, numero2);
    }

    @Override
    public String toString() {
        return "{" +
            " Numero1='" + getNumero1() + "'" +
            ", Numero2='" + getNumero2() + "'" +
            "}";
    }
    
}
