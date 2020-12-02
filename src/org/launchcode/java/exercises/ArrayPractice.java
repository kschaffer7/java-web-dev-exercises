package org.launchcode.java.exercises;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        //Create and initialize an array with the following values in a single line: 1, 1, 2, 3, 5, 8.
        int[] randomNumbers = {1, 1, 2, 3, 5, 8};
        //Loop through the array and print out each value, then modify the loop to only print the odd numbers.
        //For each loop assigns a integer on each iteration of randomNumbers
        for (int num: randomNumbers) {
            if(num % 2 != 0){
                System.out.println(num);
            }
        }
        //Use the split method to divide the string at each space and store the individual words in an array.
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] phraseArray = phrase.split(" ");
        System.out.println(Arrays.toString(phraseArray));

        //change the delimiter to split the string into separate sentences.
        String[] sentences = phrase.split("\\. ");
        System.out.println(Arrays.toString(sentences));
    }
}

//Below also works for printing odds, but this for loop can be made simpler though as seen above
//This way would work better if knowing where you are at in the loop is needed
//public class ArrayPractice {
//
//    public static void main(String[] args) {
//        int[] randomNumbers = {1, 1, 2, 3, 5, 8};
//        for (int i = 0; i < 6; i++) {
//            if(randomNumbers[i] % 2 != 0){
//                System.out.println(randomNumbers[i]);
//            }
//        }
//    }
//}