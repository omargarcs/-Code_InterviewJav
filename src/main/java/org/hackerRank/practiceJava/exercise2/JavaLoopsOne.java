package org.hackerRank.practiceJava.exercise2;

import java.util.Scanner;

public class JavaLoopsOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputNumber = scan.nextInt();

        for (int i = 1; i<11; i++){
            int result = inputNumber * i;
            System.out.println(inputNumber + " x " + i + " = " + result);
        }
    }
}