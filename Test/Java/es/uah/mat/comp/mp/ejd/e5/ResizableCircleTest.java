package es.uah.mat.comp.mp.ejd.e5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResizableCircleTest {
    @Test
    void testToString() {
        Resizable r = new ResizableCircle(5);
        assertEquals("ResizableCircle[Circle[radius= 5.0]]", r.toString());
    }

    @Test
    void resize() {
        Resizable r = new ResizableCircle(5);
        r.resize(50);
        assertEquals("ResizableCircle[Circle[radius= 2.5]]", r.toString());
    }

}