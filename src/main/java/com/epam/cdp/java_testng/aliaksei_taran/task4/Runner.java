package com.epam.cdp.java_testng.aliaksei_taran.task4;

import com.epam.cdp.java_testng.aliaksei_taran.task4.kitchen.chef.Chef;
import com.epam.cdp.java_testng.aliaksei_taran.task4.kitchen.produce.*;
import com.epam.cdp.java_testng.aliaksei_taran.task4.kitchen.salad.Salad;

import java.util.*;
import java.util.stream.Collectors;

/*
 * Created by
 * USER: Aliaksei_Taran
 * DATE: 11/24/2018
 * TIME: 11:48 PM
 */

public class Runner {
    public static void main (String[] args){
        Chef cook = new Chef("Alex","Sous-chef");
        Salad salad = new Salad();
        Map<String,Vegetable> produce = new HashMap<>();
        // simulates the chef taking produce to start preparing
        produce.put("celery",new Celery(16,2.97,0.17,0.69));
        produce.put("lettuce",new Lettuce(13,2.23,0.22,1.35));
        produce.put("tomato",new Tomato(18,3.9,0.2,0.9));
        produce.put("cucumber", new Cucumber(16,3.63,0.11,0.65));
        cook.prepare(produce.get("celery"));
        cook.prepare(produce.get("lettuce"));
        cook.prepare(produce.get("cucumber"));
        // find from a given produce ones that are prepared, so later used to create a salad
        Set<Map.Entry<String,Vegetable>> veggiesReadyForSalad = produce.entrySet().stream().filter(a->a.getValue().isPrepared()).collect(Collectors.toSet());
        // for each of the prepared produce do action to chop, then mix, then toss
        for (Map.Entry<String,Vegetable> entry : veggiesReadyForSalad){
            cook.chop(entry.getValue());
            cook.mix(entry.getValue(),salad);
        }
        double caloricity = 0.0;
        for (Vegetable v : salad.getSalad()){
            caloricity += v.getEnergy();
        }
        System.out.println(String.format("The caloricity of salad is only: %,.2f", caloricity));
        List<Vegetable> lowFat = salad.getSalad().stream().filter(e->e.getFat()<0.2).collect(Collectors.toList());
        List<Vegetable> highProtein = salad.getSalad().stream().filter(e->e.getProtein()>1.0).collect(Collectors.toList());
        System.out.println(lowFat);
        System.out.println(highProtein);

    }
}

