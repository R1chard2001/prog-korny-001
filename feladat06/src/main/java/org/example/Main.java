package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Kérek egy számot!");
        System.out.print("n = ");
        int n = Integer.parseInt(reader.readLine());
        long result = 1;
        int index = 1;
        while (index <= n) {
            result *= index;
            index++;
        }
        System.out.println("n! = " + result);
    }
}