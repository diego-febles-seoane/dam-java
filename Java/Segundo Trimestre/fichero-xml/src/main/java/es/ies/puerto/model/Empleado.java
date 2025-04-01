package es.ies.puerto.model;
import java.util.Objects;

public class Empleado {
    String id;
    String nombre;
    String fechanacimiento;
    String puesto;


    public Empleado() {
    }
    
    public Empleado(String id) {
        this.id = id;
    }

    public Empleado(String id, String nombre, String fechanacimiento, String puesto) {
        this.id = id;
        this.nombre = nombre;
        this.fechanacimiento = fechanacimiento;
        this.puesto = puesto;
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechanacimiento() {
        return this.fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getPuesto() {
        return this.puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    
    @Override
    public String toString() {
        return id + "," +nombre +"," + fechanacimiento + "," + puesto;
    }
    

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Empleado)) {
            return false;
        }
        Empleado empleado = (Empleado) o;
        return Objects.equals(id, empleado.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, fechanacimiento, puesto);
    }
    

}
