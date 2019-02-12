package com.timbuchakka;

public class Main {

    public static void main(String[] args) {
        boolean gameover = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        calculateScore(true, 10000, levelCompleted, bonus);

        if(gameover){
            int finalScore=score+(levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }

    public static void calculateScore(boolean gameover, int score, int levelCompleted, int bonus) {

        if (gameover) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);

        }
    }


}
