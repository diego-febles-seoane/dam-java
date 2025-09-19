package es.ies.puerto.diez.nueve;
import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        System.out.println("Introduzca la distancia deseada:"); 
        Scanner scanner=new Scanner(System.in);
        Conversor conversor =new Conversor(scanner.nextFloat());
        System.out.println("¿Desea convertir de metros a pies o de kilometros a millas?");
        System.out.println("Diga 1 para convertir de metros a pies y 2 para convertir de kilometros a millas");
        int opcion=0;
        while(opcion!=1){
            int opcionScanner=scanner.nextInt();
        if(opcionScanner==1){
            System.out.println("Distacnia convertida a pies = "+conversor.metrosAPies()+" pies");
            opcion=1;
        }
        else if(opcionScanner==2){
            System.out.println("Distancia convertida a millas = "+conversor.kilometrosAMillas()+" millas"  );
            opcion=1;
        }
        else{
            System.out.println("Por favor solo introduzca los valores pedidos(1 o 2)");
            opcion=0;
        }
    
        }
    scanner.close();
    
    }
}
