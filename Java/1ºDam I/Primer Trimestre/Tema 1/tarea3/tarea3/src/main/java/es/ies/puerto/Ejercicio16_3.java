package es.ies.puerto;

public class Ejercicio16_3 {
    /**
    * Si tienes un arma de fuego y munición, puedes luchar contra los zombies. Si tienes un arma cuerpo a cuerpo, puedes defenderte. Si no tienes armas, debes huir.
    * @author diego-febles-seo
    * @version 1.0.1
    */
    public static void main(String[] args) {
        int armas = (int)(Math.random()*2);
        switch (armas){
            case 0:
                System.out.println("Tienes armas de fuego y municion, asi que puedes luchar contra los zombies");
                break;
            case 1:
                System.out.println("Tienes un arma cuerpo a cuerpo , asi que puedes defenderte");
                break;
            default:
                System.out.println("No tienes arma");
                }
    }
}