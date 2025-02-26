package es.uah.mat.comp.mp.ejc.e1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CircleTest {

    @Test
    void getRadius() {
        Circle c = new Circle(1.1);
        assertEquals(1.1, c.getRadius(),"El radio deberia ser 1.1");
    }

    @Test
    void getArea() {
        Circle c = new Circle();
        assertEquals(Math.PI, c.getArea(),"El area deberia ser 3.141592653589793");
    }

    @Test
    void getColor() {
        Circle c = new Circle(1.1);
        assertEquals("red", c.getColor(),"El radio deberia ser 1.1");
    }

    @Test
    void setRadius() {
        Circle c = new Circle(1.1);
        c.setRadius(6.9);
        assertEquals(6.9, c.getRadius(),"El radio deberia ser 6.9");
    }

    @Test
    void setColor() {
        Circle c = new Circle(1.1,"blue");
        c.setColor("red");
        assertEquals("red", c.getColor(),"El radio deberia ser 1.1");
    }

    @Test
    void testToString() {
        Circle c = new Circle(0.5);
        assertEquals("Circle[radius=0.5 color=red]", c.toString());
    }
}

