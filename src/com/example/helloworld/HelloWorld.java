package com.example.helloworld;

public class HelloWorld {

    public static void main(String[]args)
    {
        Human husam = new Human();
        husam.setName("Husam");
        husam.setAge(30);
        husam.setBsn("124");

        Car car = new Car();
        car.setColor("Red");
        car.setModel("");
        car.setOwner(husam);

        System.out.println("The car owner:" + car.getOwner().getName() );
    }

    public void createSomething()
    {

    }

}
