package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        double pi;
        double area;
        System.out.println("Enter a radius: ");
        radius = input.nextDouble();
        input.close();

        pi = 3.14;
        area = pi * (radius * radius);
        System.out.println("The area of a circle of radius " + radius + "is: " + area);

    }
}
