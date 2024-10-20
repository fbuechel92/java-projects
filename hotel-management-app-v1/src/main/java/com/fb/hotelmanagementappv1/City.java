package com.fb.hotelmanagementappv1;

import java.util.List;

public class City {
    private int id;
    private String name;
    private List<Hotel> hotels;

    //Getter methods
    private int getId(){
        return id;
    }

    private String getName(){
        return name;
    }

    private List<Hotel> getHotels(){
        return hotels;
    }

}
