package com.company;

public class challengeEasy {

    public static void main(String[] args){
        displayHighScorePosition("Tim", 1);
        displayHighScorePosition("Sarah", 2);
        displayHighScorePosition("Hasso", 3);
        displayHighScorePosition("Sino", 4);
        displayHighScorePosition("xece", 7);


    }

    public static void displayHighScorePosition(String playerName, int positionInTable){

        if (positionInTable == calculateHighScorePosition(1500)) {
            System.out.println(playerName + " managed to get into position " + positionInTable + " on the highscore table");
        }if (positionInTable == calculateHighScorePosition(900)) {
            System.out.println(playerName + " managed to get into position " + positionInTable + " on the highscore table");
        }if (positionInTable == calculateHighScorePosition(400)) {
            System.out.println(playerName + " managed to get into position " + positionInTable + " on the highscore table");
        }if (positionInTable == calculateHighScorePosition(50)) {
            System.out.println(playerName + " managed to get into position " + positionInTable + " on the highscore table");
        }if (positionInTable == calculateHighScorePosition(7850)) {
            System.out.println(playerName + " managed to get into position " + positionInTable + " on the highscore table");
        }


    }

    public static int calculateHighScorePosition(int score){
    if(score>1000){
        return 1;
    }else if(score < 1000 && score > 500){
        return 2;
    }else if(score < 500 && score > 100){
        return 3;
    }else
        return 4;

    }

}
