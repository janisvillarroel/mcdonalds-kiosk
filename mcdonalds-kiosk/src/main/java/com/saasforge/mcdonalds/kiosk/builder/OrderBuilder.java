/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saasforge.mcdonalds.kiosk.builder;

import com.saasforge.mcdonalds.kiosk.bean.Meal;
import com.saasforge.mcdonalds.kiosk.bean.Order;
import com.saasforge.mcdonalds.kiosk.builderInterface.OrderBuilderInterface;

/**
 *
 * @author Janis
 */
public class OrderBuilder implements OrderBuilderInterface {

    private Order order = new Order();

    @Override
    public Order build() {
        return this.order;
    }

    @Override
    public OrderBuilderInterface addMeal(Meal meal) {
        this.order.getMealList().add(meal);
        return this;
    }
}
