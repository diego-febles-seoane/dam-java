package unidad3;


public class Ejercicio03 {

        public static String evaluarIntento(int numeroSecreto, int intento) {
            String mensaje = "¡Correcto!";
            if (intento > numeroSecreto){
                mensaje = "Demasiado alto";
            }
            if (intento < numeroSecreto){
                mensaje = "Demasiado bajo";
            }
            return mensaje;
    }

    /**
     * Simula una partida con un máximo de 7 intentos.
     *
     * @param numeroSecreto número que hay que adivinar
     * @param intentos      array con los intentos del usuario (se usan como máximo 7)
     * @return true si se acierta en <= 7 intentos, false en caso contrario
     */
    public static boolean jugar(int numeroSecreto, int[] intentos) {
        int maxIntentos = 7;
        int usados = Math.min(maxIntentos, intentos.length);

        for (int i = 0; i < usados; i++) {
            if (intentos[i] == numeroSecreto) {
                return true;
            }
        }
        return false;
    }
}
