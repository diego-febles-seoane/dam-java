package es.ies.puerto.diez.nueve;
import java.util.Objects;
/**
 * Crea una clase Conversor con métodos para convertir unidades de longitud (metros a pies__, kilómetros a millas). 
 * Usa toString() para mostrar el valor convertido.
 * @author emsantamaria
 * @version 1.0.0
 */
public class Conversor {
    private float distancia;
    /**
     * Constructor vacío por defecto
     */
    public Conversor() {
    }
    /**
     * Constructor con la distancia
     * @param distancia;
     */
    public Conversor(float distancia) {
        this.distancia = distancia;
    }

    public float getDistancia() {
        return this.distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public Conversor distancia(float distancia) {
        setDistancia(distancia);
        return this;
    }
    /**
     * Metodo para convertir de metros a pies
     * @param metrosAPies
     */
    public float metrosAPies(){
        return (float) (distancia*3.281);
    }
    /**
     * Metodo para convertir de kilometros a millas
     * @param kilometrosAMillas
     */
    public float kilometrosAMillas(){
        return (float) (distancia/1.609);
    }
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Conversor)) {
            return false;
        }
        Conversor conversor = (Conversor) o;
        return distancia == conversor.distancia;
    }

    @Override
    public String toString() {
        return "{" +
            " Distancia:'" + getDistancia() + "'" +
            "}";
    }
    
}
