package com.stuart.oop.city;

import java.util.ArrayList;

public class House implements IHouse {

    private String address;
    ArrayList<IFlat> flatList = new ArrayList<>();


    public House(String address) {
        this.address = address;
    }

    @Override
    public void addFlat(IFlat iFlat) {
        this.flatList.add(iFlat);
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public ArrayList<IFlat> getFlatList() {
        return flatList;
    }

    @Override
    public String toString() {
        return "Дом: "  + address ;
    }
}
