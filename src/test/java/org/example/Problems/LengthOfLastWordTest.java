package org.example.Problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordTest {

    @Test
    void t1() {
        Assertions.assertEquals(5 , LengthOfLastWord.lengthOfLastWord("Hello World"));
    }
    @Test
    void t2() {
        Assertions.assertEquals(4 , LengthOfLastWord.lengthOfLastWord("   fly me   to   the moon  "));
    }
    @Test
    void t3() {
        Assertions.assertEquals(6 , LengthOfLastWord.lengthOfLastWord("luffy is still joyboy"));
    }
    @Test
    void t4() {
        Assertions.assertEquals(5 , LengthOfLastWord.lengthOfLastWord("Hello"));
    }

    @Test
    void t5() {
        Assertions.assertEquals(5 , LengthOfLastWord.lengthOfLastWord("   Hello    "));
    }
}