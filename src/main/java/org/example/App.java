package org.example;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, int[]> numsAndCount = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!numsAndCount.containsKey(nums[i])) {
                numsAndCount.put(nums[i], new int[]{i, -1});
                continue;
            }
            int[] array = numsAndCount.get(nums[i]);
            if (array[1] != -1) continue;
            array[1] = i;
            numsAndCount.put(nums[i], array);
        }
        System.out.println(numsAndCount.keySet());
        for (Integer key : numsAndCount.keySet()) {
            int secondNum = target - key;
            if (numsAndCount.containsKey(secondNum)) {
                if (key == secondNum && numsAndCount.get(key)[1] == -1) continue;
                else if (key == secondNum) {
                    return numsAndCount.get(key);
                }
                return new int[]{numsAndCount.get(key)[0], numsAndCount.get(secondNum)[0]};
            }
        }
        return null;
    }

    public static boolean isPalindrome(int x){
        if(x < 0) return false;
        int num = x;
        int res = num%10;
        num/=10;
        while (num!=0){
            int digit = num % 10;
            num/=10;
            res = res * 10 + digit;
        }
        return res == x;
    }
}
