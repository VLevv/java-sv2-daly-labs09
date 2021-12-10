package day03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarTest {

    @Test
    void testEncrypts() {
        String test=new Caesar(2).encrypts("alma");
        assertEquals("cnoc",test);
    }
}