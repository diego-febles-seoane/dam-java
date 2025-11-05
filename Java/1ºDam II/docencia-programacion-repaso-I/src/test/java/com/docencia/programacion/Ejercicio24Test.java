package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio24Test {

    @Test
    @Order(1)
    void titleCaseEmpty() {
        assertEquals("", Ejercicio24.titleCase(""));
        assertEquals("", Ejercicio24.titleCase(null));
    }

    @Test
    @Order(2)
    void titleCaseBasic() {
        assertEquals("Hola Mundo", Ejercicio24.titleCase("hola mundo"));
        assertEquals("Hola Mundo", Ejercicio24.titleCase("HoLa   mUnDo"));
    }
}
