package es.uah.mat.comp.mp.ejc.e8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void getHeight() {
        Cylinder cy = new Cylinder(17);
        assertEquals(1,cy.getHeight(),"Deberia ser 1");
    }

    @Test
    void setHeight() {
        Cylinder cy = new Cylinder(17,2,"Patata");
        cy.setHeight(1);
        assertEquals(1,cy.getHeight(),"Deberia ser 1");
    }

    @Test
    void getVolume() {
        Cylinder cy = new Cylinder();
        assertEquals(Math.PI,cy.getVolume(),"Deberia ser pi");
    }

    @Test
    void testToString() {
        Cylinder cy = new Cylinder(17,8);
        assertEquals("Cylinder: Circle[radius=17.0 color=red] height=8.0",cy.toString(),"Deberia ser Cylinder: subclass of Circle[radius=17.0 color=red] height=8.0");
    }

}