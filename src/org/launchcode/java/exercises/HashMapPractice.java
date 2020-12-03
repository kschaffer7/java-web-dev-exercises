package org.launchcode.java.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {
        //Here, <Integer, String> defines the data types for this map’s <key, value> pairs.
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // It takes in student names and ID numbers (as integers)
        do {

            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID Number: ");
                int idNumber = input.nextInt();
                //We can add a new item with a .put() method, specifying both key and value
                //The keys should be the IDs and the values should be the names.
                students.put(idNumber, newStudent);

                // Read in the newline before looping back (this is another solution similar to input.skip("\n")
                input.nextLine();
            }

        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }
    }
}
