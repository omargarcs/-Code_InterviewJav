package org.globant.interview.excercise;

import java.util.ArrayList;
import java.util.List;

public class ExerciseOne {
    public static void main(String[] args) {
        countSameNumber(3, 4 , 3);
        countSameNumber(1, 1 , 1);
        countSameNumber(3, 4 , 1);
    }

    public static void countSameNumber(int a, int b, int c){
        List<Integer> listNumber = new ArrayList<Integer>();
        int count = 0;
        listNumber.add(a);
        listNumber.add(b);
        listNumber.add(c);

        for (int i = 0; i<listNumber.size(); i++)
        {
            if(listNumber.get(0) == listNumber.get(i)){
                count++;
            }
        }
        System.out.println(listNumber + " " + count);
    }

}
