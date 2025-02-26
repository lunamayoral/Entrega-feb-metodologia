package es.uah.mat.comp.mp.ejb.e2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    void getName() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Mercedes Ron", "mercedes.ron@gmail.com", 'f');
        authors[1] = new Author("Luna Mayoral", "luna.mayoral@gmail.com",'f');
        Book book = new Book("Culpa Tuya", authors, 15.95);
        assertEquals("Culpa Tuya", book.getName());
    }

    @Test
    void getAuthors() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Mercedes Ron", "mercedes.ron@gmail.com", 'f');
        authors[1] = new Author("Luna Mayoral", "luna.mayoral@gmail.com",'f');
        Book book = new Book("Culpa Tuya", authors, 15.95, 222);
        assertEquals(authors, book.getAuthors());
    }

    @Test
    void getPrice() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Mercedes Ron", "mercedes.ron@gmail.com", 'f');
        authors[1] = new Author("Luna Mayoral", "luna.mayoral@gmail.com",'f');
        Book book = new Book("Culpa Tuya", authors, 15.95, 222);
        assertEquals(15.95, book.getPrice(), 0);
    }

    @Test
    void setPrice() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Mercedes Ron", "mercedes.ron@gmail.com", 'f');
        authors[1] = new Author("Luna Mayoral", "luna.mayoral@gmail.com",'f');
        Book book = new Book("Culpa Tuya", authors, 15.95, 222);
        book.setPrice(16.95);
        assertEquals(16.95, book.getPrice(), 0);
    }

    @Test
    void getQty() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Mercedes Ron", "mercedes.ron@gmail.com", 'f');
        authors[1] = new Author("Luna Mayoral", "luna.mayoral@gmail.com",'f');
        Book book = new Book("Culpa Tuya", authors, 15.95, 222);
        assertEquals(222, book.getQty(), 0);
    }

    @Test
    void setQty() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Mercedes Ron", "mercedes.ron@gmail.com", 'f');
        authors[1] = new Author("Luna Mayoral", "luna.mayoral@gmail.com",'f');
        Book book = new Book("Culpa Tuya", authors, 15.95, 222);
        book.setQty(220);
        assertEquals(220, book.getQty(), 0);
    }

    @Test
    void testToString() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Mercedes Ron", "mercedes.ron@gmail.com", 'f');
        authors[1] = new Author("Luna Mayoral", "luna.mayoral@gmail.com",'f');
        Book book = new Book("Culpa Tuya", authors, 15.95, 222);
        assertEquals("Book[name=Culpa Tuya, authors={[Author [name=Mercedes Ron, email=mercedes.ron@gmail.com, gender=f], " +
                "Author [name=Luna Mayoral, email=luna.mayoral@gmail.com, gender=f]]}, price=15.95, qty=222]", book.toString());
    }

    @Test
    void getAuthorNames() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Mercedes Ron", "mercedes.ron@gmail.com", 'f');
        authors[1] = new Author("Luna Mayoral", "luna.mayoral@gmail.com",'f');
        Book book = new Book("Culpa Tuya", authors, 15.95, 222);
        assertEquals("Mercedes Ron, Luna Mayoral", book.getAuthorNames());
    }

}