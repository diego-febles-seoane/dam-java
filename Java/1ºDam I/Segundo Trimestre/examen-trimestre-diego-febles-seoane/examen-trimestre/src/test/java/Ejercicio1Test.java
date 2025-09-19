import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import es.ies.puerto.uno.Ejercicio1;

 class Ejercicio1Test {

    @Test
    void testFechaMismoMesDiaAnterior() {
        int meses = Ejercicio1.calcularMeses(10, 11, 2024); 
        assertEquals(0, meses);
        assertEquals(0, Ejercicio1.paga(meses));
    }


    @Test
    void testFechaMismoMesDiaPosterior() {
        int meses = Ejercicio1.calcularMeses(15, 11, 2024);
        assertEquals(-1, meses); 
        assertEquals(-100, Ejercicio1.paga(meses));
    }

    @Test
    void testFechaMesAnteriorMismoAno() {
        int meses = Ejercicio1.calcularMeses(10, 10, 2024);
        assertEquals(1, meses);
        assertEquals(100, Ejercicio1.paga(meses));
    }

    @Test
    void testFechaAnoAnterior() {
        int meses = Ejercicio1.calcularMeses(10, 11, 2023);
        assertEquals(12, meses);
        assertEquals(1200, Ejercicio1.paga(meses));
    }

    @Test
    void testFechaVariosAnosAtras() {
        int meses = Ejercicio1.calcularMeses(10, 5, 1990);
        assertEquals(414, meses);
        assertEquals(41400, Ejercicio1.paga(meses));
    }


    @Test
    void testFechaMismoDia() {
        int meses = Ejercicio1.calcularMeses(12, 11, 2024);
        assertEquals(0, meses);
        assertEquals(0, Ejercicio1.paga(meses));
    }
}
