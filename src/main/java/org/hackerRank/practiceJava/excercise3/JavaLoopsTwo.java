package org.hackerRank.practiceJava.excercise3;

import java.util.Scanner;

public class JavaLoopsTwo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder strList = new StringBuilder();

        int t = in.nextInt();

        for (int i = 0; i<t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            strList.append(returnList(a,b,n) + "\n");
        }
        System.out.print(strList);

    }

    public static String returnList (int a, int b, int n){
        StringBuilder strInts = new StringBuilder();
        int result = 0;

        for(int x = 0; x<n; x++){
            result += (int) Math.pow(2,x) * b;
            strInts.append(result + a + " ");
        }
        return strInts.toString();

    }
}
