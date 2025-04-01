package es.ies.puerto.treinta.seis;

public class Ejercicio36 {
    public static void main(String[] args) {
        ColeccionMonedas coleccionMonedas=new ColeccionMonedas(5);
        Moneda moneda1=new Moneda("Euros");
        Moneda moneda2=new Moneda("Pesos");
        coleccionMonedas.addMoneda(moneda1);
        coleccionMonedas.addMoneda(moneda2);
        coleccionMonedas.deleteMoneda(moneda2);
        System.out.println(coleccionMonedas);
        coleccionMonedas.addMoneda(moneda2);
        System.out.println(coleccionMonedas);
    }
}
