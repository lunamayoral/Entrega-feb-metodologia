package es.uah.mat.comp.mp.ejd.e1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void getSide() {
        Square square1 = new Square();
        assertEquals(1.0, square1.getSide());
        Square square2 = new Square(4.0);
        assertEquals(4.0, square2.getSide());
        Square square3 = new Square(5.0, "blue", true);
        assertEquals(5.0, square3.getSide());
    }

    @Test
    void setSide() {
        Square square1 = new Square();
        square1.setSide(5.0);
        assertEquals(5.0, square1.getSide());
    }

    @Test
    void setWidth() {
        Square square1 = new Square();
        square1.setWidth(4.0);
        assertEquals(4.0, square1.getWidth());
    }

    @Test
    void setLength() {
        Square square1 = new Square();
        square1.setLength(5.0);
        assertEquals(5.0, square1.getLength());
    }

    @Test
    void testToString() {
        Square square1 = new Square(6.0, "blue", true);
        assertEquals("Square [Rectangle [Shape [color=blue, filled=true]width=6.0, length=6.0]]", square1.toString());
    }
}