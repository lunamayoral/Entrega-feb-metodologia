package es.uah.mat.comp.mp.ejc.e5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void getColor() {
        Shape sh2 = new Shape("blue",true);
        assertEquals("blue",sh2.getColor());
    }

    @Test
    void setColor() {
        Shape sh2 = new Shape("blue",true);
        sh2.setColor("green");
        assertEquals("green",sh2.getColor());
    }

    @Test
    void isFilled() {
        Shape sh2 = new Shape("blue",true);
        assertTrue(sh2.isFilled());
    }

    @Test
    void setFilled() {
        Shape sh2 = new Shape("blue",true);
        sh2.setFilled(false);
        assertFalse(sh2.isFilled());
    }

    @Test
    void testToString() {
        Shape sh1 = new Shape();
        assertEquals("Shape[color=red, filled=true]",sh1.toString());
    }

}