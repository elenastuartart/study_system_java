package com.stuart.oop.computer;

public class Monitor implements IMonitor {

    private String name;

    @Override
    public String getName() {
        return name;
    }

    public Monitor(String name) {
        this.name = name;
    }
}
