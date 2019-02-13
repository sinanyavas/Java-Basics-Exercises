package com.company;

public class ReturnVoidMethods {

    public static void main(String[] args){

       int highScore = sinano(true, 78, 98, 41);
        System.out.println("simdi daha bi kralsin = " + highScore);

        highScore = sinano(true, 56, 125, 34);
        System.out.println("simdi daha bi kralsindan da ote = " + highScore);

    }

    public static  int sinano(boolean paraBol, int gozumSun, int sanaNe, int derdiYok){

        if(paraBol = true) {
            int kralsin = (derdiYok + sanaNe) % gozumSun;
            return kralsin;
        }
        return -1;
    }

}
