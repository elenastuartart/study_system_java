package com.stuart.oop;

import com.stuart.oop.car.Car;
import com.stuart.oop.city.*;
import com.stuart.oop.computer.Computer;
import com.stuart.oop.computer.IMonitor;
import com.stuart.oop.computer.Monitor;
import com.stuart.oop.motorbike.Kawasaki;
import com.stuart.oop.motorbike.Ural;
import com.stuart.oop.music.Author;
import com.stuart.oop.music.Playlist;
import com.stuart.oop.music.Song;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        Kawasaki kawasaki = new Kawasaki("kavasaki1243", "13pro", "red", 12, 1987);
//        kawasaki.jump();
//        kawasaki.drive();
//        System.out.println();
//
//        Ural ural = new Ural("ural125", "m12", "black", 15,false);
//        ural.showInfo();
//        ural.drive();

//        Car car = new Car("Tesla");
//        car.drive();
//        car.stop();

//        Computer computer = new Computer("MacBook", new Monitor("Samsung"));
//        computer.on();
//        computer.off();

//        String str = "привет";
//        System.out.println(String.format("Распечатан текст %s длиной символов %d", str, 12));

        //задача плейлист
//        Playlist playlist = new Playlist();
//
//        Song song = new Song("Ангел", new Author("Ария"));
//        Song song1 = new Song("Свобода", new Author("Люмен"));
//        Song song2 = new Song("Половинка", new Author("Танцы минус"));
//        Song song3 = new Song("Кончается век", new Author("ЧижИКо"));
//
//        playlist.addSong(song);
//        playlist.addSong(song1);
//        playlist.addSong(song2);
//        playlist.addSong(song3);
//
//        playlist.playAllSongs();

        //задача город
        City city = new City("Москва");

        House house1 = new House("проспект Вернадского д.7");
        House house2 = new House("ул. Котовского д. 12");
        House house3 = new House("ул.Гагарина д.5");
        House house4 = new House("ул. Циолковского д. 23");
        House house5 = new House("ул. Юбилейная д. 8");

        //добавляем пустые дома в город
        city.addHouse(house1);
        city.addHouse(house2);
        city.addHouse(house3);
        city.addHouse(house4);
        city.addHouse(house5);

        //создаем коллекцию с пустыми квартирами
        ArrayList<IFlat> flatSet = new ArrayList<IFlat>();
        for (int i = 1; i < 11; i++) {
            Flat flat = new Flat(i);
            flatSet.add(flat);
        }

        //создаем коллекцию с жителями
        ArrayList<Settler> setllerSet = new ArrayList<Settler>();
        for (int i = 1; i < 16; i++) {
            Settler settler = new Settler("Житель" + i);
            setllerSet.add(settler);
        }

        //добавляем жителей в квартиры
        for (int i = 0; i < setllerSet.size(); i++) {
            if (i<10) {
                IFlat flat = flatSet.get(i);
                flat.addSettler(setllerSet.get(i));
            } else {
                IFlat flat = flatSet.get(i-10);
                flat.addSettler(setllerSet.get(i));
            }
        }

        //добавляем квартиры в дома
        for (int i = 0; i < city.getHouseList().size(); i++) {
            IHouse house = city.getHouseList().get(i);
            house.addFlat(flatSet.get(i));
            house.addFlat(flatSet.get(i+5));
        }

        System.out.println(city.toString());
        for (int i = 0; i < city.getHouseList().size(); i++) {
            IHouse house = city.getHouseList().get(i);
            System.out.println(house.toString());
            for (int j = 0; j < house.getFlatList().size(); j++) {
                IFlat flat = house.getFlatList().get(j);
                System.out.println(flat.toString());
                for (int k = 0; k < flat.getSettlerList().size(); k++) {
                    Settler settler = flat.getSettlerList().get(k);
                    System.out.println(settler.toString());
                }
            }
            System.out.println();
        }



        }
    }
