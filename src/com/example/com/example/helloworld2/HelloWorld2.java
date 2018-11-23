package com.example.com.example.helloworld2;

import com.example.helloworld.*;
import com.sun.deploy.util.ArrayUtil;
import org.apache.commons.lang.ArrayUtils;

import java.util.Arrays;

public class HelloWorld2 {
    public static void main(String[] args)
    {
        Human husam = new Human();
        husam.setName("Husam");
        husam.setAge(30);
        husam.setBsn("124");

        Car car = new Car();
        car.setColor("Red");
        car.setModel("");
        car.setOwner(husam);
        car.setSpeed(120);
        car.setMaxSpeed(130);
       /* System.out.println("The car owner:" + car.getOwner().getName() );
        System.out.println("enginestatus:" + car.getEngineStatus());
        car.startEngine();
        System.out.println("enginestatus2:" + car.getEngineStatus());

        System.out.println("before acc speed:" + car.getSpeed());
        car.accelorate(7);
        System.out.println("after acc1 speed:" + car.getSpeed());
        car.accelorate(20);
        System.out.println("after acc2 speed:" + car.getSpeed());*/

       String[] array = {"first element", "second", "third"};
       //car.setDoors(husamDoors);
       // System.out.println("doors closed?:" + car.checkDoorsClosed());
       // System.out.println("array element: " + array[1]);

        //array. = .removeElement(array, 1);

        int number = 10;
        int max = 12;

        do {
            System.out.println("do: " + number);
            number = number + 1;
        }
        while(number < max) ;

        System.out.println("while: " + number);
        System.out.println("while max: " + max);



    }
}
