package es.uah.mat.comp.mp.ejc.e2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void getName() {
        Person person = new Person("Roberto", "Calle rufino blanco");
        assertEquals("Roberto", person.getName());
    }

    @Test
    void getAddress() {
        Person person = new Person("Roberto", "Calle rufino blanco");
        assertEquals("Calle rufino blanco", person.getAddress());
    }

    @Test
    void setAddress() {
        Person person = new Person("Roberto", "Calle rufino blanco");
        person.setAddress("Calle de rufino blanco");
        assertEquals("Calle de rufino blanco", person.getAddress());
    }

    @Test
    void testToString() {
        Person person = new Person("Roberto", "Calle rufino blanco");
        assertEquals("Person[name = Roberto, address = Calle rufino blanco ]", person.toString());
    }

}