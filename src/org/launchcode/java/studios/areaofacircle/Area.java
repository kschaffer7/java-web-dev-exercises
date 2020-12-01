package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner firstUserInput = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = firstUserInput.nextDouble();
        firstUserInput.skip("\n");
        if(radius < 0){
            System.out.println("Cannot use negative numbers");
        } else {
            double area = Circle.getArea(radius);
            System.out.println("The area of a circle of radius " + radius + " 2.is: " + area);
        }

        firstUserInput.close();
    }
}
