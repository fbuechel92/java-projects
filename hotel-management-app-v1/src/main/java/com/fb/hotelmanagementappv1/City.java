package com.fb.hotelmanagementappv1;

import java.util.List;
import java.util.ArrayList;

public class City {
    private int id;
    private String name;

    //Constructor
    public City(int id, String name){
        this.id = id;
        this.name = name;
        this.hotels = new ArrayList<>();
    }

    //Getter methods
    private int getId(){
        return id;
    }

    private String getName(){
        return name;
    }
}