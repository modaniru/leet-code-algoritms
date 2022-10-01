package org.example.Problems;

import org.example.leet.ListNode;

public class MergeTwoSortedList {

    public static void main(String[] args) {
        System.out.println(mergeTwoLists(ListNode.createList(1,2,4), ListNode.createList(1,3,4)));
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode result = null;
        ListNode temp = null;
        while (list1 != null || list2 != null) {
            if(list1 == null){
                if(result == null) return list2;
                temp.next = list2;
                return result;
            } else if (list2 == null) {
                if(result == null) return list1;
                temp.next = list1;
                return result;
            }
            int a = list1.val;
            int b = list2.val;
            if (result == null) {
                if (a < b) {
                    result = list1;
                    list1 = list1.next;
                    result.next = null;
                    temp = result;
                    continue;
                }
                result = list2;
                list2 = list2.next;
                result.next = null;
                temp = result;
                continue;
            }
            if(a < b){
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
                temp.next = null;
                continue;
            }
            temp.next = list2;
            list2 = list2.next;
            temp = temp.next;
            temp.next = null;
        }
        return result;
    }
}
