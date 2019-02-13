package com.company;

public class CodingExercises_1_positiveNegativeAndZero {

    public static void main(String[] args) {

        checkNumber(7);
        checkNumber(-5);
        checkNumber(0);
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("number is positive");
        } else if (number == 0) {
            System.out.println("number equals zero");
        } else {
            System.out.println("number is negative");
        }

    }

}





