package com.docencia.fecha.ejercicio9;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class Ejercicio09Test {

    @Test
    void shouldThrowWhenListIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio09.minMax(null));
    }

    @Test
    void shouldThrowWhenListIsEmpty() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio09.minMax(new ArrayList<>()));
    }

    @Test
    void shouldThrowWhenListContainsNull() {
        List<LocalTime> horas = Arrays.asList(LocalTime.of(10, 0), null, LocalTime.of(12, 0));
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio09.minMax(horas));
    }

    @Test
    void shouldReturnMinMaxForExampleList() {
        List<LocalTime> horas = Arrays.asList(
                LocalTime.of(10, 0),
                LocalTime.of(9, 30),
                LocalTime.of(12, 15)
        );

        LocalTime[] res = Ejercicio09.minMax(horas);

        assertArrayEquals(new LocalTime[]{ LocalTime.of(9, 30), LocalTime.of(12, 15) }, res);
    }

    @Test
    void shouldWorkWithSingleElementList() {
        List<LocalTime> horas = Arrays.asList(LocalTime.of(10, 0));

        LocalTime[] res = Ejercicio09.minMax(horas);

        assertArrayEquals(new LocalTime[]{ LocalTime.of(10, 0), LocalTime.of(10, 0) }, res);
    }

    @Test
    void shouldReturnCorrectMinMaxWhenListAlreadySortedAscending() {
        List<LocalTime> horas = Arrays.asList(
                LocalTime.of(8, 0),
                LocalTime.of(9, 0),
                LocalTime.of(10, 0)
        );

        LocalTime[] res = Ejercicio09.minMax(horas);

        assertArrayEquals(new LocalTime[]{ LocalTime.of(8, 0), LocalTime.of(10, 0) }, res);
    }

    @Test
    void shouldReturnCorrectMinMaxWhenListAlreadySortedDescending() {
        List<LocalTime> horas = Arrays.asList(
                LocalTime.of(20, 0),
                LocalTime.of(12, 0),
                LocalTime.of(8, 0)
        );

        LocalTime[] res = Ejercicio09.minMax(horas);

        assertArrayEquals(new LocalTime[]{ LocalTime.of(8, 0), LocalTime.of(20, 0) }, res);
    }

    @Test
    void shouldReturnCorrectMinMaxWhenAllElementsEqual() {
        List<LocalTime> horas = Arrays.asList(
                LocalTime.of(10, 0),
                LocalTime.of(10, 0),
                LocalTime.of(10, 0)
        );

        LocalTime[] res = Ejercicio09.minMax(horas);

        assertArrayEquals(new LocalTime[]{ LocalTime.of(10, 0), LocalTime.of(10, 0) }, res);
    }

    @Test
    void shouldHandleSecondsAndNanos() {
        List<LocalTime> horas = Arrays.asList(
                LocalTime.of(10, 0, 0, 1),
                LocalTime.of(10, 0, 0, 0),
                LocalTime.of(10, 0, 0, 2)
        );

        LocalTime[] res = Ejercicio09.minMax(horas);

        assertArrayEquals(new LocalTime[]{
                LocalTime.of(10, 0, 0, 0),
                LocalTime.of(10, 0, 0, 2)
        }, res);
    }

    @Test
    void shouldReturnNewArrayInstance() {
        List<LocalTime> horas = Arrays.asList(LocalTime.of(9, 0), LocalTime.of(10, 0));

        LocalTime[] res1 = Ejercicio09.minMax(horas);
        LocalTime[] res2 = Ejercicio09.minMax(horas);

        assertNotSame(res1, res2);
        assertArrayEquals(res1, res2);
    }
}

