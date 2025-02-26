package es.uah.mat.comp.mp.ejb.e1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {
    @Test
    void getName() {
        Author author = new Author("Laura Gallego", "laura.g@gmail.com", 'f');
        assertEquals("Laura Gallego", author.getName());
    }

    @Test
    void getEmail() {
        Author author = new Author("Laura Gallego", "laura.g@gmail.com", 'f');
        assertEquals("laura.g@gmail.com", author.getEmail());
    }

    @Test
    void setEmail() {
        Author author = new Author("Laura Gallego", "laura.g@gmail.com", 'f');
        author.setEmail("laura.gallego@gmail.com");
        assertEquals("laura.gallego@gmail.com", author.getEmail());
    }

    @Test
    void getGender() {
        Author author = new Author("Laura Gallego", "laura.g@gmail.com", 'f');
        assertEquals('f', author.getGender());
    }

    @Test
    void testToString() {
        Author author = new Author("Laura Gallego", "laura.g@gmail.com", 'f');
        assertEquals("Author [name=Laura Gallego, email=laura.g@gmail.com, gender=f]", author.toString());
    }

}