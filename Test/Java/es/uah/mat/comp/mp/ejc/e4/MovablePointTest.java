package es.uah.mat.comp.mp.ejc.e4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {
    @Test
    void getXSpeed() {
        MovablePoint mp1 = new MovablePoint(5.0f,3.0f,4.0f,5.0f);
        assertEquals(4.0f, mp1.getXSpeed());
        MovablePoint mp2 = new MovablePoint();
        assertEquals(0.0f, mp2.getXSpeed());
        MovablePoint mp3 = new MovablePoint(6.0f,4.4f);
        assertEquals(6.0f, mp3.getXSpeed());
    }

    @Test
    void setXSpeed() {
        MovablePoint mp1 = new MovablePoint(5.0f,3.0f,4.0f,5.0f);
        mp1.setXSpeed(5.0f);
        assertEquals(5.0f, mp1.getXSpeed());
    }

    @Test
    void getYSpeed() {
        MovablePoint mp1 = new MovablePoint(5.0f,3.0f,4.0f,5.0f);
        assertEquals(5.0f, mp1.getYSpeed());
    }

    @Test
    void setYSpeed() {
        MovablePoint mp1 = new MovablePoint(6.0f,4.4f);
        mp1.setYSpeed(6.0f);
        assertEquals(6.0f, mp1.getYSpeed());
    }

    @Test
    void setSpeed() {
        MovablePoint mp1 = new MovablePoint(6.0f,4.4f);
        mp1.setSpeed(3.0f,5.4f);
        assertArrayEquals(new float[]{ 3.0f, 5.4f },mp1.getSpeed());
    }

    @Test
    void getSpeed() {
        MovablePoint mp1 = new MovablePoint(6.0f,4.4f);
        assertArrayEquals(new float[]{ 6.0f, 4.4f },mp1.getSpeed());
    }

    @Test
    void testToString() {
        MovablePoint mp1 = new MovablePoint(6.0f,4.0f, 3.0f, 5.0f);
        assertEquals("(6.0,4.0), speed=(3.0,5.0)", mp1.toString());
    }

    @Test
    void move() {
        MovablePoint point = new MovablePoint(1.0f, 2.0f, 3.0f, 4.0f);
        // Llamar al método move
        point.move();
        // Verificar que las coordenadas se han actualizado correctamente
        assertEquals(4.0f, point.getX()); // 1.0 + 3.0 = 4.0
        assertEquals(6.0f, point.getY()); // 2.0 + 4.0 = 6.0
    }

}