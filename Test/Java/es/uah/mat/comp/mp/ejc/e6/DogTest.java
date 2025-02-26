package es.uah.mat.comp.mp.ejc.e6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    @Test
    void greets() {
        Dog dog = new Dog("Rober");
        dog.greets();
    }

    @Test
    void testGreets() {
        Dog dog1 = new Dog("Rober");
        Dog dog2 = new Dog("Luna");
        dog2.greets(dog1);
    }

    @Test
    void testToString() {
        Dog dog1 = new Dog("Rober");
        assertEquals("Dog[Mammal[Animal[name=Rober]]]", dog1.toString());
    }

}