package com.docencia.herencia.ejercicio14;


import java.util.ArrayList;
import java.util.List;


/**
 * Ejercicio 14
 *
 * Clase lanzadora (opcional) y contenedor de métodos del enunciado.
 * @author diegofeblesseoane
 * @version 1.0.0
 */




public class Informe extends Documento {
        private int paginas;

        /**
         * Constructor por defecto
         * @param titulo de informe
         * @param paginas de informe
         */
        public Informe(String titulo, int paginas) {
            super(titulo);
            if (paginas <= 0){
                throw new IllegalArgumentException();
            }
            this.paginas = paginas;
        }

        /**
         * Getters y setters
         * @param paginas de informe
         */
        public void setPaginas(int paginas) {
            this.paginas = paginas;
        }

        public int getPaginas() {
            return paginas;
        }
        
        /**
        * Metodo toString
        */
        @Override
        public String descripcion() {
            
            return "Informe: " + getTitulo() + " (" + getPaginas() + " páginas)";
        }
    

}
