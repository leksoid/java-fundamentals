package com.epam.cdp.java_testng.aliaksei_taran.task3;

import java.util.Scanner;

/*
 * Created by
 * USER: Aliaksei_Taran
 * DATE: 11/19/2018
 * TIME: 12:58 PM
 */
public class Calculator {
    private int x;
    private int y;
    private String command;
    private Scanner scanner;

    public Scanner initScanner() {
        return this.scanner = new Scanner(System.in);
    }

    public void getInputFromUser(){
        this.x = this.scanner.nextInt();
        this.command = this.scanner.next();
        this.y = this.scanner.nextInt();
    }

    public void performCommand(){
        switch (this.command){
            case "+":
                System.out.println("The result of operation is: " + addition());
                break;
            case "-":
                System.out.println("The result of operation is: " + subtraction());
                break;
            case "*":
                System.out.println("The result of operation is: " + multiplication());
            case "/":
                System.out.println("The result of operation is: " + division());
        }
    }

    private int addition(){
        return this.x + this.y;
    }

    private int subtraction(){
        return this.x - this.y;
    }

    private int multiplication(){
        return this.x * this.y;
    }

    private double division(){
        double result = 0.0;
        try {
            result = ((double) this.x / this.y);
        } catch (ArithmeticException e){
            e.printStackTrace();
        }
        return result;
    }

}
