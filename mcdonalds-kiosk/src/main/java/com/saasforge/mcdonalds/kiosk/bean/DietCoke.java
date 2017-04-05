/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saasforge.mcdonalds.kiosk.bean;

/**
 *
 * @author Janis
 */
public class DietCoke extends Coke {

    public DietCoke(String size) {
        super(size);
        this.isDiet = true;
    }
}
