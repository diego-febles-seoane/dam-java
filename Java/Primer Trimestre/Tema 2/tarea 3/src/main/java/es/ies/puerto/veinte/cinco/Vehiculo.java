package es.ies.puerto.veinte.cinco;
/**
 * 
 */
public class Vehiculo {
    private String marca;
    private String modelo;

    /**
     * Creamos el cosntructor por defecto
     */
    public Vehiculo(){
    }

    /**
     * Creamos el constructor de 
     * @param marca
     * @param modelo
     */
    public Vehiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }


    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Vehiculo)) {
            return false;
        }
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(marca, vehiculo.marca) && Objects.equals(modelo, vehiculo.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo);
    }



    @Override
    public String toString() {
        return "{" +
            " marca='" + getMarca() + "'" +
            ", modelo='" + getModelo() + "'" +
            "}";
    }


}
