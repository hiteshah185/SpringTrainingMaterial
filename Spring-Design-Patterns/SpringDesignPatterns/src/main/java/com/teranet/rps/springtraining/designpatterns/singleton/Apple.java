package com.teranet.rps.springtraining.designpatterns.singleton;

//Singleton Pattern by implementation
public class Apple {
    private static Apple instance;
    private Apple() {
        super();
    }
    public static Apple getInstance(){
        if(null == instance){
            synchronized (Apple.class){
                if(null == instance){
                    instance = new Apple();
                }
            }
        }
        return instance;
    }
}
