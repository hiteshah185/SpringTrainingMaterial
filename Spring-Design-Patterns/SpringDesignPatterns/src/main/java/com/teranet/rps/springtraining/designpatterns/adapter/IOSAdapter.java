package com.teranet.rps.springtraining.designpatterns.adapter;

public class IOSAdapter implements IOS{
    private final Android android;
    public IOSAdapter(Android android){
        super();
        this.android = android;
    }

    @Override
    public String getPhoneName() {
        return android.getPhoneName();
    }

    @Override
    public void makeACall() {
        android.unlock();
        android.makeACall();
    }
}
