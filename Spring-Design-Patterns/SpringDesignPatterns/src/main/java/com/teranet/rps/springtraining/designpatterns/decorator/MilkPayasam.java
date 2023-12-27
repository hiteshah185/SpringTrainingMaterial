package com.teranet.rps.springtraining.designpatterns.decorator;

import java.math.BigDecimal;

public class MilkPayasam extends Payasam{
    public MilkPayasam(){
        super();
        this.recipe="Has milk";
    }
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15.00);
    }
}
