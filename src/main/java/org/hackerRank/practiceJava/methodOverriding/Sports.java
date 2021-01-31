package org.hackerRank.practiceJava.methodOverriding;

class Sports {
    String getName(){
        return "Generic Sport";
    }

    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName());
    }
}
