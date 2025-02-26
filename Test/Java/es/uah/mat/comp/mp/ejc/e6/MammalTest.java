package es.uah.mat.comp.mp.ejc.e6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MammalTest {
    @Test
    void testToString() {
        Mammal mammal = new Mammal("Cat");
        assertEquals("Mammal[Animal[name=Cat]]", mammal.toString());
    }

}