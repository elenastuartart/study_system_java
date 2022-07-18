package com.stuart.oop;

import com.stuart.oop.motorbike.Kawasaki;
import com.stuart.oop.motorbike.Ural;

public class Main {

    public static void main(String[] args) {
        Kawasaki kawasaki = new Kawasaki("kavasaki1243", "13pro", "red", 12, 1987);
        kawasaki.jump();
        kawasaki.drive();
        System.out.println();

        Ural ural = new Ural("ural125", "m12", "black", 15,false);
        ural.showInfo();
        ural.drive();
    }
}
