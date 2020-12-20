package org.launchcode.java.exercises.technology.main;

public class Computer extends AbstractEntity{
    //fields
    private String brand;
    private int storage;
    private int ram;

    //constructor
    public Computer(String brand, int storage, int ram) {
        this.brand = brand;
        this.storage = storage;
        this.ram = ram;
    }

    // methods

    public void addRam(int newRam){
        this.ram += newRam;
        if(newRam % 8 == 8) {
            this.ram += newRam;
        } else {
            System.out.println("Ram can only be added in multiples of 8.");
        }
    }

    public String makeBeeDoop() {
        return "Bee Doop";
    }

    public int getRam() {
        return ram;
    }
}
