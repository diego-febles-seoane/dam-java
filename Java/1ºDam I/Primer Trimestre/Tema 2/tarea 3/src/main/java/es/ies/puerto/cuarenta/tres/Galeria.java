package es.ies.puerto.cuarenta.tres;
import java.util.Objects;

public class Galeria {
    private int numPinturas;
    private Pintura[]pinturas;
    /**
     * Constructor
     */
    public Galeria(){}
    /*+
     * Constrcutor con numero de pinturas
     */
    public Galeria(int numPinturas){
        this.numPinturas=0;
        this.pinturas=new Pintura[numPinturas];
    }
    /**
     * Metodo para agregar pinturas
     * @param addPintura
     */
    public boolean addPintura(Pintura pintura){
        if(numPinturas<pinturas.length){
            pinturas[numPinturas]=pintura;
            numPinturas++;
            return true;
        }
        return false;
    }
    /**
     * Metodo para eliminar pinturas
     * @param eliminarPintura
     */
    public boolean eliminarPintura(Pintura pintura){
        for (int i = 0; i < pinturas.length; i++) {
            if(pinturas[i].equals(pintura)){
                pinturas[i]=null;
                for (int j = i; j < pinturas.length-1; j++) {
                    pinturas[j]=pinturas[j+1];
                    pinturas[pinturas.length-1]=null;
                }
                numPinturas--;
                return true;
            }
        }
        return false;
    }

    public Galeria(int numPinturas, Pintura[] pinturas) {
        this.numPinturas = numPinturas;
        this.pinturas = pinturas;
    }

    public int getNumPinturas() {
        return this.numPinturas;
    }

    public void setNumPinturas(int numPinturas) {
        this.numPinturas = numPinturas;
    }

    public Pintura[] getPinturas() {
        return this.pinturas;
    }

    public void setPinturas(Pintura[] pinturas) {
        this.pinturas = pinturas;
    }

    public Galeria numPinturas(int numPinturas) {
        setNumPinturas(numPinturas);
        return this;
    }

    public Galeria pinturas(Pintura[] pinturas) {
        setPinturas(pinturas);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Galeria)) {
            return false;
        }
        Galeria galeria = (Galeria) o;
        return numPinturas == galeria.numPinturas && Objects.equals(pinturas, galeria.pinturas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numPinturas, pinturas);
    }

    @Override
    public String toString() {
        String mensaje="";
        for (int i = 0; i < pinturas.length; i++) {
            if(pinturas[i]!=null){
                mensaje+=pinturas[i];
            }
        }
        return "{" +
            " numPinturas='" + getNumPinturas() + "'" +
            mensaje+
            "}";
    }
    
}
