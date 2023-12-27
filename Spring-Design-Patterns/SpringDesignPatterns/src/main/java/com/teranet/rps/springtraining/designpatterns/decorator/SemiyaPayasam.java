package com.teranet.rps.springtraining.designpatterns.decorator;

import java.math.BigDecimal;

public class SemiyaPayasam extends PayasamIngredient{
    private Payasam payasam;
    public SemiyaPayasam(Payasam payasam){
        super();
        this.payasam = payasam;
    }

    @Override
    public String getRecipe() {
        return this.payasam.getRecipe()+" Semiya";
    }
    @Override
    public BigDecimal getCost() {
        return (new BigDecimal(10)).add(this.payasam.getCost());
    }
}
