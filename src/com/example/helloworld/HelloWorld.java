package com.example.helloworld;

public class HelloWorld {

    public static void main(String[] args) {

        Square s = new Square();
        s.length1 = 4;
        s.length2 = 4;

        System.out.println(s.calcCircumference(4));
        System.out.println(s.calcCircumference(4, 4));
    }
}
