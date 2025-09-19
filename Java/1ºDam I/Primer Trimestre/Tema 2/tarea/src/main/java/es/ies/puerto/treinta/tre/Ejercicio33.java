package es.ies.puerto.treinta.tre;

public class Ejercicio33 {
    public static void main(String[] args) {
        Computadora computadora = new Computadora("Sony", "Vaio", 4);
        Componentes componente1=new Componentes("Ram");
        Componentes componente2=new Componentes("Tarjeta de video");
        Componentes componente3=new Componentes("Disco duro");
        computadora.addComponente(componente1);
        computadora.addComponente(componente2);
        computadora.eliminarComponente(componente1);
        computadora.addComponente(componente3);
        System.out.println(computadora);
    }
}
