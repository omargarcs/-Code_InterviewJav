package org.hackerRank.Algorithms.plusMinus;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        DecimalFormat df = new DecimalFormat("0.000000");
        double positiveNumbers = 0;
        double zeroNumbers = 0;
        double negativeNumbers = 0;
        double totPositive = 0;
        double totNegative = 0;
        double totZeros = 0;

        for(int x = 0; x<arr.length; x++){
            if(arr[x] == 0){
                zeroNumbers++;
            }else if(arr[x] > 0){
                positiveNumbers++;
            }else{
                negativeNumbers++;
            }
        }

        totPositive = positiveNumbers / arr.length;
        totNegative = negativeNumbers / arr.length;
        totZeros = zeroNumbers / arr.length;

        System.out.println(df.format(totPositive) + "\n" + df.format(totNegative) + "\n" + df.format(totZeros));


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
