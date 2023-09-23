package org.example;

public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Kérek két egész számot paraméterül!");
            return;
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        if (b != 0) {
            System.out.println("a / b = " + (a / b));
            System.out.println("a % b = " + (a % b));
        }
    }
}