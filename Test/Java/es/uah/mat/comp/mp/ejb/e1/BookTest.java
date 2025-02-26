package es.uah.mat.comp.mp.ejb.e1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    void getName() {
        Author author = new Author("Mercedes Ron", "mercedes.r@gmail.com", 'f');
        Book book = new Book("Culpa Mia", author, 12.50);
        assertEquals("Culpa Mia", book.getName());
    }

    @Test
    void getAuthor() {
        Author author = new Author("Mercedes Ron", "mercedes.r@gmail.com", 'f');
        Book book = new Book("Culpa Mia", author, 12.50);
        assertEquals(author, book.getAuthor());
    }

    @Test
    void getPrice() {
        Author author = new Author("Mercedes Ron", "mercedes.r@gmail.com", 'f');
        Book book = new Book("Culpa Mia", author, 12.50);
        assertEquals(12.50, book.getPrice());
    }

    @Test
    void setPrice() {
        Author author = new Author("Mercedes Ron", "mercedes.r@gmail.com", 'f');
        Book book = new Book("Culpa Mia", author, 12.50);
        book.setPrice(12.90);
        assertEquals(12.90, book.getPrice());
    }

    @Test
    void getQty() {
        Author author = new Author("Mercedes Ron", "mercedes.r@gmail.com", 'f');
        Book book = new Book("Culpa Mia", author, 12.50,222);
        assertEquals(222, book.getQty());
    }

    @Test
    void setQty() {
        Author author = new Author("Mercedes Ron", "mercedes.r@gmail.com", 'f');
        Book book = new Book("Culpa Mia", author, 12.50,222);
        book.setQty(226);
        assertEquals(226, book.getQty());
    }

    @Test
    void testToString() {
        Author author = new Author("Mercedes Ron", "mercedes.r@gmail.com", 'f');
        Book book = new Book("Culpa Mia", author, 12.50,222);
        assertEquals("Book [name=Culpa Mia,Author[Author [name=Mercedes Ron, email=mercedes.r@gmail.com, gender=f]], price=12.5, qty=222]", book.toString());
    }

    @Test
    void getAuthorName() {
        Author author = new Author("Mercedes Ron", "mercedes.r@gmail.com", 'f');
        Book book = new Book("Culpa Mia", author, 12.50,222);
        assertEquals("Mercedes Ron", book.getAuthorName());
    }

    @Test
    void getAuthorEmail() {
        Author author = new Author("Mercedes Ron", "mercedes.r@gmail.com", 'f');
        Book book = new Book("Culpa Mia", author, 12.50,222);
        assertEquals("mercedes.r@gmail.com", book.getAuthorEmail());
    }

    @Test
    void getAuthorGender() {
        Author author = new Author("Mercedes Ron", "mercedes.r@gmail.com", 'f');
        Book book = new Book("Culpa Mia", author, 12.50,222);
        assertEquals('f', book.getAuthorGender());
    }

}