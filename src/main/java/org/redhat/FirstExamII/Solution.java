package org.redhat.FirstExamII;

import java.util.*;
import java.util.Scanner;
class myCalculator{

    int power(int n,int p) throws Exception
    {
        if(n<0 || p<0) throw new Exception("n and p should be non-negative");
        if(p==0) return 1;
        return n*power(n,p-1);
    }
}

//Complete the main function
class Solution{

    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);

        while(in.hasNextInt())
        {
            int n = in.nextInt();
            int p = in.nextInt();
            myCalculator M = new myCalculator();
            try
            {
                System.out.println(M.power(n,p));
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }

    }
}
