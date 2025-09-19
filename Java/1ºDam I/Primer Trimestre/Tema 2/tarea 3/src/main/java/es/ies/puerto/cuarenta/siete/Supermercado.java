package es.ies.puerto.cuarenta.siete;

public class Supermercado {
    private int numObjetos;
    private CarritoDeCompras[]objetos;
    public Supermercado(){}
    public Supermercado(int numObjetos){
        this.numObjetos=0;
        this.objetos=new CarritoDeCompras[numObjetos];
    }
    public boolean addObjeto(CarritoDeCompras objeto){
        if(numObjetos<=objetos.length){
            objetos[numObjetos]=objeto;
            numObjetos++;
            return true;
        }
        return false;
    }
    public boolean deleteObjeto(CarritoDeCompras objeto){
        for (int i = 0; i < objetos.length; i++) {
            if(objetos[i].equals(objeto)){
                objetos[i]=null;
                for (int j = i; j < objetos.length-1; j++) {
                    objetos[j]=objetos[j+1];
                    objetos[objetos.length-1]=null;
                }
                numObjetos--;
                return true;
            }
        }
        return false;
    }
}
