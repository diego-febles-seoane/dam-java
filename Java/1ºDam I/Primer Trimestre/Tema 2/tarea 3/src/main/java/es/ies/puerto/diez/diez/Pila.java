package es.ies.puerto.diez.diez;

public class Pila {
    private Integer[] elementos;
    private int tope;

    public Pila(){
        this.elementos = new Integer[10];
        tope = 0;
    }

    public Pila(int tamanio){
        this.elementos = new Integer[tamanio];
    }

    public boolean apilar(Integer numero){
        if (numero == null){
            return false;
        }
        if (tope >= elementos.length){
            return false;
        }
        for (int i = elementos.length-1; i > 0; i--){
            elementos[i] = elementos[i-1];
        }

        elementos[0] = numero;
        tope++;
        return true;
    }

    public boolean desapilar(){
        if (tope < 1){
            return false;
        }
        for (int i = 0;  i < elementos.length-1; i++){
            elementos[i] = elementos[i+1];
        }
        elementos[tope] = null;
        return true;
    }

    @Override
    public String toString() {
        String mensaje = "";
        for (int i = 0; i <  elementos.length; i++) {
            mensaje += "Posicion"+i + ", valor:" + elementos [i]+"\n";
        }
        return mensaje;
    }
}
