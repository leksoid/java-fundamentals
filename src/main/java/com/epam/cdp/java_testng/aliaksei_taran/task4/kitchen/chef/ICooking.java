package com.epam.cdp.java_testng.aliaksei_taran.task4.kitchen.chef;

/*
 * Created by
 * USER: Aliaksei_Taran
 * DATE: 11/25/2018
 * TIME: 12:43 AM
 */

import com.epam.cdp.java_testng.aliaksei_taran.task4.kitchen.produce.Vegetable;
import com.epam.cdp.java_testng.aliaksei_taran.task4.kitchen.salad.Salad;

public interface ICooking {
    void chop(Vegetable veggie);
    void prepare(Vegetable veggie);
    void mix(Vegetable veggie, Salad salad);
}
