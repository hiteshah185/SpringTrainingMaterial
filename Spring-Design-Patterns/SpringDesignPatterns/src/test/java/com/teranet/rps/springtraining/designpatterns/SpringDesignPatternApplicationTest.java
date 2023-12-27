package com.teranet.rps.springtraining.designpatterns;

import com.teranet.rps.springtraining.designpatterns.prototype.Bottle;
import com.teranet.rps.springtraining.designpatterns.service.EmployeeService;
import com.teranet.rps.springtraining.designpatterns.singleton.Apple;
import com.teranet.rps.springtraining.designpatterns.singleton.GreenApple;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringDesignPatternApplicationTest {
    @Autowired
    GreenApple greenApple1;
    @Autowired
    GreenApple greenApple2;
    @Autowired
    Bottle waterBottle;
    @Autowired
    Bottle wineBottle;

    @Test
    public void testSingletons(){
        Apple apple1 = Apple.getInstance();
        Apple apple2 = Apple.getInstance();
        Assert.assertNotNull(apple1);
        Assert.assertSame(apple1,apple2);
        Assert.assertNotNull(greenApple1);
        Assert.assertSame(greenApple1,greenApple2);
    }
    @Test
    public void testPrototypes(){
        Assert.assertNotSame(waterBottle,wineBottle);
    }
}
