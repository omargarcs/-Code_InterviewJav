package org.hackerRank.practiceJava.skillsCertificationTest.question4;

interface Syrupable {
    void getSugary();
}

abstract class Pancake implements Syrupable{}

class BlueBerryPancake{ //implements Pancake
    public void getSugary() { ; }
}

class SourdoughBlueBerryPancake extends BlueBerryPancake{
    public void getSugary(int s) { ; }
}
