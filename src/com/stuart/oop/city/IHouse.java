package com.stuart.oop.city;

import java.util.ArrayList;

public interface IHouse {

    void addFlat(IFlat iFlat);

    String getAddress();

    ArrayList<IFlat> getFlatList();
}
