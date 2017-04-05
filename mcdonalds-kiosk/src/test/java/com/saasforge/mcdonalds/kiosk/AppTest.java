/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saasforge.mcdonalds.kiosk;

import com.saasforge.mcdonalds.kiosk.bean.Meal;
import com.saasforge.mcdonalds.kiosk.bean.Order;
import com.saasforge.mcdonalds.kiosk.bean.director.DirectorMeal;
import com.saasforge.mcdonalds.kiosk.bean.director.DirectorOrder;
import com.saasforge.mcdonalds.kiosk.builder.BigMacMealBuilder;
import com.saasforge.mcdonalds.kiosk.builder.CheeseBurgerMealBuilder;
import com.saasforge.mcdonalds.kiosk.builder.HamburgerMealBuilder;
import com.saasforge.mcdonalds.kiosk.builder.OrderBuilder;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Janis
 */
public class AppTest {

    public AppTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void test1() {
        String resp = "OK";
        try {
            BigMacMealBuilder biM = new BigMacMealBuilder();
            CheeseBurgerMealBuilder cbM = new CheeseBurgerMealBuilder();
            HamburgerMealBuilder hM = new HamburgerMealBuilder();
            DirectorMeal dm = new DirectorMeal();
            Meal m = dm.construct(biM.withCoke().makeLarge().addSundae());
            Meal m1 = dm.construct(cbM.withIcedTea().makeRegular().addApplePie());
            Meal m2 = dm.construct(hM.withDietCoke().makeLarge());
            OrderBuilder ord = new OrderBuilder();
            ord.addMeal(m);
            ord.addMeal(m1);
            ord.addMeal(m2);
            DirectorOrder d = new DirectorOrder();
            Order o = d.construct(ord);
            System.out.println(o.toString());
        } catch (Exception e) {
            resp = "NOK";
        }
        assertEquals(resp, "OK");
    }
}
