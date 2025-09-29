package docencia.condicionales;

public class AdivinaSuerte {
    public static void main(String[] args) {
        String mensaje = "Sigue intentando";

        int numero = (int) ((Math.random()*100)+1);
        
        System.out.println("Tu numero es: " +numero);
        if (numero % 7 == 0){
            mensaje = "Eres Suertudo";
        }

        System.out.println(mensaje);
    }
}
