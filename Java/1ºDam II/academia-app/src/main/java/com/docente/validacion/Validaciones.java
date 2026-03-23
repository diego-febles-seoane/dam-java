package com.docente.validacion;

/**
 * Clase de validaciones para los datos de las personas
 */
public class Validaciones {

    /**
     * Valida que el identificador sea correcto
     * @param identificador que se desea validar
     * @return true/false
     */
    public static boolean esIdentificadorValido(String identificador) {
        return esCadenaNoNula(identificador);
    }

    /**
     * Valida que el nombre sea correcto
     * @param cadena que se desea validar
     * @return true/false
     */
    private static boolean esCadenaNoNula(String cadena) {
        return cadena != null && !cadena.trim().isEmpty();
    }

    /**
     * Valida que el nombre sea correcto
     * @param nombre que se desea validar
     * @return true/false
     */
    public static boolean esNombreValido(String nombre) {
        return esCadenaNoNula(nombre);
    }

    /**
     * Valida que el curso sea correcto
     * @param curso que se desea validar
     * @return true/false
     */

    public static boolean esCursoValido(String curso) {
        return esCadenaNoNula(curso);
    }

    /**
     * Valida que la edad sea correcta
     * @param edad que se desea validar
     * @return  true/false
     */
    public static boolean esEdadValida(int edad) {
        return edad >= 17 && edad < 100;
    }

}
