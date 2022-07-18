package com.stuart.oop.motorbike;

public class Kawasaki extends Motorbike {
    private int year;

    public Kawasaki() {
        super();
        System.out.println("kawasaki");
    }

    public Kawasaki(String name, String model, String color, double volume) {
        super(name, model, color, volume);
    }

    public Kawasaki(String name, String model, String color, double volume, int year) {
        super(name, model, color, volume);
        this.year = year;
    }

    public void jump () {
        System.out.println("Kawasaki jump");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
