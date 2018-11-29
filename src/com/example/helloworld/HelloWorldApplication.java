package com.example.helloworld;

import com.example.com.example.helloworld2.Test;

public class HelloWorldApplication {
    public static void main(String[] args)
    {
        /*Car car = new Car();
        Human person = new Human();
        person.setName("Maaike");
        car.setOwner(person);

       Car car2 = new Car();
       Human person2 = new Human();
       person2.setName("Moustafa");
       car.setOwner(person2);

       System.out.println("Car owner:" + car.getOwner().getName());
       System.out.println("Car2 owner:" + car2.getOwner().getName());

       Square square = new Square();
       square.calcTest();
*/
        Test2 t = new Test2();
      //  t.testTest();

        Test test = new Test();
        int take5 = test.staticTest();

        System.out.println(take5);


    }
}
