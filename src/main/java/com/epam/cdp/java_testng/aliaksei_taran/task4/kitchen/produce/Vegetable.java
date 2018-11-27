package com.epam.cdp.java_testng.aliaksei_taran.task4.kitchen.produce;

/*
 * Created by
 * USER: Aliaksei_Taran
 * DATE: 11/25/2018
 * TIME: 12:26 AM
 */
public abstract class Vegetable {
    private double energy = 0.0;
    private double carbohydrates = 0.0;
    private double fat = 0.0;
    private double protein = 0.0;
    private boolean isPrepared = false;
    private boolean isChopped = false;


    public Vegetable(double energy, double carbohydrates, double fat, double protein){
        this.energy = energy;
        this.carbohydrates = carbohydrates;
        this.fat = fat;
        this.protein = protein;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public void setPrepare(boolean b) {
        this.isPrepared = b;
    }

    public boolean isPrepared() {
        return isPrepared;
    }

    public boolean isChopped(){
        return isChopped;
    }

    public void setChopped(boolean b){
        this.isChopped = b;
    }
}
