package com.teranet.rps.springtraining.designpatterns.decorator;

import java.math.BigDecimal;

public abstract class Payasam {
    protected String recipe;
    public String getRecipe(){
        return recipe;
    }
    public abstract BigDecimal getCost();
}
