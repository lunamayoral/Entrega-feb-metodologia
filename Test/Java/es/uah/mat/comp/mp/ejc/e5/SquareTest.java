package es.uah.mat.comp.mp.ejc.e5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getSide() {
        Square sq1 = new Square();
        assertEquals(1,sq1.getSide());
    }

    @Test
    void setSide() {
        Square sq1 = new Square();
        sq1.setSide(7);
        assertEquals(7,sq1.getSide());
    }

    @Test
    void setWidth() {
        Square sq2 = new Square(4);
        sq2.setWidth(9);
        assertEquals(9,sq2.getSide());
    }

    @Test
    void setLength() {
        Square sq3 = new Square("vantablack",true,6);
        sq3.setLength(5);
        assertEquals(5,sq3.getSide());
    }

    @Test
    void testToString() {
        Square sq3 = new Square("vantablack",true,6);
        assertEquals("Square[Rectangle[Shape[color=vantablack, filled=true]width=6.0, length=6.0]]",sq3.toString());
    }

}