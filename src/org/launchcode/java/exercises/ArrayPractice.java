package org.launchcode.java.exercises;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] randomNumbers = {1, 1, 2, 3, 5, 8};
        for (int i = 0; i < 6; i++) {
            if(randomNumbers[i] % 2 != 0){
                System.out.println(randomNumbers[i]);
            }
        }

//        String[] notRhyme = {"I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse."};
//        notRhyme.split(" ");
//        System.out.println(Arrays.toString(notRhyme));
    }
}
