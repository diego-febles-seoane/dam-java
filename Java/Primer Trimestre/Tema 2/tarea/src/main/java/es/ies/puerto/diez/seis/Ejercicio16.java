package es.ies.puerto.diez.seis;

public class Ejercicio16 {
    public static void main(String[] args) {
        Fecha fecha1 = new Fecha(2020, 1, 23);
        Fecha fecha2 = new Fecha(2020, 1, 23);
        System.out.println(fecha1);
        if (fecha1.comprobar()==true){
            System.out.println("La fecha es correcta.");
        }else{System.out.println("La fecha no es correcta");}
        if(fecha1.equals(fecha2)){
            System.out.println("Las fechas son las mismas");
        }
    }
}
