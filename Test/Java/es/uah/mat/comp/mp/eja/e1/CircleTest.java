package es.uah.mat.comp.mp.eja.e1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CircleTest {

    @Test
    void getRadius() {
        Circle circle = new Circle(5.0);
        assertEquals(5.0, circle.getRadius());
    }

    @Test
    void getArea() {
        Circle circle = new Circle(5.0);
        double expectedArea = 5.0 * 5.0 * Math.PI;
        assertEquals(expectedArea, circle.getArea(), 0.00001);
    }

    @Test
    void getColor() {
        Circle circle = new Circle(5.0, "red");
        assertEquals("red", circle.getColor());
    }

    @Test
    void setRadius() {
        Circle circle = new Circle();
        circle.setRadius(5.0);
        assertEquals(5.0, circle.getRadius());
    }

    @Test
    void setColor() {
        Circle circle = new Circle();
        circle.setColor("red");
        assertEquals("red", circle.getColor());
    }

    @Test
    void testToString() {
        Circle circle = new Circle(5.0, "red");
        String expectedString = "es.uah.matcomp.mp.el1.eja.ejerciciosclases.e1.Circle[radius=5.0 color=red]";
        assertEquals(expectedString, circle.toString());
    }
}