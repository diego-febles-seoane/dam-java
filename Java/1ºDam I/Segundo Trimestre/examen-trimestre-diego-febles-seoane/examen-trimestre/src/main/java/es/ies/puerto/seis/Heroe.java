package es.ies.puerto.seis;

/**
 * Corrige la clase Heroe en aquellos conceptos que consideres que debería tener toda clase.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Heroe {
    private int id;
    private String nombre;
    private String poder;

    /**
     * Constructor vacio
     */
    public Heroe(){}

    /**
     * Constructor por defecto
     * @param id
     * @param nombre
     * @param poder
     */
    public Heroe(int id, String nombre, String poder) {
        this.id = id;
        this.nombre = nombre;
        this.poder = poder;
    }

    /**
     * Creamos los getters y setters
     */
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return this.poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    /**
     * Creamos el @equals
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Heroe)) {
            return false;
        }
        Heroe heroe = (Heroe) o;
        return id == heroe.id;
    }

    /**
     * Generamos el @toString
     */
    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", poder='" + getPoder() + "'" +
            "}";
    }
    
    
    
}


