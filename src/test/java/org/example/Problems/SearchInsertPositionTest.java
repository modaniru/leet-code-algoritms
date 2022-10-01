package org.example.Problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

    @Test
    void test1() {
        Assertions.assertEquals(1 , SearchInsertPosition.searchInsert(new int[]{1,3,4,5}, 2));
    }
    @Test
    void test2() {
        Assertions.assertEquals(0 , SearchInsertPosition.searchInsert(new int[]{2,3,4,5}, 1));
    }
    @Test
    void test3() {
        Assertions.assertEquals(4 , SearchInsertPosition.searchInsert(new int[]{1,3,4,5}, 6));
    }
    @Test
    void test4() {
        Assertions.assertEquals(0 , SearchInsertPosition.searchInsert(new int[]{}, 6));
    }
    @Test
    void test5() {
        Assertions.assertEquals(0 , SearchInsertPosition.searchInsert(new int[]{1}, 1));
    }
}