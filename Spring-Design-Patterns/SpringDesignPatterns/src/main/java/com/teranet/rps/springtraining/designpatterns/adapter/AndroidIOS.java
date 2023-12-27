package com.teranet.rps.springtraining.designpatterns.adapter;

public class AndroidIOS implements Android{
    @Override
    public String getPhoneName() {
        return "An Android+IOS Phone";
    }

    @Override
    public void unlock() {
        System.out.println("User unlocking phone.");
    }

    @Override
    public void takeAPicture() {
        System.out.println("User clicks a photo.");
    }

    @Override
    public void makeACall() {
        System.out.println("User makes a call.");
    }
}
