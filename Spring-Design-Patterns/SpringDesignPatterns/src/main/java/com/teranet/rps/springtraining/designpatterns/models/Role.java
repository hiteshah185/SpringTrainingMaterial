package com.teranet.rps.springtraining.designpatterns.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JsonBackReference
    private User user;
    private Permission permission;

    public Role() {
    }

    public Role(User user, Permission permission){
        this.user=user;
        this.permission=permission;
    }
    public Role(Permission permission){
        this.permission=permission;
    }
    public Role(Long id,User user,Permission permission){
        this.id=id;
        this.user=user;
        this.permission=permission;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }
    @Override
    public int hashCode(){
        return id!=null ? id.hashCode() :super.hashCode();
    }
    @Override
    public String toString(){
        return this.getClass().getSimpleName()+String.format("(id = %d, user = %s, permission = %s)", id, user, permission);
    }
}
