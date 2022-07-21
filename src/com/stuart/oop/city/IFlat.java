package com.stuart.oop.city;

import java.util.ArrayList;

public interface IFlat {
    int getNumber();

    ArrayList<Settler> getSettlerList();

    void addSettler(Settler settler);
}
