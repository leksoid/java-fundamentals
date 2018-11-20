package com.epam.cdp.java_testng.aliaksei_taran.task2;

import java.util.Scanner;

/*
 * Task #2
 * Created by
 * USER: Aliaksei_Taran
 * DATE: 11/15/2018
 * TIME: 3:23 PM
 */

public class StringProcessor {

    private Scanner scanner;

    public Scanner initScanner(){
        return this.scanner = new Scanner(System.in);
    }

    public String getStringFromUser(){
        return this.scanner.nextLine();
    }

    public void compareLengths(String initial, String compareTo){
        if (initial.length()>compareTo.length()){
            System.out.println("The longest string is " + initial);
            System.out.println("The shortest string is " + compareTo);
        } else if (initial.length() == compareTo.length()) {
            System.out.println("String lengths equal");
        } else {
            System.out.println("The longest string is " + compareTo);
            System.out.println("The shortest string is " + initial);
        }
    }
}
