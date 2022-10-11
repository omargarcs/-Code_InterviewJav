package org.hackerRank.Algorithms.ComparetheTriplets;

import java.util.ArrayList;
import java.util.List;

public class Solution   {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> finalList = new ArrayList<>();
        int finalscoreA = 0;
        int finalscoreB = 0;

        for(int x = 0; x<a.size(); x++){
            if(a.get(x) > b.get(x))
            {
                finalscoreA += 1;
            }else if(a.get(x) < b.get(x)){
                finalscoreB += 1;
            }
            else{
                finalList.add(finalscoreA);
                finalList.add(finalscoreB);
            }
        }

        return finalList;

    }
}
