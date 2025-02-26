package es.uah.mat.comp.mp.ejd.e4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovableCircleTest {
    @Test
    void testToString() {
        Movable circle = new MovableCircle(3,4,5,6,2);
        assertEquals("(3,4) speed=(5,6), radius=2", circle.toString());
    }

    @Test
    void moveUp() {
        Movable circle = new MovableCircle(3,4,5,6,2);
        circle.moveUp();
        assertEquals("(3,-2) speed=(5,6), radius=2", circle.toString());
    }

    @Test
    void moveDown() {
        Movable circle = new MovableCircle(3,4,5,6,2);
        circle.moveDown();
        assertEquals("(3,10) speed=(5,6), radius=2", circle.toString());
    }

    @Test
    void moveLeft() {
        Movable circle = new MovableCircle(3,4,5,6,2);
        circle.moveLeft();
        assertEquals("(-2,4) speed=(5,6), radius=2", circle.toString());
    }

    @Test
    void moveRight() {
        Movable circle = new MovableCircle(3,4,5,6,2);
        circle.moveRight();
        assertEquals("(8,4) speed=(5,6), radius=2", circle.toString());
    }

}