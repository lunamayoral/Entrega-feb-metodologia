package es.uah.mat.comp.mp.ejd.e5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void testToString() {
        GeometricObject circle = new Circle(2.2);
        assertEquals("Circle[radius= 2.2]", circle.toString());
    }

    @Test
    void getArea() {
        GeometricObject circle = new Circle(2.2);
        assertEquals(2.2 * 2.2 * Math.PI, circle.getArea());
    }

    @Test
    void getPerimeter() {
        GeometricObject circle = new Circle(2);
        assertEquals(4 * Math.PI, circle.getPerimeter());
    }

}