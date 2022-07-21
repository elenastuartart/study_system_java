package com.stuart.oop.city;

import java.util.ArrayList;

public class Flat implements IFlat {

    private int number;
    ArrayList<Settler> settlerList = new ArrayList<>();

    public Flat(int number) {
        this.number = number;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public ArrayList<Settler> getSettlerList() {
        return settlerList;
    }

    @Override
    public void addSettler(Settler settler) {
        if (settlerList.size() < 2)
            this.settlerList.add(settler);
        else
            System.out.println("Нельзя заселить больше 2 жителей в квартиру " + this.number);
            return;
    }

    @Override
    public String toString() {
        return "Квартира: "  + number ;
    }
}
