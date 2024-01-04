package com.teranet.rps.springtraining.designpatterns.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dateCreated = LocalDateTime.now();
    private LocalDateTime lastModifiedDate;
    @Column(unique = true)
    private String username;
    private String firstName;
    private String lastName;
    private String description;
    private boolean enabled = true;
    private String password;
    @Column(unique = true)
    private String legacyApiKey = null;
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "user",cascade = CascadeType.ALL,orphanRemoval = true)
    @JsonManagedReference
    private Set<Role> roles = new HashSet<>();

    public User(Long id, LocalDateTime dateCreated, LocalDateTime lastModifiedDate, String username, String firstName, String lastName, String description, boolean enabled, String password, String legacyApiKey, Set<Role> roles) {
        this.id = id;
        this.dateCreated = dateCreated;
        this.lastModifiedDate = lastModifiedDate;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
        this.enabled = enabled;
        this.password = password;
        this.legacyApiKey = legacyApiKey;
        this.roles = roles;
    }
    public User(String username,String password,Set<Role>roles){
        this.username=username;
        this.password=password;
        this.roles=roles;
    }
    public User(){}

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLegacyApiKey() {
        return legacyApiKey;
    }

    public void setLegacyApiKey(String legacyApiKey) {
        this.legacyApiKey = legacyApiKey;
    }
}
