package com.endes.library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class bookTest {
    @Test
    void testBookCreation() {
        book book = new book();
        assertNotNull(book);
    }
}
