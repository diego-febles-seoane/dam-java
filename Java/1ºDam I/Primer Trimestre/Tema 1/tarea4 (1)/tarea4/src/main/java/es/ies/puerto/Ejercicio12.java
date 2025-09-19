package es.ies.puerto;

public class Ejercicio12 {
    /**
    * Un mago tiene una lista de hechizos en su libro mágico, pero quiere saber cuántos hechizos de ataque y cuántos de defensa tiene. Los hechizos de ataque son aquellos cuyo nombre contiene la palabra "Fuego", mientras que los de defensa contienen "Escudo". Escribe un programa que cuente los hechizos de ataque y de defensa.
    * @author diego-febles-seoane
    * @version 1.0.0
    */
    public static void main(String[] args) {
        String[] hechizos = {"Fuego Ardiente", "Escudo Protector", "Rayo de Fuego", "Escudo Mágico", "Flecha Helada"};
        int hechizosAtaque = 0;
        int hechizosDefensa = 0;
        int hechizosSinDetermianar = 0;

        for (int i = 0; i < hechizos.length; i++){
            if (hechizos[i].contains("Fuego")){
                hechizosAtaque++;
            }else if (hechizos[i].contains("Escudo")) {
                hechizosDefensa++;
            }else{
                hechizosSinDetermianar++;
            }
        }
        System.out.println("Hechizos de ataque: " + hechizosAtaque);
        System.out.println("Hechizos de defensa: " + hechizosDefensa);
        System.out.println("Hechizos sin determinar: " + hechizosSinDetermianar);
    }
}