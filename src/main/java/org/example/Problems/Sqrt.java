package org.example.Problems;

public class Sqrt {
    public static int mySqrt(int x) {
        int j = 0;
        for (int i = 0; i < x; j++, i = j * j){
            try{
                Math.multiplyExact(j,j);
            }
            catch (Exception e){
                return --j;
            }
        }
        if (j * j == x) return j;
        return --j;
    }
}
