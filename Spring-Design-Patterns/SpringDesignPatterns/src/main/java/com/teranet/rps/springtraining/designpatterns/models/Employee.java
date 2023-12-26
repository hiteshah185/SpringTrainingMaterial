package com.teranet.rps.springtraining.designpatterns.models;

import javax.persistence.*;

@Entity(name = "Employee")
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="first_name",nullable = false)
    private String firstName;
    @Column(name = "email",nullable = false)
    private String email;
    @Column(name="coreDomian",nullable = true)
    private String domain;

    public Employee() {
    }

    public Employee(long id, String firstName, String email, String domain) {
        this.id = id;
        this.firstName = firstName;
        this.email = email;
        this.domain = domain;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}
