package org.redhat.SecondExam.FindtheOutput;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.divide(2,3);

    }

    public int divide(int a, int b){
        int c = -1;

        try{
            c = a/b;
        }catch (Exception e){
            System.err.println("Exception");
        }finally {
            System.err.println("Finally");
        }

        return c;
    }
}
