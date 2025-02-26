package es.uah.mat.comp.mp.ejc.e1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void getHeight() {
        Cylinder c= new Cylinder();
        assertEquals(1.0,c.getHeight(),"la altura debería ser 8.0");
    }

    @Test
    void getVolume() {
        Cylinder c= new Cylinder(1,3);
        assertEquals(Math.PI*3,c.getVolume(),"el volumen debería ser 3pi");

    }

    @Test
    void setHeight() {
        Cylinder c= new Cylinder(1);
        c.setHeight(5.0);
        assertEquals(5.0,c.getHeight(),"la altura debería ser 5.0");
    }

    @Test
    void testToString() {
        Cylinder c= new Cylinder(2.0,1.0, "red");
        assertEquals("Cylinder: subclass of Circle[radius=2.0 color=red] height=1.0",c.toString(),"el mensaje debería ser Cylinder: subclass of Circle[radius=2.0 color=red] height=1.0 ");
    }
}