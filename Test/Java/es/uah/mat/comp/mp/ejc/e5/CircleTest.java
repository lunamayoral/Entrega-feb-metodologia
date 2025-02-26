package es.uah.mat.comp.mp.ejc.e5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        Circle c2 = new Circle(33);
        assertEquals(33.0,c2.getRadius());
    }

    @Test
    void setRadius() {
        Circle c2 = new Circle(33);
        c2.setRadius(64);
        assertEquals(64,c2.getRadius());
    }

    @Test
    void getArea() {
        Circle c1 = new Circle();
        assertEquals(Math.PI,c1.getArea());
    }

    @Test
    void getPerimeter() {
        Circle c3 = new Circle("purple",false,1);
        assertEquals(2*Math.PI,c3.getPerimeter());
    }

    @Test
    void testToString() {
        Circle c2 = new Circle(33);
        assertEquals("Circle[Shape[color=red, filled=true]radius=33.0]",c2.toString());
    }

}