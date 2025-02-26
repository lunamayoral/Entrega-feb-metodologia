package es.uah.mat.comp.mp.ejd.e3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {
    @Test
    void testToString() {
        Movable p1 = new MovablePoint(5,4,3,9);
        assertEquals("(5,4) speed=(3,9)", p1.toString());
    }

    @Test
    void moveUp() {
        Movable p1 = new MovablePoint(5,11,3,9);
        p1.moveUp();
        assertEquals("(5,2) speed=(3,9)", p1.toString());
    }

    @Test
    void moveDown() {
        Movable p1 = new MovablePoint(5,11,3,9);
        p1.moveDown();
        assertEquals("(5,20) speed=(3,9)", p1.toString());
    }

    @Test
    void moveLeft() {
        Movable p1 = new MovablePoint(5,11,3,9);
        p1.moveLeft();
        assertEquals("(2,11) speed=(3,9)", p1.toString());
    }

    @Test
    void moveRight() {
        Movable p1 = new MovablePoint(5,11,3,9);
        p1.moveRight();
        assertEquals("(8,11) speed=(3,9)", p1.toString());
    }
}