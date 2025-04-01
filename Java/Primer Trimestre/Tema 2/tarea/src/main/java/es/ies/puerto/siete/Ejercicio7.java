package es.ies.puerto.siete;

public class Ejercicio7 {
    public static void main(String[] args) {
        CuentaBancaria cuentaBancaria1= new CuentaBancaria("Emilio", 123456789, 1000);
        cuentaBancaria1.depositarSaldo(3000);
        cuentaBancaria1.retirarSaldo(2500);
        CuentaBancaria cuentaBancaria2=new CuentaBancaria("Emilio", 123456779, 2000);
        System.out.println("Cuenta numero 1: ");
        System.out.println(cuentaBancaria1);
        if(cuentaBancaria1.equals(cuentaBancaria2)){
            System.out.println("Las cuentas son las mismas");
        }
        else{
            System.out.println("Cuenta numero 2: ");
            System.out.println(cuentaBancaria2);
        }
    }
}
