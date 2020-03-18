package com.infix.link.java;

import java.util.LinkedList;

public class MyJavaMarchHw {

    public static void main(String args[]){

        LinkedList<String> al=new LinkedList<String>();
        al.add("jahid");
        al.add("mamun");
        al.add("masuk");
        al.add("sabbir");

        System.out.println(al.getLast());
        System.out.println(al.remove(2));
        System.out.println(al.add("Tauhid"));

    }