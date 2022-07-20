package com.stuart.oop.motorbike;

public class Ural extends Motorbike {

    private boolean firstAidKit;

    public boolean isFirstAidKit() {
        return firstAidKit;
    }

    public Ural(boolean firstAidKit) {
        this.firstAidKit = firstAidKit;
    }

    public Ural(String name, String model, String color, boolean firstAidKit) {
        super(name, model, color);
        this.firstAidKit = firstAidKit;
    }

    public Ural(String name, String model, String color, double volume, boolean firstAidKit) {
        super(name, model, color, volume);
        this.firstAidKit = firstAidKit;
    }

    public void showInfo() {
        System.out.println(this.getName());
        System.out.println(this.getVolume());

        System.out.println(this.isFirstAidKit());
    }

    @Override
    public void drive() {
        System.out.println("drive ural");;
    }
}
