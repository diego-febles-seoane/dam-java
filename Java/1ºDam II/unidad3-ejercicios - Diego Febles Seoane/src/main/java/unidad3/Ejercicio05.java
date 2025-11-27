package unidad3;

public class Ejercicio05 {

    public static int[] tablaMultiplicar(int n) {
        int[] tabla = new int[10];
        for (int i = 0; i < 10; i++) {
            tabla[i] = n * (i + 1);
        }
        return tabla;
    }

    public static int sumaTabla(int n) {
        return n * 55;
    }
}
