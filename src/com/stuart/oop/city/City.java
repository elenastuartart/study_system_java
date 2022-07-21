package com.stuart.oop.city;

import java.util.ArrayList;

public class City implements ICity {

    String name;
    ArrayList <IHouse> houseList = new ArrayList<>();

    public City(String name) {
        this.name = name;
    }

    @Override
    public void showSettledList() {

    }

    @Override
    public void addHouse(IHouse iHouse) {
        this.houseList.add(iHouse);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ArrayList<IHouse> getHouseList() {
        return this.houseList;
    }

    @Override
    public String toString() {
        return "Город: "  + name;
    }
}
