package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Kérek két számot!");
        System.out.print("a: ");
        int a = Integer.parseInt(reader.readLine());
        System.out.print("b: ");
        int b = Integer.parseInt(reader.readLine());
        int diff = 1;
        if (a > b) diff = -1;
        // kiírom a köztük lévő számokat, nem beleértve a két bekért számot
        for (int i = a + diff; i != b; i+= diff) {
            System.out.print(i + " / 2 = ");
            System.out.println(i / 2.0);
        }
    }
}