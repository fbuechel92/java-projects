package com.fb.hotelmanagementappv1.models;

public class City {
    private int id;
    private String name;

    //Constructor
    public City(int id, String name){
        this.id = id;
        this.name = name;
    }

    //Getter methods
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}