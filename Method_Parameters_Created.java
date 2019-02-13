package com.company;

public class Method_Parameters_Created {

    public static void main(String[] args){

        sinano(true, 78, 98, 41);
        sinano(true, 56, 125, 34);
    }

    public static  void sinano(boolean paraBol, int gozumSun, int sanaNe, int derdiYok){

        if(paraBol = true) {
            int kralsin = (derdiYok + sanaNe) % gozumSun;
            System.out.println("netice = " + kralsin);
            // in order to more simplfy the code, we will omit the SystemPrintout option from here and send the result to main method and do printout work there

        }

    }
}
