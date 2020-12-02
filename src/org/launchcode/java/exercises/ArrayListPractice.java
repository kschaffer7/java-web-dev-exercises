package org.launchcode.java.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args){
        ArrayList<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(4, 5, 6, 2, 8, 12, 64, 63, 23, 22));
        System.out.println(sumEvens(listOfNumbers));

        Scanner input = new Scanner(System.in);
        System.out.println("How long should the words be?");
        int length = input.nextInt();
        input.skip("\n");
        ArrayList<String> listOfWords = new ArrayList<>(Arrays.asList("Hello", "There", "This", "Pinky", "Throw"));
        print5LetterWords(listOfWords, length);
        input.close();
    }

    public static int sumEvens(ArrayList<Integer> numbers){
        int total = 0;
        for(int number: numbers){
            if(number % 2 == 0){
                total += number;
            }
        }
        return total;
    }

    public static void print5LetterWords(ArrayList<String> words, int length){
        for(String word: words){
            if(word.length() == length){
                System.out.println(word);
            }
        }
    }
}
