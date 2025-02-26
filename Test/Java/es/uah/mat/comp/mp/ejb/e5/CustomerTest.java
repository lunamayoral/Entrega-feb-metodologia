package es.uah.mat.comp.mp.ejb.e5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void getId() {
        Customer c =new Customer(12,"Pepe",'f');
        assertEquals(12, c.getId(),"el id debería ser 12");

    }

    @Test
    void getName() {
        Customer c =new Customer(12,"Pepe",'f');
        assertEquals("Pepe", c.getName(),"el nombre debería ser Pepe");

    }

    @Test
    void getGender() {
        Customer c =new Customer(12,"Pepe",'f');
        assertEquals('f', c.getGender(),"el gender debería ser f");
    }

    @Test
    void testToString() {
        Customer c =new Customer(12,"Pepe",'f');
        assertEquals( "Pepe(12)", c.toString(),"el mensaje debería ser Pepe(12)");
    }
}