/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saasforge.mcdonalds.kiosk.bean;

import java.util.ArrayList;

/**
 *
 * @author Janis
 */
public class Order {

    private ArrayList<Meal> mealList = new ArrayList();

    @Override
    public String toString() {
        double total = 0.0;
        StringBuilder val;
        String resp = null;
        if (mealList != null) {
            val = new StringBuilder();
            for (Meal meal : mealList) {
                val.append(meal.toString());
                val.append("\n");
                total = total + meal.getComputePrice();
            }
            val.append("Total Price:");
            val.append(total);
            val.append("\n");
            val.append("-------------------");
            val.append("\n");
            resp = val.toString();
        }
        return resp;
    }

    /**
     * @return the mealList
     */
    public ArrayList getMealList() {
        return mealList;
    }

    /**
     * @param mealList the mealList to set
     */
    public void setMealList(ArrayList mealList) {
        this.mealList = mealList;
    }
}
