package com.teranet.rps.springtraining.beans;

public class NameSlip {
    private String name;
    private String subject;
    private String address;
    private Shape shape;

    public NameSlip() {
    }

    public NameSlip(String name, String subject, String address, Shape shape) {
        this.name = name;
        this.subject = subject;
        this.address = address;
        this.shape = shape;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }
}
