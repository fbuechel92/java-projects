package com.fb.hotelmanagementappv1.models;

import jakarta.persistence.Entity;
import java.util.List;

@Entity
public class City {
    private int id;
    private String name;
    private List<Hotel> hotels;

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