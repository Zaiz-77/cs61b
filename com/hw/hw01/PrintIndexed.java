package com.hw.hw01;

public class PrintIndexed {
    public static void printIndexed(String s) {
        int n = s.length();
        for (int i = 0; i < n; i++) {
            System.out.print(String.valueOf(s.charAt(i)) + (n - i - 1));
        }
    }

    public static void main(String[] args) {
        printIndexed("ApplePencil");
    }
}
