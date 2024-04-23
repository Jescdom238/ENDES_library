package com.endes.library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class authorTest {
    @Test
    void testAuthorCreation() {
        Author author = new Author();
        assertNotNull(author);
    }
}
