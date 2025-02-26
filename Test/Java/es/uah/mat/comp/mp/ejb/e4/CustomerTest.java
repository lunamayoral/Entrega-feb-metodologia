package es.uah.mat.comp.mp.ejb.e4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void getId() {
        Customer id = new Customer(3,"Pepe",5);
        assertEquals(3, id.getId());
    }

    @Test
    void getName() {
        Customer id = new Customer(3,"Pepe",5);
        assertEquals("Pepe", id.getName());
    }

    @Test
    void getDiscount() {
        Customer id = new Customer(3,"Pepe",5);
        assertEquals(5, id.getDiscount());
    }

    @Test
    void setDiscount() {
        Customer id = new Customer(3,"Pepe",7);
        id.setDiscount(7);
        assertEquals(7, id.getDiscount());
    }

    @Test
    void testToString() {
        Customer ts = new Customer(1, "Paco", 10);
        assertEquals("Customer[name =1 discount % = 10]",ts.toString());

    }
}