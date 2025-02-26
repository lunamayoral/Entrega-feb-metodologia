package es.uah.mat.comp.mp.ejc.e2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    void getProgram() {
        Student student = new Student("Luna", "Calle oscura", "Maths", 2024, 555.22);
        assertEquals("Maths", student.getProgram());
    }

    @Test
    void setProgram() {
        Student student = new Student("Luna", "Calle oscura", "Maths", 2024, 555.22);
        student.setProgram("Maths and computer science");
        assertEquals("Maths and computer science", student.getProgram());
    }

    @Test
    void getYear() {
        Student student = new Student("Luna", "Calle oscura", "Maths", 2024, 555.22);
        assertEquals(2024, student.getYear());
    }

    @Test
    void setYear() {
        Student student = new Student("Luna", "Calle oscura", "Maths", 2024, 555.22);
        student.setYear(2023);
        assertEquals(2023, student.getYear());
    }

    @Test
    void getFee() {
        Student student = new Student("Luna", "Calle oscura", "Maths", 2024, 555.22);
        assertEquals(555.22, student.getFee());
    }

    @Test
    void setFee() {
        Student student = new Student("Luna", "Calle oscura", "Maths", 2024, 555.22);
        student.setFee(222.50);
        assertEquals(222.50, student.getFee());
    }

    @Test
    void testToString() {
        Student student = new Student("Luna", "Calle oscura", "Maths", 2024, 555.22);
        assertEquals("Student: subclass of Person[name = Luna, address = Calle oscura ], " +
                "program: Maths, year: 2024, fee: 555.22", student.toString());
    }


}