package org.hackerRank.practiceJava.methodOverriding;

class Soccer extends  Sports{
    @Override
    String getName(){
        return "Generic Sport";
    }

    @Override
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in " + getName());
    }

}
