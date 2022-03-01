package com.company;

import java.sql.SQLOutput;

public class Main {
    final static int iGlobal = 10;

    public static void main(String[] args) {
//	  String a = "Parul";
//        System.out.println(a.hashCode());
//        String b = "Parul";
//        System.out.println(a.equals(b));

        StringBuilder sb = new StringBuilder("abc");
        StringBuilder sb2 = new StringBuilder("abc");
        System.out.println(sb.hashCode());
        System.out.println(sb2.hashCode());
        System.out.println(sb.equals(sb2));
        System.out.println(sb==sb2);

        // equals() vs ==

        final int i = 10;



    }
}
