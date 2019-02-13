package com.company;

public class Main {

    public static void main(String[] args) {
        // Methods in JAVA are used to avoid duplications in code and also maintain it easily.

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

            calculateScore();

            score = 10000;
            levelCompleted = 8;
            bonus = 200;

            if (gameOver = true) {
                int finalscore = score + (levelCompleted * bonus);
                System.out.println("your final score was = " + finalscore);
        }
    }

    public static void calculateScore(){

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver == true) {
            // if(gameover) is exactly same as if(gmaeOver==true)
            int finalscore = score + (levelCompleted * bonus);
            finalscore += 1000;
            System.out.println("your final score was = " + finalscore);
        }
    }

}
