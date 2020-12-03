package org.launchcode.java.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args){
        // Within main, create a list with at least 10 integers and call your method on the list.
        ArrayList<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 5, 4, 3, 2, 1));
        System.out.println(sumEvens(listOfNumbers));
        //Modify your code to prompt the user to enter the word length for the search.
        Scanner input = new Scanner(System.in);
        System.out.println("How long should the words be?");
        int length = input.nextInt();
        input.skip("\n");
        ArrayList<String> listOfWords = new ArrayList<>(Arrays.asList("I", "Bo", "am", "a", "Mamas", "boy"));
        print5LetterWords(listOfWords, length);
        input.close();
    }
    // Write a static method to find the sum of all the even numbers in an ArrayList.
    public static int sumEvens(ArrayList<Integer> numbers){
        int total = 0;
        for(int number: numbers){
            if(number % 2 == 0){
                total += number;
            }
        }
        return total;
    }
    // Write a static method to print out each word in a list that has exactly 5 letters.
    //Modify your code to prompt the user to enter the word length for the search.
    public static void print5LetterWords(ArrayList<String> words, int length){
        for(String word: words){
            if(word.length() == length){
                System.out.println(word);
            }
        }
    }
}
