package es.uah.mat.comp.mp.ejb.e8;

import es.uah.mat.comp.mp.ejb.e6.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircleTest {

    @Test
    void getRadius() {
        MyCircle c0 = new MyCircle();
        assertEquals(1,c0.getRadius(),"Deberia ser 1");
    }

    @Test
    void setRadius() {
        MyCircle c0 = new MyCircle();
        c0.setRadius(2);
        assertEquals(2,c0.getRadius(),"Deberia ser 2");
    }

    @Test
    void getCenter() {
        MyPoint p0 = new MyPoint(0,0);
        MyCircle c0 = new MyCircle(p0,17);
        assertEquals(p0,c0.getCenter(),"Deberia ser p0");
    }

    @Test
    void setCenter() {
        MyCircle c0 = new MyCircle();
        MyPoint p1 = new MyPoint(1,1);
        c0.setCenter(p1);
        assertEquals(p1,c0.getCenter(),"Deberia ser p1");
    }

    @Test
    void getCenterX() {
        MyCircle c0 = new MyCircle();
        assertEquals(0,c0.getCenterX(),"Deberia ser 0");
    }

    @Test
    void setCenterX() {
        MyCircle c0 = new MyCircle();
        c0.setCenterX(1);
        assertEquals(1,c0.getCenterX(),"Deberia ser 1");
    }

    @Test
    void getCenterY() {
        MyCircle c0 = new MyCircle();
        assertEquals(0,c0.getCenterY(),"Deberia ser 0");
    }

    @Test
    void setCenterY() {
        MyCircle c0 = new MyCircle();
        c0.setCenterY(1);
        assertEquals(1,c0.getCenterY(),"Deberia ser 1");
    }

    @Test
    void getCenterXY() {
        MyCircle c0 = new MyCircle();
        int[] c = c0.getCenterXY();
        assertEquals(0,c[0],"Deberia ser 0");
        assertEquals(0,c[1],"Deberia ser 0");
    }

    @Test
    void setCenterXY() {
        MyCircle c0 = new MyCircle();
        c0.setCenterXY(1,1);
        int[] c = c0.getCenterXY();
        assertEquals(1,c[0],"Deberia ser 1");
        assertEquals(1,c[1],"Deberia ser 1");
    }

    @Test
    void testToString() {
        MyCircle c0 = new MyCircle();
        assertEquals("MyCircle[radius=1,center=(0,0)]",c0.toString(),"Deberia ser MyCircle[radius=1,center=(0,0)]");
    }

    @Test
    void getArea() {
        MyPoint p1 = new MyPoint(2,2);
        MyCircle c1 = new MyCircle(p1,10);
        assertEquals(100*Math.PI,c1.getArea(),"Deberia ser 100*pi");
    }

    @Test
    void getCircumference() {
        MyPoint p1 = new MyPoint(2,2);
        MyCircle c1 = new MyCircle(p1,10);
        assertEquals(20*Math.PI,c1.getCircumference(),"Deberia ser 20*pi");
    }

    @Test
    void distance() {
        MyCircle c0 = new MyCircle();
        MyCircle c2 = new MyCircle(0,3,10);
        assertEquals(3,c0.distance(c2),"Deberia ser 3");
    }

}