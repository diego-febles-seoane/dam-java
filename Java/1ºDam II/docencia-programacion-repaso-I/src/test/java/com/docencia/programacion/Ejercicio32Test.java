package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio32Test {

    @Test
    @Order(1)
    void borrowAndReturn() {
        Ejercicio32 book = new Ejercicio32("1984", "George Orwell");
        assertFalse(book.isBorrowed());

        assertTrue(book.borrow());
        assertTrue(book.isBorrowed());

        assertFalse(book.borrow());

        assertTrue(book.returnBook());
        assertFalse(book.isBorrowed());

        assertFalse(book.returnBook());
    }
}
