package es.uah.mat.comp.mp.ejc.e6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    @Test
    void testToString() {
        Animal animal = new Animal("Emmily the dog");
        assertEquals("Animal[name=Emmily the dog]", animal.toString());
    }

}