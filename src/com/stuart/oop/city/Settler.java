package com.stuart.oop.city;

public class Settler {

    private String name;

    public Settler(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Житель " + name ;
    }
}
