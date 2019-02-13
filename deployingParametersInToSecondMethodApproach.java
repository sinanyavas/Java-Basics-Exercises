package com.company;

public class deployingParametersInToSecondMethodApproach {

    public static void main(String[] args) { // in this example we are calling calculate Score method into Main method.. Do not change main method name or settings as it is a template of rules

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(true, 800, levelCompleted, bonus); // instead of writing the value of parameter, we can write the name of parameter. by default the first defined value will be assigned.
        calculateScore(true, 10000, 8, 200);

    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("your final score was = " + finalScore);
        }
    }
}
