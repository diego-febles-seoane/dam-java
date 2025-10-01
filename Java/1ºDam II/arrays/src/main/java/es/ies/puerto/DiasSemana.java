package es.ies.puerto;

public class DiasSemana {
    public static void main(String[] args) {
        String[] semana = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};

        // for (int i = 0;i < semana.length; i++){
        //     System.out.println(semana[i]);
        // }
        
        for (String dia : semana) {
            System.out.println(dia);
        }

        System.out.println("Se termino correctamente");
        System.out.println("Con toString=");
        System.out.println(semana.toString());
    }
}
