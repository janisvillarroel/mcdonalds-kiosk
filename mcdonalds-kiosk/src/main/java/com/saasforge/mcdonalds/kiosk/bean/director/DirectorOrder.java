/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saasforge.mcdonalds.kiosk.bean.director;

import com.saasforge.mcdonalds.kiosk.bean.Order;
import com.saasforge.mcdonalds.kiosk.builderInterface.OrderBuilderInterface;

/**
 *
 * @author Janis
 */
public class DirectorOrder {

    public Order construct(OrderBuilderInterface orderBuilder) {
        return orderBuilder.build();
    }
}
