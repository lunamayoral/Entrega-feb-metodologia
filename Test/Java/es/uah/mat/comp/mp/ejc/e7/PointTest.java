package es.uah.mat.comp.mp.ejc.e7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void getX() {
        Point p = new Point(3, 4);
        assertEquals(3,p.getX(),"La x deberia ser 3");
    }

    @Test
    void setX() {
        Point p = new Point(3, 4);
        p.setX(5);
        assertEquals(5,p.getX(),"La x deberia ser 5");
    }

    @Test
    void getY() {
        Point p = new Point(3, 4);
        assertEquals(4,p.getY(),"La y deberia ser 4");
    }

    @Test
    void setY() {
        Point p = new Point(3, 4);
        p.setY(6);
        assertEquals(6,p.getY(),"La y deberia ser 6");
    }

    @Test
    void setXY() {
        Point p = new Point(3,4);
        p.setXY(1,2);
        assertEquals(1,p.getX(),"La x deberia ser 1");
        assertEquals(2,p.getY(),"La y deberia ser 2");
    }

    @Test
    void testToString() {
        Point p = new Point(3, 4);
        assertEquals("Point: (3,4)",p.toString(),"El mensaje deberia ser (3,4)");
    }

}