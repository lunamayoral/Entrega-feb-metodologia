package es.uah.mat.comp.mp.eja.e7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void getDay() {
        Date d=new Date(12,4,2025);
        assertEquals(12, d.getDay(),"el día debería ser 12");
    }

    @Test
    void getMonth() {
        Date d=new Date(12,4,2025);
        assertEquals(4, d.getMonth(),"el mes debería ser 4");
    }

    @Test
    void getYear() {
        Date d=new Date(12,4,2025);
        assertEquals(2025, d.getYear(),"el año debería ser 2025");
    }

    @Test
    void setDay() {
        Date d=new Date(12,4,2025);
        d.setDay(2);
        assertEquals(2,d.getDay(),"el día debería ser 2");
    }

    @Test
    void setMonth() {
        Date d=new Date(12,4,2025);
        d.setMonth(3);
        assertEquals(3,d.getMonth(),"El mes debería ser 3");
    }

    @Test
    void setYear() {
        Date d=new Date(12,4,2025);
        d.setYear(2001);
        assertEquals(2001,d.getYear(),"el año debería ser 2001");
    }

    @Test
    void setDate() {
        Date d=new Date(12,4,2025);
        d.setDate(4,5,2000);
        assertEquals(4,d.getDay(),"el día debería ser 4");
        assertEquals(5,d.getMonth(),"el mes debería ser 5");
        assertEquals(2000,d.getYear(),"el año debería ser 2000");

    }

    @Test
    void testToString() {
        Date d=new Date(12,4,2025);
        assertEquals("12/04/2025",d.toString(),"la fecha debería ser 12/04/2025");

    }
}