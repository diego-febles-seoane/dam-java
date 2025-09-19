package es.ies.puerto.Ejercicio7;

/**
 * Crea un objeto de la clase Banco con un saldo inicial de 1000. Deposita 500,
 * retira 200 y muestra el saldo actual.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Banco banco = new Banco(1000);

        banco.depositar(500);
        banco.retirar(200);
        System.out.println("Saldo actual: " + banco.getSaldo());
    }
}
