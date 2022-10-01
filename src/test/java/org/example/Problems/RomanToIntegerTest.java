//package org.example.Problems;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Tag;
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class RomanToIntegerTest {
//
//    @Test
//    @Tag("Romain to int")
//    void romanToInt() {
//        List<String> test = new ArrayList<>();
//        List<Integer> result = new ArrayList<>();
//        test.add("III");
//        result.add(3);
//        test.add("LVIII");
//        result.add(58);
//        test.add("MCMXCIV");
//        result.add(1994);
//        for (int i = 0; i < test.size(); i++) {
//            System.out.println(i);
//            Assertions.assertEquals(result.get(i), RomanToInteger.romanToInt(test.get(i)));
//        }
//    }
//}