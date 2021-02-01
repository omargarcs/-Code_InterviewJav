package org.hackerRank.practiceJava.substring;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        StringBuilder str = new StringBuilder();
        str.append(S);
        S = str.substring(start,end);
        System.out.println(S);
    }
}
