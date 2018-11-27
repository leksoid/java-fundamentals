package com.epam.cdp.java_testng.aliaksei_taran.task2;

import java.util.*;

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

    public List<String> getInputFromUser(){
        System.out.println("Enter several strings, separate by new line. End input pressing CTRL+D (^d)");
        List<String> strings = new ArrayList<>();
        while(this.scanner.hasNext()){
            strings.add(this.scanner.nextLine());
        }
        return strings;
    }

    public void compareStrings(List<String> l){
        // use for
        Optional<String> shortest = l.stream().min(Comparator.comparingInt(String::length));
        Optional<String> longest = l.stream().max(Comparator.comparingInt(String::length));
        if (!shortest.equals(longest)) {
            shortest.ifPresent(x -> System.out.println(String.format("The shortest string is %s", x)));
            longest.ifPresent(x -> System.out.println(String.format("The longest string is %s", x)));
        } else {
            System.out.println("Provided strings equal");
        }
    }

    // from previous implementation, leaving there to compare
    @Deprecated
    public String getStringFromUser(){
        return this.scanner.nextLine();
    }

    @Deprecated
    public void compareLengths(String initial, String compareTo){
        if (initial.length()>compareTo.length()){
            System.out.println(String.format("The longest string is %s", initial));
            System.out.println("The shortest string is " + compareTo);
        } else if (initial.length() == compareTo.length()) {
            System.out.println("String lengths equal");
        } else {
            System.out.println("The longest string is " + compareTo);
            System.out.println("The shortest string is " + initial);
        }
    }
}
