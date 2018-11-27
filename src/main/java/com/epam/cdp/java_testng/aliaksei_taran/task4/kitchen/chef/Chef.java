package com.epam.cdp.java_testng.aliaksei_taran.task4.kitchen.chef;

import com.epam.cdp.java_testng.aliaksei_taran.task4.kitchen.produce.Vegetable;
import com.epam.cdp.java_testng.aliaksei_taran.task4.kitchen.salad.Salad;

/*
 * Created by
 * USER: Aliaksei_Taran
 * DATE: 11/25/2018
 * TIME: 12:37 AM
 */
public class Chef implements ICooking {
    private String name;
    private String title;

    public Chef(String name, String title){
        this.name = name;
        this.title = title;
    }

    @Override
    public void chop(Vegetable veggie){
        veggie.setChopped(true);
    }

    @Override
    public void prepare(Vegetable veggie) {
        veggie.setPrepare(true);
    }

    @Override
    public void mix(Vegetable veggie, Salad salad){
        salad.addToSalad(veggie);
    }

}
