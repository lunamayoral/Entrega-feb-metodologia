package es.uah.mat.comp.mp.eja.e9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {
    @Test
    void getX() {
        Ball ball = new Ball(3.0f,2.0f,5,4.0f,6.0f);
        assertEquals(3.0f, ball.getX());
    }

    @Test
    void setX() {
        Ball ball = new Ball(3.0f,2.0f,5,4.0f,6.0f);
        ball.setX(20.0f);
        assertEquals(20.0f, ball.getX());
    }

    @Test
    void getY() {
        Ball ball = new Ball(3.0f,2.0f,5,4.0f,6.0f);
        assertEquals(2.0f, ball.getY());
    }

    @Test
    void setY() {
        Ball ball = new Ball(3.0f,2.0f,5,4.0f,6.0f);
        ball.setY(20.0f);
        assertEquals(20.0f, ball.getY());
    }

    @Test
    void getRadius() {
        Ball ball = new Ball(3.0f,2.0f,5,4.0f,6.0f);
        assertEquals(5, ball.getRadius());
    }

    @Test
    void setRadius() {
        Ball ball = new Ball(3.0f,2.0f,5,4.0f,6.0f);
        ball.setRadius(4);
        assertEquals(4, ball.getRadius());
    }

    @Test
    void getXDelta() {
        Ball ball = new Ball(3.0f,2.0f,5,4.0f,6.0f);
        assertEquals(4.0f, ball.getXDelta());
    }

    @Test
    void setXDelta() {
        Ball ball = new Ball(3.0f,2.0f,5,4.0f,6.0f);
        ball.setXDelta(20.0f);
        assertEquals(20.0f, ball.getXDelta());
    }

    @Test
    void getYDelta() {
        Ball ball = new Ball(3.0f,2.0f,5,4.0f,6.0f);
        assertEquals(6.0f, ball.getYDelta());
    }

    @Test
    void setYDelta() {
        Ball ball = new Ball(3.0f,2.0f,5,4.0f,6.0f);
        ball.setYDelta(20.0f);
        assertEquals(20.0f, ball.getYDelta());
    }

    @Test
    void move() {
        Ball ball = new Ball(3.0f,2.0f,5,4.0f,6.0f);
        ball.move();
        assertEquals(7.0f, ball.getX());
        assertEquals(8.0f, ball.getY());
    }

    @Test
    void reflectHorizontal() {
        Ball ball = new Ball(8.0f,2.0f,5,4.0f,6.0f);
        ball.reflectHorizontal();
        assertEquals(4.0f, ball.getX());
    }

    @Test
    void reflectVertical() {
        Ball ball = new Ball(8.0f,10.0f,5,4.0f,4.0f);
        ball.reflectVertical();
        assertEquals(6.0f, ball.getY());
    }

    @Test
    void testToString() {
        Ball ball = new Ball(3.0f,2.0f,5,4.0f,6.0f);
        String expectedString = "Ball [(3.0,2.0), speed=(4.0,6.0)]";
        assertEquals(expectedString, ball.toString());
    }

}