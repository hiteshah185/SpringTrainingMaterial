package com.teranet.rps.springtraining.designpatterns.decorator;

import org.junit.Test;

public class DecoratorTest {
    @Test
    public void testPayasamDecorator(){
        Payasam payasam = new MilkPayasam();
        System.out.println(payasam.getRecipe());
        System.out.println(payasam.getCost());

        SemiyaPayasam semiyaPayasam = new SemiyaPayasam(payasam);
        System.out.println(semiyaPayasam.getRecipe());
        System.out.println(semiyaPayasam.getCost());

        SemiyaPayasam extraSemiyaPayasam = new SemiyaPayasam(semiyaPayasam);
        System.out.println(extraSemiyaPayasam.getRecipe());
        System.out.println(extraSemiyaPayasam.getCost());

    }
}
