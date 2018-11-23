package com.example.com.example.helloworld2;

import com.example.helloworld.Human;

public class Car {
    private String color;
    private String model;
    private int speed;
    private Human owner;
    private Boolean engineStatus = false;
    private int maxSpeed;
    private String[] doors;

    public Boolean getEngineStatus() {
        return engineStatus;
    }

    public void setEngineStatus(Boolean engineStatus) {
        this.engineStatus = engineStatus;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String[] getDoors() {
        return doors;
    }

    public void setDoors(String[] doors) {
        this.doors = doors;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Human getOwner() {
        return owner;
    }

    public void setOwner(Human owner) {
        this.owner = owner;
    }

    public void startEngine() {
        //first check whether engine is on already
        if(engineStatus == false)
        {
            //start engine
            engineStatus = true;
        }
        else
        {

        }
    }

    public void accelorate(int increaseSpeed) {
        if(speed < maxSpeed)
        {
            if((speed + increaseSpeed) >= maxSpeed)
            {
                speed = maxSpeed;
            }
            else
            {
                speed = speed + increaseSpeed;
            }
        }
    }

    public Boolean checkDoorsClosed() {
        for(String door :  doors)
        {
            if(door.equals("open"))
            {
                return false;
            }
        }
        return true;

    }

}

