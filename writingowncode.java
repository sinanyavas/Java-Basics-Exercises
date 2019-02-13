package com.company;

public class writingowncode {

    public static  void main(String[] args) {

        cano(true, 800, 400, 700);
        cano(true, 500, 72, 634);


    }

    public static void cano(boolean GameOver, int score, int levelCompleted, int bonus){
        if (GameOver = true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("your final score is = " + finalScore);


        }
    }
}
