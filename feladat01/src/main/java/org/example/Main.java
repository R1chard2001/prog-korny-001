package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("'A' megoldás.");
        SolutionA();
        System.out.println("'B' megoldás.");
        SolutionB();
    }
    public static void SolutionA() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Szia, mi a neved?");
        System.out.print("Név: ");
        String name = reader.readLine();
        System.out.println("Üdvözöllek " + name + "!");
    }

    public static void SolutionB() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Szia, mi a neved?");
        System.out.print("Név: ");
        String name = reader.nextLine();
        System.out.println("Üdvözöllek " + name + "!");
    }
}