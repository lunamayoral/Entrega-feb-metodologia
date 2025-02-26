package es.uah.mat.comp.mp.eja.e6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    void getId() {
        Account c = new Account("xxx","888");
        String testid = c.getId();
        assertEquals("xxx",testid);
    }

    @Test
    void getName() {
        Account c = new Account("xxx", "888");
        String testName = c.getName();
        assertEquals("888", testName);
    }

    @Test
    void getBalance() {
        Account c = new Account("xxx", "888", 5);
        int testbalance = c.getBalance();
        assertEquals(5, testbalance);
    }

    @Test
    void credit() {
        Account c = new Account("xxx", "888");
        c.credit(5);
        assertEquals(5, c.getBalance());
    }

    @Test
    void debit() {
        Account c = new Account("xxx", "888", 100);
        c.debit(20);
        assertEquals(80, c.getBalance());
        c.debit(2000);
        assertEquals(80, c.getBalance());
    }


    @Test
    void transferTo() {
        Account source = new Account("src", "Source Account", 50);
        Account dest = new Account("dest", "Dest Account", 50);
        source.transferTo(dest,100);
        assertEquals(50, source.getBalance());
        assertEquals(50, dest.getBalance());
        source.transferTo(dest,20);
        assertEquals(30, source.getBalance());
        assertEquals(70, dest.getBalance());
    }

    @Test
    void testToString() {
        Account c = new Account("xxx", "888", 100);
        String expectedString = "Account[id=xxx,name=888,balance=100]";
        assertEquals(expectedString, c.toString());
    }
}

