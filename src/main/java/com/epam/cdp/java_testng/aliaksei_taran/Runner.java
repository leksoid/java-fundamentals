package com.epam.cdp.java_testng.aliaksei_taran;

import com.epam.cdp.java_testng.aliaksei_taran.task1.RandomArrayClient;
import com.epam.cdp.java_testng.aliaksei_taran.task2.StringProcessor;

import java.util.Scanner;

/*
 * Created by
 * USER: Aliaksei_Taran
 * DATE: 11/15/2018
 * TIME: 11:19 AM
 */

public class Runner {
    private static Scanner scanner;

    public static void main (String args[]){
        RandomArrayClient ra = new RandomArrayClient();
        ra.generateRandomArray(20);
        ra.printOutArray();
        ra.replaceOdds(0);
        ra.printOutArray();

        StringProcessor sp = new StringProcessor();
        scanner = sp.initScanner();
        String firstString = sp.getStringFromUser();
        String secondString = sp.getStringFromUser();
        System.out.println(firstString+" : "+secondString);
        sp.printLongestString(firstString,secondString);
        sp.printShortestString(firstString,secondString);
    }
}
