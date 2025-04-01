package es.ies.puerto.treinta.seis;
import java.util.Objects;
/**
 * Crea una clase ColeccionMonedas que almacene una lista (array) de monedas (clase Moneda). 
 * Implementa métodos para agregar monedas y listar todas las monedas. Usa toString() para mostrar detalles de la colección.
 * @author emsantamria
 * @version 1.0.0
 */
public class ColeccionMonedas {
    private int numMonedas;
    private Moneda[]monedas;
    /**
     * Constructor vacio por defecto
     */
    public ColeccionMonedas(){}
    /**
     * Constructor con numero de monedas
     * @param numMonedas
     */
    public ColeccionMonedas(int numMonedas){
        this.numMonedas=0;
        this.monedas=new Moneda[numMonedas];
    }
    /**
     * Metodo para agregar monedas
     * @param addMoneda
     */
    public boolean addMoneda(Moneda moneda){
        if(numMonedas<monedas.length){
            monedas[numMonedas]=moneda;
            numMonedas++;
            return true;
        }
        return false;
    }
    /**
     * Metodo para eliminar monedas
     * @param deleteMoneda
     */
    public boolean deleteMoneda(Moneda moneda){
        for (int i = 0; i < monedas.length; i++) {
            if(monedas[i].equals(moneda)){
                monedas[i]=null;
                for (int j = i; j < monedas.length-1; j++) {
                    monedas[j]=monedas[j+1];
                    monedas[monedas.length-1]=null;
                }
            numMonedas--;
            return true;
            }
            
        }
        return false;
    }

    public ColeccionMonedas(int numMonedas, Moneda[] monedas) {
        this.numMonedas = numMonedas;
        this.monedas = monedas;
    }

    public int getNumMonedas() {
        return this.numMonedas;
    }

    public void setNumMonedas(int numMonedas) {
        this.numMonedas = numMonedas;
    }

    public Moneda[] getMonedas() {
        return this.monedas;
    }

    public void setMonedas(Moneda[] monedas) {
        this.monedas = monedas;
    }

    public ColeccionMonedas numMonedas(int numMonedas) {
        setNumMonedas(numMonedas);
        return this;
    }

    public ColeccionMonedas monedas(Moneda[] monedas) {
        setMonedas(monedas);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ColeccionMonedas)) {
            return false;
        }
        ColeccionMonedas coleccionMonedas = (ColeccionMonedas) o;
        return numMonedas == coleccionMonedas.numMonedas && Objects.equals(monedas, coleccionMonedas.monedas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numMonedas, monedas);
    }

    @Override
    public String toString() {
        String mensaje="";
        for (int i = 0; i < monedas.length; i++) {
            if(monedas[i]!=null){
                mensaje+=monedas[i];
            }
        }
        return "{" +
            " numMonedas='" + numMonedas + "'" +
            "}"+mensaje;
    }
    
}
