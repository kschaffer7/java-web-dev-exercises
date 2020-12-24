package org.launchcode.java.studios.FunWithQuizzes;

import java.util.List;

public abstract class Question {
    private String question;
    private int pointValue;

    public Question(String question, int pointValue) {
        this.question = question;
        this.pointValue = pointValue;
    }

    public void displayQuestion() {
        System.out.println(this.question);
    }

    //Changes point value
    public void setPointValue(int x) {
        this.pointValue = x;
    }

    public int getPointValue() {
        return pointValue;
    }

    public abstract void displayAnswers();

    public abstract int getAnswers();
}
