package com.example.demo.models;

public class UserId {
    private int id;

    public UserId(){}

    public UserId(int id){
        this.id = id;
    }

   public void setId(int id){
        this.id=id;
    }

    public int getId(){
        return this.id;
    }
}