package es.uah.mat.comp.mp.ejc.e5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getWidth() {
        Rectangle r1 = new Rectangle();
        assertEquals(1.0,r1.getWidth());
    }

    @Test
    void setWidth() {
        Rectangle r2 = new Rectangle(2,3);
        r2.setWidth(4);
        assertEquals(4.0,r2.getWidth());
    }

    @Test
    void getLength() {
        Rectangle r1 = new Rectangle();
        assertEquals(1.0,r1.getLength());
    }

    @Test
    void setLength() {
        Rectangle r2 = new Rectangle(2,3);
        r2.setLength(5);
        assertEquals(5,r2.getLength());
    }

    @Test
    void getArea() {
        Rectangle r2 = new Rectangle(2,3);
        assertEquals(6,r2.getArea());
    }

    @Test
    void getPerimeter() {
        Rectangle r2 = new Rectangle(2,3);
        assertEquals(10,r2.getPerimeter());
    }

    @Test
    void testToString() {
        Rectangle r3 = new Rectangle("pink",true,11,13);
        assertEquals("Rectangle[Shape[color=pink, filled=true]width=11.0, length=13.0]",r3.toString());
    }

}