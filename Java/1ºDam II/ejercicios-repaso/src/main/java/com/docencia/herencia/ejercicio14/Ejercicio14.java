package com.docencia.herencia.ejercicio14;


import java.util.ArrayList;
import java.util.List;


/**
 * Ejercicio 14
 *
 * Clase lanzadora (opcional) y contenedor de métodos del enunciado.
 */

public class Ejercicio14 {

    private Ejercicio14() {
    }

    public static void main(String[] args) {
        // Puedes ejecutar aquí pruebas manuales rápidas si lo deseas.
    }


public static class Informe extends Documento {
        private final int paginas;

        public Informe(String titulo, int paginas) {
            super(titulo);
            this.paginas = paginas;
        }

        @Override
        public String descripcion() {
            // TODO: implementar formato según tests.
            return "";
        }
    }

    public static class Carta extends Documento {
        private final String destinatario;

        public Carta(String titulo, String destinatario) {
            super(titulo);
            this.destinatario = destinatario;
        }

        @Override
        public String descripcion() {
            // TODO: implementar formato según tests.
            return "";
        }
    }

    public static List<String> descripciones(List<Documento> documentos) {
        // TODO: devolver lista de descripciones de documentos no nulos.
        return new ArrayList<>();
    }

}
