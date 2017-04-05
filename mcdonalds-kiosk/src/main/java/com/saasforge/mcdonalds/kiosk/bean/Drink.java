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
public class Drink {

    private String name;
    private String size;
    protected boolean isDiet;

    public Drink(String name, String size) {
        this.isDiet = false;
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Drink :" + this.getName() + "(Size: " + this.size + ")";
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @return the isDiet
     */
    public boolean isIsDiet() {
        return isDiet;
    }
}
