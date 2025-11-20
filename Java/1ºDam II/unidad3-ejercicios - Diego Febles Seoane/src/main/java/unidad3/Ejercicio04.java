package unidad3;


public class Ejercicio04 {

    public static class ContadorSignos {
        private final int positivos;
        private final int negativos;
        private final int ceros;

        public ContadorSignos(int positivos, int negativos, int ceros) {
            this.positivos = 0;
            this.negativos = 0;
            this.ceros = 0;
        }

        public int getPositivos() {
            return positivos;
        }

        public int getNegativos() {
            return negativos;
        }

        public int getCeros() {
            return ceros;
        }
    }

    
    public static ContadorSignos contarSignos(int[] numeros) {
        
        for (int i = 0; i < numeros.length; i++) {
            if(i > 0){
                
            }
            if(i == 0){
                
            }
            if(i < 0){
                
            }
        }

        return null;
    }
}
