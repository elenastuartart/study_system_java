package com.stuart.oop.motorbike;

import com.stuart.oop.Transport;

public class Motorbike extends Transport {

    private double volume;

    public Motorbike() {
        super();
        System.out.println("motorbike");
    }

    public Motorbike(String name, String model, String color) {
        super(name, model, color);
    }

    public Motorbike(String name, String model, String color, double volume) {
        super(name, model, color);
        this.volume = volume;
    }

    @Override
    public void drive() {
        System.out.println("drive motorbike");

    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
