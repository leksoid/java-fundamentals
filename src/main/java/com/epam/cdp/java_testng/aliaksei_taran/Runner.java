package com.epam.cdp.java_testng.aliaksei_taran;

import com.epam.cdp.java_testng.aliaksei_taran.task1.RandomArrayClient;

/*
 * Created by
 * USER: Aliaksei_Taran
 * DATE: 11/15/2018
 * TIME: 11:19 AM
 */

public class Runner {
    public static void main (String args[]){
        RandomArrayClient ra = new RandomArrayClient();
        ra.generateRandomArray(20);
        ra.printOutArray();
        ra.replaceOdds(0);
        ra.printOutArray();
    }
}
