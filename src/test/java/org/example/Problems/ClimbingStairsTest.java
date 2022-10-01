package org.example.Problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {

    @Test
    void test1() {
        Assertions.assertEquals(1, ClimbingStairs.climbStairs(1));
    }
    @Test
    void test2() {
        Assertions.assertEquals(2, ClimbingStairs.climbStairs(2));
    }
    @Test
    void test3() {
        Assertions.assertEquals(3, ClimbingStairs.climbStairs(3));
    }
}