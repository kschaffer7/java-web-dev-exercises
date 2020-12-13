package org.launchcode.java.demos.lsn4classes2;

import java.util.Scanner;

public class School {
    public static void main(String[] args){
        Student bo = new Student("Bo");
        bo.setNumberOfCredits(67);
        bo.setGpa(3.9);
        System.out.println(bo);

        Student bo2 = new Student("Bo");
        Scanner input = new Scanner(System.in);
        bo2.setNumberOfCredits(67);
        bo2.setGpa(3.9);
        System.out.println(bo.equals(bo2));
    }
}
