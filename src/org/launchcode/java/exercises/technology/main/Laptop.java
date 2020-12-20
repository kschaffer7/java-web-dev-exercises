package org.launchcode.java.exercises.technology.main;

public class Laptop extends Computer{

    private int screenSize;

    public Laptop(String brand, int storage, int ram, int screenSize) {
        super(brand, storage, ram);
        this.screenSize = screenSize;
    }

    public boolean isClunky() {
        return this.screenSize > 15;
    }

}
