package org.hackerRank.practiceJava.interfacesI;

class MyCalculator implements AdvancedArithmetic{
    @Override
    public int divisor_sum(int n) {
        int divisor = 0;
        for(int x = 1; x<=n; x++){
            if(n%x == 0){
                divisor += x;
            }
        }
        return divisor;
    }
}
