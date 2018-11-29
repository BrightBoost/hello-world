package com.example.helloworld;

public class Human {

    Human(){

    }

    Human(String name, int age){
        this.name = name;
    }

    Human(int age, String bsnHuman) {

    }

    Human(String nameHuman, int ageHuman, String bsnHuman){
        this.name = nameHuman;
        this.age = ageHuman;
        this.bsn = bsnHuman;
    }
    private String name;
    private int age;
    private String bsn;

    public boolean getAccess()
    {
        return true;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBsn() {
        return bsn;
    }

    public void setBsn(String bsn) {
        this.bsn = bsn;
    }

}
