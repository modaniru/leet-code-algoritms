//package org.example.Problems;
////todo Не сделано
//public class RomanToInteger {
//    public static int romanToInt(String s){
//        int res = 0;
//        int currentRes = 0;
//        int previews = 0;
//        for (int i = 0; i < s.toCharArray().length; i++) {
//            char letter = s.charAt(i);
//            int num = switch (letter) {
//                case 'I' -> 1;
//                case 'V' -> 5;
//                case 'X' -> 10;
//                case 'L' -> 50;
//                case 'C' -> 100;
//                case 'D' -> 500;
//                case 'M' -> 1000;
//                default -> 0;
//            };
//            if (previews==0){
//                previews = num;
//                continue;
//            }
//            else if(num > previews){
//                currentRes = num - previews;
//                previews = 0;
//            }
//            else {
//                currentRes = previews;
//                previews = num;
//            }
//            if(i==s.length()-1 && previews!=0) res+=previews;
//            res += currentRes;
//        }
//        return res;
//    }
//}
