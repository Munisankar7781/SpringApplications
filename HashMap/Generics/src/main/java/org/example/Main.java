package org.example;

import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String s = "abaaaaaa333333555555555555555555bbbbbbbbbbbbbbbbbbbbbbbaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaannnnnnnnnnkjrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrreeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeebbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb";
        List<String> set = new ArrayList<>();

        for(int i=0; i < s.length(); i++) {
            for(int j=i; j< s.length(); j++) {
                set.add(s.substring(i,j+1));
            }
        }

        String list = set.stream()
                .filter(e -> {
                            if (e.length() > 2) {
                                int l = 0, r = e.length() - 1;
                                while (l < r) {
                                    if (e.charAt(l++) != e.charAt(r--)) return false;
                                }
                                return true;
                            } else {
                                return false;
                            }
                        }
                ).max(Comparator.comparingInt(String::length)).orElse("");

        System.out.println(list);


//        int n = 3;
//
//        if (n <= 1) {
//
//            System.out.println(n);
//            return;
//        }
//
//        int a = 0, b = 1;
//        for (int i = 2; i <= n; i++) {
//            int c = a + b;
//            a = b;
//            b = c;
//        }
//        System.out.println(b);

    }

//    private boolean ispalindrome (String s1) {
//
//        int left =0;
//        int right = s1.length()-1;
//
//        while(left < right) {
//
//            if(s1.charAt(left) != s1.charAt(right)) {
//
//                return false;
//            }
//
//            left++;
//            right--;
//        }
//
//        return true;
//
//    }
}