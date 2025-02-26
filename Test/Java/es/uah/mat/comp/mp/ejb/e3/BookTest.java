package es.uah.mat.comp.mp.ejb.e3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    void getIsbn() {
        Author author = new Author("Mercedes Ron", "mercedes.ron@gmail.com");
        Book book = new Book("256485", "Culpa Nuestra", author, 13.50);
        assertEquals("256485", book.getIsbn());
    }

    @Test
    void getName() {
        Author author = new Author("Mercedes Ron", "mercedes.ron@gmail.com");
        Book book = new Book("256485", "Culpa Nuestra", author, 13.50, 22);
        assertEquals("Culpa Nuestra", book.getName());
    }

    @Test
    void getAuthor() {
        Author author = new Author("Mercedes Ron", "mercedes.ron@gmail.com");
        Book book = new Book("256485", "Culpa Nuestra", author, 13.50);
        assertEquals(author, book.getAuthor());
    }

    @Test
    void getPrice() {
        Author author = new Author("Mercedes Ron", "mercedes.ron@gmail.com");
        Book book = new Book("256485", "Culpa Nuestra", author, 13.50);
        assertEquals(13.50, book.getPrice());
    }

    @Test
    void setPrice() {
        Author author = new Author("Mercedes Ron", "mercedes.ron@gmail.com");
        Book book = new Book("256485", "Culpa Nuestra", author, 13.50);
        book.setPrice(12.50);
        assertEquals(12.50, book.getPrice());
    }

    @Test
    void getQty() {
        Author author = new Author("Mercedes Ron", "mercedes.ron@gmail.com");
        Book book = new Book("256485", "Culpa Nuestra", author, 13.50, 22);
        assertEquals(22, book.getQty());
    }

    @Test
    void setQty() {
        Author author = new Author("Mercedes Ron", "mercedes.ron@gmail.com");
        Book book = new Book("256485", "Culpa Nuestra", author, 13.50, 22);
        book.setQty(26);
        assertEquals(26, book.getQty());
    }

    @Test
    void getAuthorName() {
        Author author = new Author("Mercedes Ron", "mercedes.ron@gmail.com");
        Book book = new Book("256485", "Culpa Nuestra", author, 13.50, 22);
        assertEquals("Mercedes Ron", book.getAuthorName());
    }

    @Test
    void testToString() {
        Author author = new Author("Mercedes Ron", "mercedes.ron@gmail.com");
        Book book = new Book("256485", "Culpa Nuestra", author, 13.50, 22);
        assertEquals("Book [isbn=256485, name=Culpa Nuestra," +
                "Author[Author [name=Mercedes Ron, email=mercedes.ron@gmail.com]],price=13.5, qty=22]", book.toString());
    }

}