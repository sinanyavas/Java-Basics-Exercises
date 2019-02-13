package com.company;

public class avoidingDuplicationByDividingCodeToMethods {

    public static void dividingCodeToMethods() {

        // We have decided to write variables only once in a seperate method, then call that method into the main Method/codebloc.
        // if we follow this approach, we will need to write another method for the second part of ececution and call that one to the main method as well. Obviously this is not the mist practical way of doing it. there is a much easier way.

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

    public static void calculateScore() {

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

