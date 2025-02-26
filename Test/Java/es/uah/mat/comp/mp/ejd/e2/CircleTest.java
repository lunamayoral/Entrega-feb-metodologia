package es.uah.mat.comp.mp.ejd.e2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void testToString() {
        GeometricObject c1 = new Circle(4.5);
        assertEquals("Circle [radius = 4.5]", c1.toString());
    }

    @Test
    void getArea() {
        GeometricObject c1 = new Circle(4.5);
        assertEquals(4.5 * 4.5 * Math.PI, c1.getArea());
    }

    @Test
    void getPerimeter() {
        GeometricObject c1 = new Circle(4.5);
        assertEquals(9.0 * Math.PI, c1.getPerimeter());
    }

}