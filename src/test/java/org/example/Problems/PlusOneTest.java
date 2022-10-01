package org.example.Problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {
    /*
    [0] -> [1]
    [9] -> [1, 0]
    [1, 2, 3] -> [1, 2, 4]
    [1, 3, 9] -> [1, 4, 0]
    [2, 3, 9, 9] -> [2, 4, 0, 0]
    [9, 9, 9, 9, 9] -> [1, 0, 0, 0, 0, 0]
    */
    @Test
    void t1() {
        Assertions.assertArrayEquals(new int[]{1}, PlusOne.plusOne(new int[]{0}));
    }
    @Test
    void t2() {
        Assertions.assertArrayEquals(new int[]{1, 0}, PlusOne.plusOne(new int[]{9}));
    }
    @Test
    void t3() {
        Assertions.assertArrayEquals(new int[]{1, 2, 4}, PlusOne.plusOne(new int[]{1, 2, 3}));
    }
    @Test
    void t4() {
        Assertions.assertArrayEquals(new int[]{1, 4, 0}, PlusOne.plusOne(new int[]{1, 3, 9}));
    }
    @Test
    void t5() {
        Assertions.assertArrayEquals(new int[]{2, 4, 0, 0}, PlusOne.plusOne(new int[]{2, 3, 9, 9}));
    }
    @Test
    void t6() {
        Assertions.assertArrayEquals(new int[]{1, 0, 0, 0, 0, 0}, PlusOne.plusOne(new int[]{9, 9, 9, 9, 9}));
    }
}