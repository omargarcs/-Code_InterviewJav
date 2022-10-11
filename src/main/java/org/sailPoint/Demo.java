package org.sailPoint;

class Being{
    static int count = 0;

    public Being(){
        count ++;
        System.out.println("Beign is created");
    }

    public void getCount(){
        System.out.println("There are" + count + "beign");
    }
}

class Human extends Being{
    public Human(){
        System.out.println("Human is created");
    }
}

class Animal extends Being{
    public Animal(){
        System.out.println("Animal is created");
    }
}

class Dog extends Animal{
    public Dog(){
        System.out.println("Dog is created");
    }
}

class Rock{
    static int count = 0;

    public Rock(){
        count ++;
        System.out.println("Rock is created");
    }

    public void getCount(){
        System.out.println("There are" + count + "nonebeigns");
    }
}

public class Demo {
    public static void main(String[] args) {
        Human human = new Human();
        Dog dog = new Dog();
        Rock rock = new Rock();

        human.getCount();
        dog.getCount();
        rock.getCount();
    }
}
