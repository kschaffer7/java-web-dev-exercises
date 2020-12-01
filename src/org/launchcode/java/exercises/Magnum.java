package org.launchcode.java.exercises;
import java.util.Scanner;

public class Magnum {
    public static void main(String[] args) {
        double length;
        double width;
        double area;
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of your rectangle?");
        length = input.nextDouble();
        System.out.println("What is the width of your rectangle?");
        width = input.nextDouble();
        input.close();

        area = length * width;
        System.out.println("The area of your rectangle is: 5" + area);
    }
}
