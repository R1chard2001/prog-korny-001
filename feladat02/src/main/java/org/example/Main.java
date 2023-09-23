package org.example;

public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Kérem adja meg a nevét parancssori argumentumként!");
        }
        else {
            System.out.println("Üdvözlöm " + args[0] + "!");
        }
    }
}