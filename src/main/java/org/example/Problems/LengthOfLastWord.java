package org.example.Problems;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String str){
        int len = 0;
        for(int i = str.length() - 1; i >= 0; i--){
            char letter = str.charAt(i);
            if(letter == ' ' && len != 0) return len;
            else if (letter == ' ' && len == 0) continue;
            else{
                len++;
            }
        }
        return len;
    }
}
