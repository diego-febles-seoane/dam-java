package es.ies.puerto.veinte.ocho;
import java.util.Objects;
/**
 * Crea una clase Ciudad con atributos nombre, pais, y poblacion. Implementa métodos para comparar ciudades por su población con equals() y usar toString() para describir la ciudad.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Ciudad {
    private String nombre;
    private String pais;
    private long poblacion;

    /**
     * Constructor por defecto
     */
    public Ciudad() {
    }

    /**
     * Constructor por defecto
     * @param nombre
     * @param pais
     * @param poblacion
     */
    public Ciudad(String nombre, String pais, long poblacion) {
        this.nombre = nombre;
        this.pais = pais;
        this.poblacion = poblacion;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public long getPoblacion() {
        return this.poblacion;
    }

    public void setPoblacion(long poblacion) {
        this.poblacion = poblacion;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Ciudad)) {
            return false;
        }
        Ciudad ciudad = (Ciudad) o;
        return poblacion == ciudad.poblacion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, pais, poblacion);
    }
    

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", pais='" + getPais() + "'" +
            ", poblacion='" + getPoblacion() + "'" +
            "}";
    }
    
}
