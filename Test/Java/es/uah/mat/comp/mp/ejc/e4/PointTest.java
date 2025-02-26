package es.uah.mat.comp.mp.ejc.e4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    @Test
    void getX() {
        Point p1 = new Point(1.0f, 2.0f);
        assertEquals(1.0f, p1.getX());
        Point p2 = new Point();
        assertEquals(0.0f, p2.getX());
    }

    @Test
    void setX() {
        Point p1 = new Point(4.0f, 5.0f);
        p1.setX(20.0f);
        assertEquals(20.0f, p1.getX());
    }

    @Test
    void getY() {
        Point p1 = new Point(1.0f, 2.0f);
        assertEquals(2.0f, p1.getY());
    }

    @Test
    void setY() {
        Point p1 = new Point(1.0f, 2.0f);
        p1.setY(3.0f);
        assertEquals(3.0f, p1.getY());
    }

    @Test
    void setXY() {
        Point p1 = new Point(1.0f, 2.0f);
        p1.setXY(3.0f, 4.0f);
        assertArrayEquals(new float[]{3.0f, 4.0f}, p1.getXY());
    }

    @Test
    void getXY() {
        Point p1 = new Point(1.0f, 2.0f);
        assertArrayEquals(new float[]{1.0f, 2.0f}, p1.getXY());
    }

    @Test
    void testToString() {
        Point p1 = new Point(1.0f, 2.0f);
        assertEquals("(1.0, 2.0)", p1.toString());
    }
}