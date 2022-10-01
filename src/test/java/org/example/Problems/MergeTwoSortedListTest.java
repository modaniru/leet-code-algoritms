package org.example.Problems;

import org.example.leet.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListTest {

    @Test
    void test1() {
        ListNode list1 = ListNode.createList(1, 2, 4);
        ListNode list2 = ListNode.createList(1, 3, 4);
        Assertions.assertEquals(ListNode.createList(1, 1, 2, 3, 4, 4), MergeTwoSortedList.mergeTwoLists(list1, list2));
    }

    @Test
    void test4() {
        ListNode list1 = ListNode.createList(1, 2, 3);
        ListNode list2 = ListNode.createList(4, 5, 6);
        Assertions.assertEquals(ListNode.createList(1, 2, 3, 4, 5, 6), MergeTwoSortedList.mergeTwoLists(list1, list2));
    }

    @Test
    void test5() {
        ListNode list1 = ListNode.createList(1);
        ListNode list2 = ListNode.createList(1, 3, 4);
        Assertions.assertEquals(ListNode.createList(1, 1, 3, 4), MergeTwoSortedList.mergeTwoLists(list1, list2));
    }
}