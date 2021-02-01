package org.redhat.exam1.excercise1;

public class Main{
    public static void main(String[] args) {
        Food fastFood = new FastFood("FastFood", "FastFood");
        Food fruit = new Fruits("Fruits", "Fruits");
        Food food = new Food();

        System.out.println("My name is: " + fastFood.getName());
        System.out.println("My name is: " + fruit.getName());
        System.out.println("Our superclass is " + food.getClass().toString());
        System.out.println("I'm serving: " + fastFood.getServicing());
        System.out.println("I'm serving: " + fruit.getServicing());

    }
}
