package com.example.helloworld;

public class Car {
    private String color;
    private String model;
    private int speed;
    private Human owner;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

	//amazing addition
    //wel in branche ilone, maar nog niet in master
    protected int id;
}

