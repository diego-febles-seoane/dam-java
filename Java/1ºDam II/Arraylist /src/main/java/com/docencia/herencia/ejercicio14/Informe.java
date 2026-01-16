package com.docencia.herencia.ejercicio14;


import java.util.ArrayList;
import java.util.List;


/**
 * Ejercicio 14
 *
 * Ejercicio de herencias
 * @author santiago
 * @version 1.0.0
 */


public class Informe extends Documento {
        private int paginas;

        public Informe(String titulo, int paginas) {
            super(titulo);
            this.paginas = paginas;
        }

        public void setPaginas(int paginas) {
            this.paginas = paginas;
        }

        public int getPaginas() {
            return paginas;
        }
        
        @Override
        public String descripcion() {
            // TODO: implementar formato según tests.
            return "";
        }
    

}
