package com.company;

public class ChallangeForSession {


    public static void main(String[] args) {

        int highScore = calculateHighScorePosition(1100);
        disPlayHighScorePosition("tim", highScore);
        highScore = calculateHighScorePosition(765);
        disPlayHighScorePosition("martin", highScore);
        highScore = calculateHighScorePosition(345);
        disPlayHighScorePosition("sinan", highScore);
        highScore = calculateHighScorePosition(23);
        disPlayHighScorePosition("mehmet", highScore);
        highScore = calculateHighScorePosition(1000);
        disPlayHighScorePosition("Louise", highScore);


    }

    public static void disPlayHighScorePosition(String playerName, int position) {

        System.out.println(playerName + " managed to get into position " + position + " on the high score table");

    }

    public static int calculateHighScorePosition(int score) {

//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        }
//        return 4;

        int position = 4;
        if(score >= 1000) {
            position = 1;
        }else if(score>=500) {
            position = 2;
        }else if(score>=100) {
            position = 3;
        }return position;
    }

}
