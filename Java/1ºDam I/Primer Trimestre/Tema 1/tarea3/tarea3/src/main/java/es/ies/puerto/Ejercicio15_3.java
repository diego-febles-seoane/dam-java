package es.ies.puerto;

public class Ejercicio15_3 {
    /**
    * Link encuentra tres objetos en una mazmorra: una llave, una bomba y un arco. Si tiene la llave, puede abrir la puerta. Si tiene la bomba, puede destruir la puerta. Si tiene el arco, puede atacar a los enemigos desde lejos.
    * @author diego-febles-seo
    * @version 1.0.1
    */
    public static void main(String[] args) {
        int objeto = (int)(Math.random()*3);
        switch (objeto){
            case 0:
                System.out.println("Link encuentra una llave, ahora puede abrir la puerta");
                break;
            case 1:
                System.out.println("Link encuentra una bomba, ahora puede destruir la puerta");
                break;
            case 2:
                System.out.println("Link encuentra una bomba, ahora puede atacar enemigos");
                break;
        }

    }
}