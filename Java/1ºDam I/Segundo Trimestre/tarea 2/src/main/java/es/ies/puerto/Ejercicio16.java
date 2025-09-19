package es.ies.puerto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        List<ResultadoExamen> resultados = new ArrayList<>();
        resultados.add(new ResultadoExamen("Antonio", 8));
        resultados.add(new ResultadoExamen("Jose luis", 7));
        resultados.add(new ResultadoExamen("Eli", 9));
        resultados.add(new ResultadoExamen("Lucía Marietta", 6));
        resultados.add(new ResultadoExamen("Jorge", 8));
        resultados.add(new ResultadoExamen("Ana", 5));
        List<ResultadoExamen> mejoresEstudiantes = obtenerTresMejores(resultados);
        List<ResultadoExamen> porDebajoDelPromedio = filtrarPorDebajoDelPromedio(resultados);
        System.out.println("Tres mejores estudiantes:");
        for (ResultadoExamen estudiante : mejoresEstudiantes) {
            System.out.println(estudiante);
        }
        System.out.println("\nEstudiantes por debajo del promedio:");
        for (ResultadoExamen estudiante : porDebajoDelPromedio) {
            System.out.println(estudiante);
        }
    }

    public static List<ResultadoExamen> obtenerTresMejores(List<ResultadoExamen> resultados) {
        Collections.sort(resultados, Comparator.comparingInt(ResultadoExamen::getNota).reversed());

        List<ResultadoExamen> mejores = new ArrayList<>();
        for (int i = 0; i < Math.min(3, resultados.size()); i++) {
            mejores.add(resultados.get(i));
        }
        return mejores;
    }


    public static List<ResultadoExamen> filtrarPorDebajoDelPromedio(List<ResultadoExamen> resultados) {
        double promedio = calcularPromedio(resultados);

        List<ResultadoExamen> porDebajoDelPromedio = new ArrayList<>();
        for (ResultadoExamen estudiante : resultados) {
            if (estudiante.getNota() < promedio) {
                porDebajoDelPromedio.add(estudiante);
            }
        }
        return porDebajoDelPromedio;
    }

    public static double calcularPromedio(List<ResultadoExamen> resultados) {
        int suma = 0;
        for (ResultadoExamen estudiante : resultados) {
            suma += estudiante.getNota();
        }
        return resultados.isEmpty() ? 0 : (double) suma / resultados.size();
    }
}

class ResultadoExamen {
    private String nombreAlumno;
    private int nota;

    public ResultadoExamen(String nombreAlumno, int nota) {
        this.nombreAlumno = nombreAlumno;
        this.nota = nota;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public int getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return nombreAlumno + ": " + nota;
    }
}