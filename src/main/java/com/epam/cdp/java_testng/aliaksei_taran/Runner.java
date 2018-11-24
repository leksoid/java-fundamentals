package com.epam.cdp.java_testng.aliaksei_taran;

import com.epam.cdp.java_testng.aliaksei_taran.task1.RandomArrayClient;
import com.epam.cdp.java_testng.aliaksei_taran.task2.StringProcessor;
import com.epam.cdp.java_testng.aliaksei_taran.task3.Calculator;

import java.util.List;
import java.util.Scanner;

/*
 * Created by
 * USER: Aliaksei_Taran
 * DATE: 11/15/2018
 * TIME: 11:19 AM
 */

public class Runner {
    private static Scanner scanner;

    public static void main (String[] args){

        RandomArrayClient ra = new RandomArrayClient();
        ra.generateRandomArray(20);
        ra.printOutArray();
        ra.replaceOdds(0);
        ra.printOutArray();

        Calculator calc = new Calculator();
        calc.initScanner();
        calc.getInputFromUser();
        calc.performCommand();

        StringProcessor s = new StringProcessor();
        scanner = s.initScanner();
        List<String> l = s.getInputFromUser();
        System.out.println(l);
        s.compareStrings(l);
        scanner.close();



    }
}
