package com.stuart.oop.city;

import java.util.ArrayList;

public interface ICity {
    void showSettledList();

    void addHouse(IHouse iHouse);

    String getName() ;

    ArrayList<IHouse> getHouseList();
}
