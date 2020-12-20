package org.launchcode.java.exercises.technology.main;

public class Main {
    public static void main(String[] args){

        Computer computer = new Computer( "Lenovo", 512, 16);
        Laptop laptop = new Laptop("Dell", 500, 16, 16);
        SmartPhone smartPhone = new SmartPhone("Motorola", 32, 16, 25);
        laptop.addRam(5);
        System.out.println(laptop.isClunky());
        System.out.println(computer.makeBeeDoop());
        smartPhone.makeBeeDoop();
        smartPhone.deleteSelfies(30);

        System.out.println(computer.getId());
        System.out.println(laptop.getId());
        System.out.println(smartPhone.getId());
    }
}
