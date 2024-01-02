package com.teranet.rps.springtraining.beans;

public class Pen {
    private String company;
    private String color;
    private float price;
    private float weight;

    public Pen(String company, String color, float price, float weight) {
        this.company = company;
        this.color = color;
        this.price = price;
        this.weight = weight;
    }

    public Pen() {
    }
    public void write(){
        System.out.println("Writing with "+this.color+ " pen....");
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
