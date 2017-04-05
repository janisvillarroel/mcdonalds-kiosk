/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saasforge.mcdonalds.kiosk.builderInterface;

import com.saasforge.mcdonalds.kiosk.bean.Meal;

/**
 *
 * @author Janis
 */
public interface MealBuilderInterface {

    public MealBuilderInterface withCoke();

    public MealBuilderInterface withIcedTea();

    public MealBuilderInterface withFry();

    public MealBuilderInterface withDietCoke();

    public MealBuilderInterface addApplePie();

    public MealBuilderInterface addSundae();

    public MealBuilderInterface makeLarge();

    public MealBuilderInterface makeRegular();

    public MealBuilderInterface makeMedium();

    public Meal build();
}
