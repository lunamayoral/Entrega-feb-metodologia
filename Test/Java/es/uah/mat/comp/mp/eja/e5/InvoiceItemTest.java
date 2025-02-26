package es.uah.mat.comp.mp.eja.e5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceItemTest {

    @Test
    void getId() {
        InvoiceItem iiId = new InvoiceItem("1","15%",40,25.0);
        assertEquals("1",iiId.getId());
    }

    @Test
    void getDesc() {
        InvoiceItem iiDesc = new InvoiceItem("1","15%",40,25.0);
        assertEquals("15%",iiDesc.getDesc());
    }

    @Test
    void getQty() {
        InvoiceItem iiq = new InvoiceItem("1","15%",40,25.0);
        assertEquals(40,iiq.getQty());
    }

    @Test
    void setQty() {
        InvoiceItem iiq = new InvoiceItem("1","15%",40,25.0);
        iiq.setQty(40);
        assertEquals(40,iiq.getQty());

    }

    @Test
    void getUnitPrice() {
        InvoiceItem iiui = new InvoiceItem("1","15%",40,25.0);
        assertEquals(25.0,iiui.getUnitPrice());
    }

    @Test
    void setUnitPrice() {
        InvoiceItem iiui = new InvoiceItem("1","15%",40,25.0);
        iiui.setUnitPrice(25.0);
        assertEquals(25.0,iiui.getUnitPrice());
    }

    @Test
    void getTotal() {
        InvoiceItem iit = new InvoiceItem("1","15%",40,25.0);
        assertEquals(1000,iit.getTotal());
    }

    @Test
    void testToString() {
        InvoiceItem iist = new InvoiceItem("1","15%",40,25.0);
        assertEquals("InvoiceItem[ id = 1 ,desc = 15% ,qty = 40 ,unitPrice = 25.0 ]",iist.toString());


    }
}