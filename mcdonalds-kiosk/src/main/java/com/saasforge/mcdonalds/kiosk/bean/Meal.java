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
public class Meal {

    private Sandwich sandwich;
    private Drink drink;
    private Fry fry;
    private double computePrice;
    private boolean withApplePie;
    private boolean withSundae;

    public Meal() {
        fry = new FryRegular();
    }

    @Override
    public String toString() {

        if (withApplePie) {
            computePrice = computePrice + 1;
        }
        if (withSundae) {
            computePrice = computePrice + 1.75;
        }
        StringBuilder resp = new StringBuilder();
        resp.append("-------------------");
        resp.append("\n");
        resp.append("Meal");
        resp.append("\n");
        resp.append(sandwich.toString());
        resp.append("\n");
        resp.append(drink.toString());
        resp.append("\n");
        resp.append(fry.toString());
        resp.append("\n");
        resp.append("Sundae :");
        resp.append(this.withSundae ? "YES" : "NO");
        resp.append("\n");
        resp.append("ApplePie :");
        resp.append(this.withApplePie ? "YES" : "NO");
        resp.append("\n");
        resp.append("Computed Price :");
        resp.append(computePrice);
        resp.append("\n");
        resp.append("-------------------");
        return resp.toString();
    }

    /**
     * @return the sandwich
     */
    public Sandwich getSandwich() {
        return sandwich;
    }

    /**
     * @param sandwich the sandwich to set
     */
    public void setSandwich(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    /**
     * @return the drink
     */
    public Drink getDrink() {
        return drink;
    }

    /**
     * @param drink the drink to set
     */
    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    /**
     * @return the fry
     */
    public Fry getFry() {
        return fry;
    }

    /**
     * @param fry the fry to set
     */
    public void setFry(Fry fry) {
        this.fry = fry;
    }

    /**
     * @return the computePrice
     */
    public double getComputePrice() {
        return computePrice;
    }

    /**
     * @param computePrice the computePrice to set
     */
    public void setComputePrice(double computePrice) {
        this.computePrice = computePrice;
    }

    /**
     * @return the withApplePie
     */
    public boolean isWithApplePie() {
        return withApplePie;
    }

    /**
     * @param withApplePie the withApplePie to set
     */
    public void setWithApplePie(boolean withApplePie) {
        this.withApplePie = withApplePie;
    }

    /**
     * @return the withSundae
     */
    public boolean isWithSundae() {
        return withSundae;
    }

    /**
     * @param withSundae the withSundae to set
     */
    public void setWithSundae(boolean withSundae) {
        this.withSundae = withSundae;
    }
}
