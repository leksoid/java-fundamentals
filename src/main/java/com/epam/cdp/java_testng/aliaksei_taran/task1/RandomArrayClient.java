package com.epam.cdp.java_testng.aliaksei_taran.task1;

import java.util.Arrays;
import java.util.Random;

/*
 * Task #1
 * Created by
 * USER: Aliaksei_Taran
 * DATE: 11/15/2018
 * TIME: 11:20 AM
 */

public class RandomArrayClient {
    private int[] array;

    public void generateRandomArray(int withSize){
        array = new int[withSize];
        Random r = new Random();
        for(int a=0;a<array.length;a++){
            array[a] = -10 + r.nextInt(20);
        }
    }

    public void printOutArray(){
        System.out.println(Arrays.toString(array));
    }

    public void replaceOdds(int toInt){
        // loop through the existing array
        for(int a=0;a<array.length;a++){
            // check that if the remainder of division by 2 is not 0 - the int is odd
            if(array[a]%2 != 0){
                array[a]=toInt;
            }
        }
    }

}
