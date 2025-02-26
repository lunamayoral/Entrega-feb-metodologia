package es.uah.mat.comp.mp.ejb.e9;
import es.uah.mat.comp.mp.ejb.e6.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTriangleTest {

    @Test
    void testToString() {
        MyTriangle t1 = new MyTriangle(0,0,1,0,0,1);
        assertEquals("MyTriangle[v1=(0,0), v2=(1,0), v3=(0,1)]",t1.toString(),"Deberia ser MyTriangle[v1=(0,0), v2=(1,0), v3=(0,1)]");
    }

    @Test
    void getPerimeter() {
        MyTriangle t1 = new MyTriangle(0,0,3,0,0,4);
        assertEquals(12,t1.getPerimeter(),"Deberia ser 12");
    }

    @Test
    void getType() {
        MyPoint v1 = new MyPoint(0,0);
        MyPoint v2 = new MyPoint(3,0);
        MyPoint v3 = new MyPoint(0,4);
        MyTriangle t1 = new MyTriangle(v1,v2,v3);
        MyTriangle t2 = new MyTriangle(0,0,1,0,0,1);
        MyTriangle t3 = new MyTriangle(0,0,0,0,0,0);
        assertEquals("Escaleno",t1.getType(),"Deberia ser Escaleno");
        assertEquals("Isosceles",t2.getType(),"Deberia ser Isosceles");
        assertEquals("Equilatero",t3.getType(),"Deberia ser Equilatero");
    }

}