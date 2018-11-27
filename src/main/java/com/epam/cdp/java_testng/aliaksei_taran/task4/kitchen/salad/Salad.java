package com.epam.cdp.java_testng.aliaksei_taran.task4.kitchen.salad;

import com.epam.cdp.java_testng.aliaksei_taran.task4.kitchen.produce.Vegetable;

import javax.xml.soap.SAAJMetaFactory;
import java.util.ArrayList;
import java.util.List;

/*
 * Created by
 * USER: Aliaksei_Taran
 * DATE: 11/26/2018
 * TIME: 12:54 PM
 */
public class Salad {
    private List<Vegetable> salad = new ArrayList<>();

    public List<Vegetable> getSalad() {
        return this.salad;
    }

    public void setSalad(List<Vegetable> salad) {
        this.salad = salad;
    }

    public void addToSalad(Vegetable veggie){
        this.salad.add(veggie);
    }
}
