package com.stuart.oop.car;

public class Car implements ICar {

    private String name;

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void drive() {
        System.out.println(getName() + " drive " );
    }

    @Override
    public void stop() {
        System.out.println(getName() + " stop ");
    }

}
