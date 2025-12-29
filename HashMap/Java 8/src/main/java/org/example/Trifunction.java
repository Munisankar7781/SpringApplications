package org.example;



public interface Trifunction<T, U, V, R> {

   R apply(T t, U u, V v);

   default void function () {
      System.out.println("Hello the String");
   }

   static  void function1 (int i) {

      System.out.println(i+ "...."+ "Foreign Region");
   }
}