package es.uah.mat.comp.mp.ejb.e2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {
    @Test
    void getName() {
        Author author = new Author("Mercedes Ron", "mercedes.ron@gmail.com", 'f');
        assertEquals("Mercedes Ron", author.getName());
    }

    @Test
    void getEmail() {
        Author author = new Author("Mercedes Ron", "mercedes.ron@gmail.com", 'f');
        assertEquals("mercedes.ron@gmail.com", author.getEmail());
    }

    @Test
    void setEmail() {
        Author author = new Author("Mercedes Ron", "mercedes.ron@gmail.com", 'f');
        author.setEmail("mercedes.r@gmail.com");
        assertEquals("mercedes.r@gmail.com", author.getEmail());
    }

    @Test
    void getGender() {
        Author author = new Author("Mercedes Ron", "mercedes.ron@gmail.com", 'f');
        assertEquals('f', author.getGender());
    }

    @Test
    void testToString() {
        Author author = new Author("Mercedes Ron", "mercedes.ron@gmail.com", 'f');
        assertEquals("Author [name=Mercedes Ron, email=mercedes.ron@gmail.com, gender=f]", author.toString());
    }

}