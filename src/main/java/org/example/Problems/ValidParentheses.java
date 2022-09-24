package org.example.Problems;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        if (s.isEmpty()) return true;
        Stack<Character> stack = new Stack<>();
        stack.add(s.charAt(0));
        for (int i = 1; i < s.toCharArray().length; i++) {
            Character c = s.charAt(i);
            if(c.equals('[') || c.equals('{') || c.equals('('))
                stack.add(c);
            else if ((c.equals(']') || c.equals(')') || c.equals('}')) && stack.isEmpty()) {
                return false;
            } else{
                Character close = stack.peek();
                if((c.equals(']') && close.equals('[')) || (c.equals('}') && close.equals('{')) || (c.equals(')') && close.equals('('))){
                    stack.pop();
                    continue;
                }
                return false;
            }
        }
        return stack.isEmpty();
    }
}
