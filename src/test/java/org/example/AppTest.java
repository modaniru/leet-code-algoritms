package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Tag("Palindrom")
    @Test
    void testPalindrom(){
        int[] testNums = new int[]{0,1,121,10,11,-11,-121,-123,123};
        boolean[] boolRes = new boolean[]{true, true, true, false, true, false, false, false, false};
        for (int i = 0; i < testNums.length; i++) {
            Assertions.assertEquals(boolRes[i], App.isPalindrome(testNums[i]));
            System.out.println("test " + i + " was passed");
        }
    }

}
