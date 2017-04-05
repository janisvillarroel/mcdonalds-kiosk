/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saasforge.mcdonalds.kiosk.bean.director;

import com.saasforge.mcdonalds.kiosk.bean.Meal;
import com.saasforge.mcdonalds.kiosk.builderInterface.MealBuilderInterface;

/**
 *
 * @author Janis
 */
public class DirectorMeal {

    public Meal construct(MealBuilderInterface mealBuilder) {
        return mealBuilder.build();
    }
}
