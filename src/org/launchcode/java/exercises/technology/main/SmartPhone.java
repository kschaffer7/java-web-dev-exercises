package org.launchcode.java.exercises.technology.main;

public class SmartPhone extends Computer{
    private int numberOfSelfies;

    public SmartPhone(String brand, int storage, int ram, int numberOfSelfies){
        super(brand, storage, ram);
        this.numberOfSelfies = numberOfSelfies;
    }

    public void deleteSelfies(int number) {
        if(this.numberOfSelfies - number < 0) {
            System.out.println("You can't delete selfies that don't exist!");
        } else {
            this.numberOfSelfies -= number;
        }
    }
}
