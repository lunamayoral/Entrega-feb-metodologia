package es.uah.mat.comp.mp.ejc.e6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    @Test
    void greets() {
        Cat cat = new Cat("Luna");
        cat.greets();
    }

    @Test
    void testToString() {
        Cat cat = new Cat("Luna");
        assertEquals("Cat[Mammal[Animal[name=Luna]]]", cat.toString());
    }
}