/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saasforge.mcdonalds.kiosk.builderInterface;

import com.saasforge.mcdonalds.kiosk.bean.Meal;
import com.saasforge.mcdonalds.kiosk.bean.Order;

/**
 *
 * @author Janis
 */
public interface OrderBuilderInterface {

    public Order build();

    public OrderBuilderInterface addMeal(Meal meal);
}
