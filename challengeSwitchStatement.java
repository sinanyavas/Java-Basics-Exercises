package com.company;

public class challengeSwitchStatement {

    public static void main(String[] args){

        char myCharValue =  'B';
        switch (myCharValue){
            case 'A':{
                System.out.println("A");
                break;
            }case 'B': {
                System.out.println("B");
                break;
            }case '\u0043': {
                System.out.println("C");
                break;
            }case '\u0044': {
                System.out.println("D");
                break;
            }case '\u0045': {
                System.out.println("E");
                break;
            }default:
                System.out.println("not found");
                break;
        }

    }

}


