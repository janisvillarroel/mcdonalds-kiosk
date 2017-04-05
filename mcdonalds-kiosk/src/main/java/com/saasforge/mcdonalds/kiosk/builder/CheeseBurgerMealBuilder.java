/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saasforge.mcdonalds.kiosk.builder;

import com.saasforge.mcdonalds.kiosk.bean.CheeseBurger;
import com.saasforge.mcdonalds.kiosk.bean.Coke;
import com.saasforge.mcdonalds.kiosk.bean.CokeLarge;
import com.saasforge.mcdonalds.kiosk.bean.CokeMedium;
import com.saasforge.mcdonalds.kiosk.bean.CokeRegular;
import com.saasforge.mcdonalds.kiosk.bean.DietCoke;
import com.saasforge.mcdonalds.kiosk.bean.DietCokeLarge;
import com.saasforge.mcdonalds.kiosk.bean.DietCokeMedium;
import com.saasforge.mcdonalds.kiosk.bean.DietCokeRegular;
import com.saasforge.mcdonalds.kiosk.bean.FryLarge;
import com.saasforge.mcdonalds.kiosk.bean.FryMedium;
import com.saasforge.mcdonalds.kiosk.bean.FryRegular;
import com.saasforge.mcdonalds.kiosk.bean.IcedTea;
import com.saasforge.mcdonalds.kiosk.bean.IcedTeaLarge;
import com.saasforge.mcdonalds.kiosk.bean.IcedTeaMedium;
import com.saasforge.mcdonalds.kiosk.bean.IcedTeaRegular;
import com.saasforge.mcdonalds.kiosk.bean.Meal;
import com.saasforge.mcdonalds.kiosk.builderInterface.MealBuilderInterface;

/**
 *
 * @author Janis
 */
public class CheeseBurgerMealBuilder implements MealBuilderInterface {

    private Meal meal = new Meal();

    public CheeseBurgerMealBuilder() {
        this.meal.setSandwich(new CheeseBurger());
    }

    @Override
    public MealBuilderInterface withCoke() {
        this.meal.setDrink(new CokeRegular());
        return this;
    }

    @Override
    public MealBuilderInterface withIcedTea() {
        this.meal.setDrink(new IcedTeaRegular());
        return this;
    }

    @Override
    public MealBuilderInterface withDietCoke() {
        this.meal.setDrink(new DietCokeRegular());
        return this;
    }

    @Override
    public MealBuilderInterface addApplePie() {
        this.meal.setWithApplePie(true);
        return this;
    }

    @Override
    public MealBuilderInterface addSundae() {
        this.meal.setWithSundae(true);
        return this;
    }

    @Override
    public MealBuilderInterface makeLarge() {
        this.meal.setFry(new FryRegular());
        this.meal.setComputePrice(5.15);
        return this;
    }

    @Override
    public MealBuilderInterface makeRegular() {
        if (this.meal.getDrink() instanceof Coke) {
            this.meal.setDrink(new CokeRegular());
        }
        if (this.meal.getDrink() instanceof IcedTea) {
            this.meal.setDrink(new IcedTeaRegular());
        }
        if (this.meal.getDrink() instanceof DietCoke) {
            this.meal.setDrink(new DietCokeRegular());
        }
        this.meal.setFry(new FryRegular());
        this.meal.setComputePrice(3.15);
        return this;
    }

    @Override
    public MealBuilderInterface makeMedium() {
        if (this.meal.getDrink() instanceof Coke) {
            this.meal.setDrink(new CokeMedium());
        }
        if (this.meal.getDrink() instanceof IcedTea) {
            this.meal.setDrink(new IcedTeaMedium());
        }
        if (this.meal.getDrink() instanceof DietCoke) {
            this.meal.setDrink(new DietCokeMedium());
        }
        this.meal.setFry(new FryMedium());
        this.meal.setComputePrice(4.15);
        return this;
    }

    @Override
    public Meal build() {
        return meal;
    }

    @Override
    public MealBuilderInterface withFry() {
        this.meal.setFry(new FryRegular());
        return this;
    }
}
