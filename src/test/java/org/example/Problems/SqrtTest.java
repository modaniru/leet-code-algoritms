package org.example.Problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqrtTest {

    @Test
    void t1() {
        Assertions.assertEquals(0, Sqrt.mySqrt(0));
    }
    @Test
    void t2() {
        Assertions.assertEquals(1, Sqrt.mySqrt(1));
    }
    @Test
    void t3() {
        Assertions.assertEquals(2, Sqrt.mySqrt(8));
    }
    @Test
    void t4() {
        Assertions.assertEquals(2, Sqrt.mySqrt(4));
    }
    @Test
    void t5() {
        Assertions.assertEquals(4, Sqrt.mySqrt(16));
    }
    @Test
    void t6() {
        Assertions.assertEquals(4, Sqrt.mySqrt(17));
    }
    @Test
    void t7() {
        Assertions.assertEquals(4, Sqrt.mySqrt(2147483647));
    }

}