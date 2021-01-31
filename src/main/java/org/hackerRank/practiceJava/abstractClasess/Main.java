package org.hackerRank.practiceJava.abstractClasess;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {
        MyBook new_novel = new MyBook();
        new_novel.setTitle("A tale of two cities");
        System.out.println("The title is:" + new_novel.getTitle());
    }

}
