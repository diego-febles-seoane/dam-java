package es.ies.puerto.tres;

public class Ejercicio3 {
    public static void main(String[] args) {
        Coche coche = new Coche("Porsche", "911 carrera 3GTS", 100, 2007);

        System.out.println("Coche: " + coche);
        coche.acelerar();
        System.out.println("Velocidad al acelerar: " + coche.getVelocidad());
        coche.frenar();
        System.out.println("Velocidad al frenar: " + coche.getVelocidad());
    }
}
