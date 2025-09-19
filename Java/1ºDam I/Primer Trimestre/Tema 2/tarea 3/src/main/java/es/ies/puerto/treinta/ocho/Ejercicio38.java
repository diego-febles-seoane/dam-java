package es.ies.puerto.treinta.ocho;

public class Ejercicio38 {
    public static void main(String[] args) {
        Juego juego=new Juego(5);
        Jugador jugador1=new Jugador("Jugador 1");
        Jugador jugador2=new Jugador("jugador2");
        juego.addJugadores(jugador1);
        juego.addJugadores(jugador2);
        System.out.println(juego);
        juego.deleteJugador(jugador1);
        System.out.println(juego);
    }
}
