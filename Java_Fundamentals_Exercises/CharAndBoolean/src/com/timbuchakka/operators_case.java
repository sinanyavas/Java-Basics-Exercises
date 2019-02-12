package com.timbuchakka;

public class operators_case {
    public static void main(String[] args){

        double mydoublenum=20;
        double myseconddoublenum=80;
        double mytotal=(mydoublenum+myseconddoublenum)*25;
            System.out.println("mytotal is =" +mytotal);
        double myfinaltotal=mytotal%40;
        System.out.println("myfinaltotal is =" + myfinaltotal);
        if(myfinaltotal<=20)
            System.out.println("Total was over the limit");


    }


}
