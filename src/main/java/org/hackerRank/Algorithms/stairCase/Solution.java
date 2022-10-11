package org.hackerRank.Algorithms.stairCase;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {
        String digit = "";
        int a = n-1;

        for(int i = 0; i<n; i++){
            digit += "#";
            for(int z = 0; z<a; z++){
                System.out.print(" ");
            }
            System.out.println(digit);
            a--;

        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        float temp = 35/0;
        System.out.println(temp);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();


    }
}

