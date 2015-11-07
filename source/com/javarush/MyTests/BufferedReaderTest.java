package com.javarush.MyTests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by temo on 11/3/15.
 */
public class BufferedReaderTest {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter your name: ");
        String name = reader.readLine();
        System.out.println("Please enter your age: ");
        String sAge = reader.readLine();
        int nAge = Integer.parseInt(sAge);
        System.out.println("Your name: " + name + "\nAge: " + nAge);
    }
}
