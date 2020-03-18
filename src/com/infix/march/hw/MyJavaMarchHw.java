package com.infix.march.hw;

import java.util.ArrayList;


public class MyJavaMarchHw {

    public static void main (String [] args) {

        // This Array how you add manually.

        String[] fruit = new String[4];
        fruit[0] = "banana";
        fruit[1] = "apple";
        fruit[2] = "orange";
        fruit[3] = "stawbarry";
        System.out.println(fruit  [0]);

        //  ArrayList.....

        ArrayList fruitList = new ArrayList();
        fruitList.add("banana");
        fruitList.add("apple");
        fruitList.add("orange");
        fruitList.add("stawbarry");
        fruitList.remove(3);
        fruitList.remove("Rice");

        System.out.println(fruitList.contains("Beef"));
        System.out.println(fruitList);


    }
}