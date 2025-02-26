package es.uah.mat.comp.mp.ejb.e5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getId() {
        Customer c=new Customer(1,"José",'f');
        Account a= new Account(12,c );
        assertEquals(12,a.getId(),"el id debería ser 12");
    }

    @Test
    void getCustomer() {
        Customer c=new Customer(1,"José",'f');
        Account a= new Account(12,c, 10.0 );
        assertEquals(c,a.getCustomer(),"el cliente debería ser c");
    }

    @Test
    void getBalance() {
        Customer c=new Customer(1,"José",'f');
        Account a= new Account(12,c, 10.0 );
        assertEquals(10.0,a.getBalance(),"el balance debería ser 10.0");
    }

    @Test
    void setBalance() {
        Customer c=new Customer(1,"José",'f');
        Account a= new Account(12,c, 10.0 );
        a.setBalance(34.3);
        assertEquals(34.3,a.getBalance(),"el balance debería ser 34.3");
    }

    @Test
    void testToString() {
        Customer c=new Customer(1,"José",'f');
        Account a= new Account(12,c, 10.0 );
        assertEquals("José(1)balance=$10", a.toString(),"el mensaje debería ser José(1)balance=$10");
    }

    @Test
    void getCustomerName() {
        Customer c=new Customer(1,"José",'f');
        Account a= new Account(12,c, 10.0 );
        assertEquals("José",a.getCustomerName(),"el nombre debería ser José");

    }

    @Test
    void deposit() {
        Customer c=new Customer(1,"José",'f');
        Account a= new Account(12,c, 10.0 );
        assertEquals(a,a.deposit(7),"la cuenta debería ser a");
    }

    @Test
    void withdraw() {
        Customer c=new Customer(1,"José",'f');
        Account a= new Account(12,c, 10.0 );
        assertEquals(a,a.withdraw(8),"la cuenta debería ser a");
        assertEquals(a,a.withdraw(1000),"la cuenta debería ser a");

    }

}