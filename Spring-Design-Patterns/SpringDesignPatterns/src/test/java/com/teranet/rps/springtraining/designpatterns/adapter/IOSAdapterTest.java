package com.teranet.rps.springtraining.designpatterns.adapter;

import org.junit.Test;

public class IOSAdapterTest {
    @Test
    public void testAdapter() {
        AndroidIOS androidIOS = new AndroidIOS();
        IOS ios = new IOSAdapter(androidIOS);
        System.out.println(ios.getPhoneName());
        ios.makeACall();
    }

}
