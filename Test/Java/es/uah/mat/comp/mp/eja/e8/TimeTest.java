package es.uah.mat.comp.mp.eja.e8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void getHour() {
        Time time = new Time(10, 30, 45);
        assertEquals(10, time.getHour(), "La hora debería ser 10");
    }

    @Test
    void getMinute() {
        Time time = new Time(10, 30, 45);
        assertEquals(30, time.getMinute(), "Los minutos deberían ser 30");
    }

    @Test
    void getSecond() {
        Time time = new Time(10, 30, 45);
        assertEquals(45, time.getSecond(), "Los segundos deberían ser 45");
    }

    @Test
    void setHour() {
        Time time = new Time(10, 30, 45);
        time.setHour(12);
        assertEquals(12, time.getHour(), "La hora debería ser 12 después de establecerla");
    }

    @Test
    void setMinute() {
        Time time = new Time(10, 30, 45);
        time.setMinute(45);
        assertEquals(45, time.getMinute(), "Los minutos deberían ser 45 después de establecerlos");
    }

    @Test
    void setSecond() {
        Time time = new Time(10, 30, 45);
        time.setSecond(59);
        assertEquals(59, time.getSecond(), "Los segundos deberían ser 59 después de establecerlos");
    }

    @Test
    void setTime() {
        Time time = new Time(10, 30, 45);
        time.setTime(12, 45, 30);
        assertEquals(12, time.getHour(), "La hora debería ser 12");
        assertEquals(45, time.getMinute(), "Los minutos deberían ser 45");
        assertEquals(30, time.getSecond(), "Los segundos deberían ser 30");
    }

    @Test
    void testToString() {
        Time time = new Time(10, 30, 45);
        assertEquals("10 : 30 : 45", time.toString(), "El formato de la hora debería ser 10:30:45");
    }

    @Test
    void nextSecond() {
        Time time = new Time(23, 59, 59);
        time.nextSecond();
        assertEquals(0, time.getHour(), "La hora debería ser 0");
        assertEquals(0, time.getMinute(), "Los minutos deberían ser 0");
        assertEquals(0, time.getSecond(), "Los segundos deberían ser 0");
    }

    @Test
    void previousSecond() {
        Time time = new Time(0, 0, 0);
        time.previousSecond();
        assertEquals(23, time.getHour(), "La hora debería ser 23");
        assertEquals(59, time.getMinute(), "Los minutos deberían ser 59");
        assertEquals(59, time.getSecond(), "Los segundos deberían ser 59");
    }

}