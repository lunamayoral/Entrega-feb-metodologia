package es.uah.mat.comp.mp.ejb.e4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    @Test
    void getId() {
        Customer custo = new Customer(1, "Pepe", 20);
        Invoice id = new Invoice(1, custo, 40.00f);
        assertEquals(1,id.getId());
    }

    @Test
    void getCustomer() {
        Customer custo = new Customer(1, "Pepe", 20);
        Invoice id = new Invoice(1, custo, 40.00f);
        assertEquals(custo,id.getCustomer());
    }

    @Test
    void getAmount() {
        Customer custo = new Customer(1, "Pepe", 20);
        Invoice id = new Invoice(1, custo, 40.00f);
        assertEquals(40,id.getAmount());
    }

    @Test
    void setCustomer() {
        Customer custo = new Customer(1, "Pepe", 20);
        Invoice id = new Invoice(1, custo, 40.00f);
        id.setCustomer(custo);
        assertEquals(custo,id.getCustomer());
    }

    @Test
    void setAmount() {
        Customer custo = new Customer(1, "Pepe", 20);
        Invoice id = new Invoice(1, custo, 40.00f);
        id.setAmount(40.00);
        assertEquals(40,id.getAmount());
    }

    @Test
    void getCustomerId() {
        Customer custo = new Customer(1, "Pepe", 20);
        Invoice id = new Invoice(1, custo, 40.00f);
        assertEquals(1,id.getCustomerId());
    }

    @Test
    void getCustomerName() {
        Customer custo = new Customer(1, "Pepe", 20);
        Invoice id = new Invoice(1, custo, 40.00f);
        assertEquals("Pepe",id.getCustomerName());
    }

    @Test
    void getCustomerDiscount() {
        Customer custo = new Customer(1, "Pepe", 20);
        Invoice id = new Invoice(1, custo, 40.00f);
        assertEquals(20,id.getCustomerDiscount());
    }

    @Test
    void getAmountAfterDiscount() {
        Customer custo = new Customer(1, "Pepe", 20);
        Invoice id = new Invoice(1, custo, 40.00f);
        assertEquals(32,id.getAmountAfterDiscount());
    }

    @Test
    void testToString() {
        Customer custo = new Customer(1, "Pepe", 20);
        Invoice id = new Invoice(1, custo, 40.00f);
        assertEquals(custo,id.getCustomer());
    }
}