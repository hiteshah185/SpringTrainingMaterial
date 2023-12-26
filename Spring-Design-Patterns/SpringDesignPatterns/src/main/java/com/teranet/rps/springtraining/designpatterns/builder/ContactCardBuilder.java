package com.teranet.rps.springtraining.designpatterns.builder;

public class ContactCardBuilder {
    private String firstName;
    private String lastName;
    private String workEmail;
    private String department;
    public ContactCardBuilder setFirstName(String firstName){
        this.firstName=firstName;
        return this;
    }
    public ContactCardBuilder setLastName(String lastName){
        this.lastName=lastName;
        return this;
    }
    public ContactCardBuilder setWorkEmail(String workEmail){
        this.workEmail = workEmail;
        return this;
    }

    public ContactCardBuilder setDepartment(String department){
        this.department =department;
        return this;
    }
    public ContactCard buildContactCard(){
        return new ContactCard(firstName,lastName,workEmail,department);
    }

}
