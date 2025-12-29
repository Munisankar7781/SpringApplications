package org.example;


import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        // TriFunction with 3 Integers and return type Integer
//        Trifunction<Integer, Integer, Integer, Integer> tt = (a, b, c) -> {
//
//           return  a + b + c;
//        };
//
//
//        Trifunction.function1(1);
//
//        System.out.println(tt.apply(1, 2, 3));
//


        // Functional - Style Progra

        List<Integer> list = List.of(3,4,5,7,88,99,1, 99);


        Optional<Integer> ll = list.stream().filter(i -> {
            if (i > 200) {
                return true;
            } else {
                return false;
            }
        }).findAny();


        if (ll.isPresent()) {
            System.out.println(ll.get());
        } else {
            System.out.println("Is Absent");
        }

        SoftReference<String> ss = new SoftReference<>("Muni Sankar");

        WeakReference<String> dd = ss.get()


    }
}