package com.timbuchakka;

public class NumbersDifferenVarriableTypes {

    public static void main(String[] args){
        int minValue= -2_147_483_648; // integer type data covers numbers between -2147483648 and 2147483647
        int maxValue = 2_147_483_647; // int has a width of 32
        int myTotalValue=(minValue/2);

        byte mybyteValue = 127; // byte type data covers numbers between -128 and 127
        byte mynewbyteValue=(byte) (mybyteValue/2); // byte has a width of 8

        short myShortValue = -32767; //short type data cover numbers between -32768 and 32767
        short mynewShortValue=(short) (myShortValue/2); //short has a width of 32

        long mylongValue=100L; //long has a width of 64


    }
}
