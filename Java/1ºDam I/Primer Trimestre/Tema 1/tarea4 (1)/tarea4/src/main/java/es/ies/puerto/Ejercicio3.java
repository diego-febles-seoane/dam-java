package es.ies.puerto;

public class Ejercicio3 {
    /**
    * Un grupo de guerreros ha sido evaluado por su nivel de poder de ataque. Escribe un programa que determine quién es el héroe más fuerte y el más débil.
    * @author diego-febles-seoane
    * @version 1.0.0
    */
    public static void main(String[] args) {

        int[] nivelesDeAtaque = {300, 150, 500, 200, 250};
        int minimo = nivelesDeAtaque [0];
        int maximo =  nivelesDeAtaque [0];

        for (int i = 1; i < nivelesDeAtaque.length; i++){
            int valor =  nivelesDeAtaque[i];
            if (valor > maximo){
                maximo = valor;
            }
            if (valor < minimo){
                minimo = valor;
            }

        System.out.println("Valor Minimo:" + minimo);
        System.out.println("Valor Maximo:" + maximo);
        }
    }
}