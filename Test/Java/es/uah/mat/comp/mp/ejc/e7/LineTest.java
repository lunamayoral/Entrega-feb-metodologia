package es.uah.mat.comp.mp.ejc.e7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    @Test
    void getBegin() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Line l = new Line(p1, p2);
        assertEquals(p1, l.getBegin(), "Deberia ser (1,2)");
    }

    @Test
    void setBegin() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Line l = new Line(p1, p2);
        l.setBegin(p2);
        assertEquals(p2, l.getBegin(), "Deberia ser (3,4)");
    }

    @Test
    void getEnd() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Line l = new Line(p1, p2);
        assertEquals(p2, l.getEnd(), "Deberia ser (3,4)");
    }

    @Test
    void setEnd() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Line l = new Line(p1, p2);
        l.setEnd(p1);
        assertEquals(p1, l.getEnd(), "Deberia ser (1,2)");
    }

    @Test
    void getBeginX() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Line l = new Line(p1, p2);
        assertEquals(1, l.getBeginX(), "Deberia ser 1");
    }

    @Test
    void setBeginX() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Line l = new Line(p1, p2);
        l.setBeginX(5);
        assertEquals(5, l.getBeginX(), "Deberia ser 5");
    }

    @Test
    void getBeginY() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Line l = new Line(p1, p2);
        assertEquals(2, l.getBeginY(), "Deberia ser 2");
    }

    @Test
    void setBeginY() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Line l = new Line(p1, p2);
        l.setBeginY(6);
        assertEquals(6, l.getBeginY(), "Deberia ser 6");
    }

    @Test
    void getEndX() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Line l = new Line(p1, p2);
        assertEquals(3, l.getEndX(), "Deberia ser 3");
    }

    @Test
    void setEndX() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Line l = new Line(p1, p2);
        l.setEndX(7);
        assertEquals(7, l.getEndX(), "Deberia ser 7");
    }

    @Test
    void getEndY() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Line l = new Line(p1, p2);
        assertEquals(4, l.getEndY(), "Deberia ser 4");
    }

    @Test
    void setEndY() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Line l = new Line(p1, p2);
        l.setEndY(8);
        assertEquals(8, l.getEndY(), "Deberia ser 8");
    }

    @Test
    void setBeginXY() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Line l = new Line(p1, p2);
        l.setBeginXY(12, 13);
        assertEquals(12, l.getBeginX(), "Deberia ser 12");
        assertEquals(13, l.getBeginY(), "Deberia ser 13");
    }

    @Test
    void setEndXY() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Line l = new Line(p1, p2);
        l.setEndXY(14, 15);
        assertEquals(14, l.getEndX(), "Deberia ser 14");
        assertEquals(15, l.getEndY(), "Deberia ser 15");
    }

    @Test
    void getLength() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 2);
        Line l = new Line(p1, p2);
        assertEquals(2, l.getLength(), "Deberia ser 2");
    }

    @Test
    void getGradient() {
        Point p1 = new Point(4, 4);
        Point p2 = new Point(3, 4);
        Line l = new Line(p1, p2);
        assertEquals(Math.PI, l.getGradient(), "Deberia ser pi");
    }

    @Test
    void testToString() {
        Line l = new Line(1, 2, 3, 4);
        assertEquals("MyLine[begin=Point: (1,2),end=Point: (3,4)]", l.toString(), "Deberia ser MyLine[begin=(1,2),end=(3,4)]");
    }

}