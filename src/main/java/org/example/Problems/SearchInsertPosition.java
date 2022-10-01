package org.example.Problems;

public class SearchInsertPosition {
    /*
    [1,3,5,7] 0
    start = 0 end = 4
    4 > 0
    middle = 2
        5 > 0 end = 1
    1 > 0
    middle = 0
        1 > 0 end = -1
    -1 < 0
    return 0

    [1,3,5,7] 1
    start = 0 end = 4
    4 > 0
    middle = 2
        5 > 1 end = 1
    1 > 0
    middle = 0
        1 == 1 return 0

    [1,3,5,7] 4
    start = 0 end = 4
    4 > 0
    middle = 2
        5 > 4 end = 1
    1 > 0
    middle = 0
        1 < 4 start = 1
    1 < 1 return 0

    [1,3,5,7] 8
    start = 0 end = 4
    4 > 0
    middle = 2
        5 < 8 start = 3
    4 > 3
    middle = 3
        7 < 8 start = 4
    4 < 4 return 3
     */
    public static int searchInsert(int[] nums, int target) {
        if(nums.length==0) return 0;
        int start = 0;
        int end = nums.length;
        int middle = 0;
        while (end > start){
            middle = (end + start) / 2;
            if(nums[middle] > target) end = middle;
            else if (nums[middle] < target) start = middle + 1;
            else return middle;
        }
        if(nums[middle] > target) return middle;
        else return middle + 1;
    }
}
