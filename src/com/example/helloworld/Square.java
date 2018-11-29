package com.example.helloworld;

import com.example.helloworld.sub.ProtectedTest;

public class Square {
    int length1;
    int length2;
    int length3;
    int length4;

    public int getLength1() {
        return length1;
    }

    public void setLength1(int length1) {
        this.length1 = length1;
    }

    public int getLength2() {
        return length2;
    }

    public void setLength2(int length2) {
        this.length2 = length2;
    }

    public int getLength3() {
        return length3;
    }

    public void setLength3(int length3) {
        this.length3 = length3;
    }

    public int getLength4() {
        return length4;
    }

    public void setLength4(int length4) {
        this.length4 = length4;
    }

    protected int calcTest(){
        return 3;
    }

    public int calcCircumference(int length){
        System.out.println("first method");
        return 4*length;
    }

    public int calcCircumference(int length1, int length2){
        System.out.println("second  method");

        return 2*(length1+length2);

    }
}
