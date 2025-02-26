package es.uah.mat.comp.mp.ejb.e3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {
    @Test
    void getName() {
        Author author = new Author("Mercedes Ron", "mercedes.ron@gmail.com");
        assertEquals("Mercedes Ron", author.getName());
    }

    @Test
    void getEmail() {
        Author author = new Author("Mercedes Ron", "mercedes.ron@gmail.com");
        assertEquals("mercedes.ron@gmail.com", author.getEmail());
    }

    @Test
    void setEmail() {
        Author author = new Author("Mercedes Ron", "mercedes.ron@gmail.com");
        author.setEmail("mercedes.rn@gmail.com");
        assertEquals("mercedes.rn@gmail.com", author.getEmail());
    }

    @Test
    void testToString() {
        Author author = new Author("Mercedes Ron", "mercedes.ron@gmail.com");
        assertEquals("Author [name=Mercedes Ron, email=mercedes.ron@gmail.com]", author.toString());
    }

}