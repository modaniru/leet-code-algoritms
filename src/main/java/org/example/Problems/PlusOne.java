package org.example.Problems;

import java.util.Arrays;

public class PlusOne {
    /*
    [1, 2, 3, 4, 5]
    res = Arrays.copy(res, digits)
    i = 4
    n = res[i]++
    if(n >= 10) res[i] = n % 10 cont
    res[i] = n;

    return res;
     */
    public static int[] plusOne(int[] digits){
        int[] res = new int[digits.length+1];
        int num = 10;
        for(int i = res.length - 1; i > 0; i--){
            num = digits[i-1] + num/10;
            if(num >= 10)
                res[i] = num%10;
            else
                res[i] = num;
        }
        if(num >= 10){
            res[0] = 1;
            return res;
        }
        return Arrays.copyOfRange(res, 1, res.length);
    }
}
