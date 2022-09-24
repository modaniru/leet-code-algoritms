package org.example.Problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    void isValid() {
        Assertions.assertTrue(ValidParentheses.isValid("{}()[]"));
    }
    @Test
    void test1(){
        Assertions.assertTrue(ValidParentheses.isValid(""));
    }
    @Test
    void test2(){
        Assertions.assertTrue(ValidParentheses.isValid("{}"));
    }
    @Test
    void test3(){
        Assertions.assertTrue(ValidParentheses.isValid("{()}"));
    }
    @Test
    void test4(){
        Assertions.assertTrue(ValidParentheses.isValid("{()[{}()]}"));
    }
    @Test
    void test5(){
        Assertions.assertFalse(ValidParentheses.isValid("{(){}(]}"));
    }
    @Test
    void test6(){
        Assertions.assertFalse(ValidParentheses.isValid("{}]"));
    }
    @Test
    void test7(){
        Assertions.assertFalse(ValidParentheses.isValid("{"));
    }

}