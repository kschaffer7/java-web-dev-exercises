package org.launchcode.java.studios.FunWithQuizzes;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoice extends Question {

    private ArrayList<String> possibleAnswers;
    private int correctAnswer;

    public MultipleChoice(String question, int pointValue, ArrayList<String> possibleAnswers, int correctAnswer) {
        super(question, pointValue);
        this.correctAnswer = correctAnswer;
        this.possibleAnswers = possibleAnswers;
    }

    @Override
    public void displayAnswers() {
        for(String answer: possibleAnswers) {
            System.out.println(answer);
        }
    }

    public boolean isCorrectAnswer(int possibleAnswer) {
        if (possibleAnswer == this.correctAnswer) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getAnswers() {
        Scanner answer = new Scanner(System.in);
        System.out.println("Please choose the correct option.");
        int userAnswer = answer.nextInt();
        if (isCorrectAnswer(userAnswer)) {
            return 1;
        } else {
            return 0;
        }
    }

}


// Which cat is the fastest?
// a: cheetah
// b: jaguar
// c: cougar
// d: mountain lion
