package es.ies.puerto.treinta.siete;
import java.util.Objects;
/**
 * Crea una clase Partido con atributos equipoLocal, equipoVisitante, y resultado. 
 * Implementa métodos para actualizar el resultado y usar toString() para mostrar los detalles del partido.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Partido {
    private String equipoVisitante;
    private String equipoLocal;
    private String resultado;
    /**
     * Método constructor vacío por defecto
     */
    public Partido(){

    }
    public Partido(String equipoVisitante, String equipoLocal, String resultado){
        this.equipoVisitante=equipoVisitante;
        this.equipoLocal=equipoLocal;
        this.resultado=resultado;
    }
    public String actualizarResultado(String resultado){
        return this.resultado=resultado;
        
    }

    public String getEquipoVisitante() {
        return this.equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public String getEquipoLocal() {
        return this.equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getResultado() {
        return this.resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Partido equipoVisitante(String equipoVisitante) {
        setEquipoVisitante(equipoVisitante);
        return this;
    }

    public Partido equipoLocal(String equipoLocal) {
        setEquipoLocal(equipoLocal);
        return this;
    }

    public Partido resultado(String resultado) {
        setResultado(resultado);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Partido)) {
            return false;
        }
        Partido partido = (Partido) o;
        return Objects.equals(equipoVisitante, partido.equipoVisitante) && Objects.equals(equipoLocal, partido.equipoLocal) && Objects.equals(resultado, partido.resultado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(equipoVisitante, equipoLocal, resultado);
    }

    @Override
    public String toString() {
        return "{" +
            " equipoVisitante='" + getEquipoVisitante() + "'" +
            ", equipoLocal='" + getEquipoLocal() + "'" +
            ", resultado='" + getResultado() + "'" +
            "}";
    }
    
}
