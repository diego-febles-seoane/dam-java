package unidad3;


public class Ejercicio01 {
    
    public static String calificar(int nota) {
        
        switch (nota) {
            case 0,1,2,3,4:
                return "Insuficiente";                
            case 5:
                return "Suficiente";
            case 6:
                return "Bien";
            case 7,8:
                return "Notable"; 
            case 9,10:
                return "Sobresaliente";             
            default:
                throw new IllegalArgumentException();
        }
    }
}
