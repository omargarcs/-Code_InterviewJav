package org.hackerRank.practiceJava.stringsIntroduction;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int sumLenght = countLenght(A, B);
        System.out.println(sumLenght);
        System.out.println(alphabeticalOrder(A, B));
        System.out.println(parserString(A, B));


    }

    public static int countLenght(String a, String b){
        int lenghtA = a.length();
        int lenghtB = b.length();
        int result = lenghtA + lenghtB;
        return result;
    }

    public static String alphabeticalOrder(String a, String b){

        if (a.compareTo(b) > 0){
            return "Yes";
        }

        return "No";
    }

    public static String parserString(String a, String b){
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        str1.append(a);
        str1.replace(0,1, String.valueOf(a.toUpperCase().charAt(0)));
        str2.append(b);
        str2.replace(0,1, String.valueOf(b.toUpperCase().charAt(0)));
        return str1 + " " + str2;
    }
}
