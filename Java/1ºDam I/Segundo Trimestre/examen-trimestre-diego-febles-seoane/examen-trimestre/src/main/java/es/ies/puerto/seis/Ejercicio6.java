package es.ies.puerto.seis;

public class Ejercicio6 {
    public static void main(String[] args) {
        Heroe heroe1 = new Heroe(1, "Goku", "Super Saiyan");
        Heroe heroe2 = new Heroe(2, "Vegeta", "Super Saiyan");
        System.out.print(heroe1 + "," + heroe2);
        System.out.print(heroe1.equals(heroe2));

    }
}
