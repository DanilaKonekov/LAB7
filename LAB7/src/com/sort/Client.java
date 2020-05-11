package com.sort;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scan = new Scanner("one one two two one three three five one two ");
        scan.useDelimiter(" ");

        ComparableString[] cs = new ComparableString[10];
        for (int i = 0; i < cs.length && scan.hasNext(); i++) {
            cs[i] = new ComparableString(scan.next());
        }

        HashSort hs = new HashSort(1000);
        hs.sort(cs);
        System.out.println("***************");
        for (ComparableString s: cs) {
            System.out.println(s);
        }
    }
}
