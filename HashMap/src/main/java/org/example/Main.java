package org.example;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

import java.util.HashMap;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Integer ss = 10;
        ss = ss+ 3;
        System.out.println(ss);

        Person person = new Person("muni", 1);

        HashMap<Person,String> hm = new HashMap<>();
        hm.put(person, "India");
        System.out.println(hm);

        person.setId(55);

        System.out.println(hm.get(person));

    }
}