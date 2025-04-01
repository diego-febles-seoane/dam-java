package es.ies.puerto;

import java.time.LocalDate;
import java.time.Month;

/**
 * Clase ejercicio 2
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Ejercicio2 {
    
    /**
     * Funcion encargada de comprovar la longitud del mes
     * @param anio int
     * @param mes int con formato Month
     * @return null
     */
    public static int obtenerDiasDelMes(int anio, Month mes) {
        if (anio < 1 || mes == null){
            return -1;
        }
        LocalDate localDate = LocalDate.of(anio, mes.getValue(), 1);
        return localDate.lengthOfMonth();
    }
}
