package es.uah.mat.comp.mp.ejc.e2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {
    @Test
    void getSchool() {
        Staff staff = new Staff("Luna", "Calle rufino blanco", "UAH", 500.00);
        assertEquals("UAH", staff.getSchool());
    }

    @Test
    void setSchool() {
        Staff staff = new Staff("Luna", "Calle rufino blanco", "UAH", 500.00);
        staff.setSchool("UAAH");
        assertEquals("UAAH", staff.getSchool());
    }

    @Test
    void getPay() {
        Staff staff = new Staff("Luna", "Calle rufino blanco", "UAH", 500.00);
        assertEquals(500.00, staff.getPay());
    }

    @Test
    void setPay() {
        Staff staff = new Staff("Luna", "Calle rufino blanco", "UAH", 500.00);
        staff.setPay(500.50);
        assertEquals(500.50, staff.getPay());
    }

    @Test
    void testToString() {
        Staff staff = new Staff("Luna", "Calle rufino blanco", "UAH", 500.00);
        assertEquals("Staff: subclass of Person[name = Luna, address = Calle rufino blanco ]" +
                ", school: UAH, pay: 500.0", staff.toString());
    }

}