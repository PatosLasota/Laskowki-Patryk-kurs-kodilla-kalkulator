package com.kodilla;

public class Calculator {

    public double add(double num1,double num2){
        System.out.println("Adding " + num1 + " + " + num2 +" = " + (num1 + num2) );
        return num1+num2;
    }

    public double sub(double num1,double num2){
        System.out.println("Subtracting " + num1 + " - " + num2 + " = " + (num1-num2) );
        return num1-num2;
    }


    public static void   main(String[] args){
        Calculator calculator = new Calculator();
        calculator.add(1,2);
        calculator.sub(1,2);
    }
}
