package es.uah.mat.comp.mp.ejd.e2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void testToString() {
        GeometricObject rectangle = new Rectangle(3.0,2.0);
        assertEquals("Rectangle [width=3.0, height=2.0]", rectangle.toString());
    }

    @Test
    void getArea() {
        GeometricObject rectangle = new Rectangle(3.0,2.0);
        assertEquals(6.0, rectangle.getArea());
    }

    @Test
    void getPerimeter() {
        GeometricObject rectangle = new Rectangle(3.0,2.0);
        assertEquals(10.0, rectangle.getPerimeter());
    }

}