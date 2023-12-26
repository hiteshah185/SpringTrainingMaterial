package com.teranet.rps.springtraining.designpatterns.builder;

public class ContactCard {
    private String firstName;
    private String lastName;
    private String workEmail;
    private String department;

    public ContactCard(String firstName, String lastName, String workEmail, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.workEmail = workEmail;
        this.department = department;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getWorkEmail() {
        return workEmail;
    }

    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
