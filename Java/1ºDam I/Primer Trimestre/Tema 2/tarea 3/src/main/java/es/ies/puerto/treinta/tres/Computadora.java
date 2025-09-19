package es.ies.puerto.treinta.tres;
import java.util.Objects;
/**
 * Crea una clase Computadora con atributos marca, modelo y una lista (array) de componentes (como Procesador, RAM, etc.). 
 * Implementa métodos para agregar componentes y usar toString() para describir la computadora.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Computadora {
    private String marca;
    private String modelo;
    private int numComponentes;
    private Componentes[] componentes;
    
    /**
     * Constructor vacío por defecto.
     */
    public Computadora(){}
    /**Constructor con marca modelo y numero de componentes
     * @param marca
     * @param modelo
     * @param numComponentes
     */
    public Computadora(String marca, String modelo, int numComponentes) {
        this.marca = marca;
        this.modelo = modelo;
        this.numComponentes = 0;
        this.componentes = new Componentes[numComponentes];
    }
    /**
     * Metodo para agregar componentes
     * @param addComponente
     */
    public boolean addComponente(Componentes componente){
        if(numComponentes<componentes.length){
            componentes[numComponentes]=componente;
            numComponentes++;
            return true;
        }
         return false;
    }
    /**Metodo para eliminar componentes
     * @param eliminarComponente
     */
    public boolean eliminarComponente(Componentes componente){
        for (int i = 0; i < componentes.length-1; i++) {
            if(componentes[i].equals(componente)){
                componentes[i]=null;
                numComponentes--;
                for (int j = 0; j < componentes.length-1; j++) {
                    componentes[j]=componentes[j+1];
                    componentes[componentes.length-1]=null;
                    return true;
                }
            }
        }
        return false;
    }

    public Computadora(String marca, String modelo, int numComponentes, Componentes[] componentes) {
        this.marca = marca;
        this.modelo = modelo;
        this.numComponentes = numComponentes;
        this.componentes = componentes;
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

    public int getNumComponentes() {
        return this.numComponentes;
    }

    public void setNumComponentes(int numComponentes) {
        this.numComponentes = numComponentes;
    }

    public Componentes[] getComponentes() {
        return this.componentes;
    }

    public void setComponentes(Componentes[] componentes) {
        this.componentes = componentes;
    }

    public Computadora marca(String marca) {
        setMarca(marca);
        return this;
    }

    public Computadora modelo(String modelo) {
        setModelo(modelo);
        return this;
    }

    public Computadora numComponentes(int numComponentes) {
        setNumComponentes(numComponentes);
        return this;
    }

    public Computadora componentes(Componentes[] componentes) {
        setComponentes(componentes);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Computadora)) {
            return false;
        }
        Computadora computadora = (Computadora) o;
        return Objects.equals(marca, computadora.marca) && Objects.equals(modelo, computadora.modelo) && numComponentes == computadora.numComponentes && Objects.equals(componentes, computadora.componentes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, numComponentes, componentes);
    }

    @Override
    public String toString() {
        String mensaje="";
        int i=0;
        for(i=0;i<componentes.length-1;i++){
            if(componentes[i]!=null){
                mensaje+=componentes[i];
            }
        }
        return "{" +
            " Marca='" + marca + "'" +
            ", Modelo='" + modelo + "'" +
            ", Numero de Componentes='" + numComponentes + "'" +
            "}/"+mensaje;
    }
    
}
