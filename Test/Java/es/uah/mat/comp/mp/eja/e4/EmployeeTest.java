package es.uah.mat.comp.mp.eja.e4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void getId() {
        Employee e = new Employee(17, "Sebastián", "Cobos", 69420);
        assertEquals(17,e.getId(),"El id deberia ser 17");
    }

    @Test
    void getFirstName() {
        Employee e = new Employee(17, "Sebastián", "Cobos", 69420);
        assertEquals("Sebastián",e.getFirstName(),"El nombre deberia ser Sebastián");
    }

    @Test
    void getLastName() {
        Employee e = new Employee(17, "Sebastián", "Cobos", 69420);
        assertEquals("Cobos",e.getLastName(),"El apellido deberia ser Cobos");
    }

    @Test
    void getName() {
        Employee e = new Employee(17, "Sebastián", "Cobos", 69420);
        assertEquals("Sebastián Cobos",e.getName(),"El nombre deberia ser Sebastián Cobos");
    }

    @Test
    void getSalary() {
        Employee e = new Employee(17, "Sebastián", "Cobos", 69420);
        assertEquals(69420,e.getSalary(),"El salario deberia ser 69420");
    }

    @Test
    void setSalary() {Employee e = new Employee(17, "Sebastián", "Cobos", 69420);
        e.setSalary(212);
        assertEquals(212,e.getSalary(),"El id deberia ser 212");
    }

    @Test
    void getAnnualSalary() {
        Employee e = new Employee(17, "Sebastián", "Cobos", 5);
        assertEquals(60,e.getAnnualSalary(),"El id deberia ser 60");
    }

    @Test
    void raiseSalary() {
        Employee e = new Employee(17, "Sebastián", "Cobos", 69420);
        e.raiseSalary(900);
        assertEquals(694200,e.getSalary(),"El id deberia ser 694200");
    }

    @Test
    void testToString() {
        Employee e = new Employee(17, "Sebastián", "Cobos", 69420);
        assertEquals("Employee[id=" + 17 + ", name=" + "Sebastián Cobos" + ", salary=" + 69420 + ']',e.toString(),"El mensaje deberia ser Employee[id= 17, name= Sebastián Cobos, salary= 69420]");
    }

}