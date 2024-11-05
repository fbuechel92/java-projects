package com.fb.hotelmanagementappv1.models;

import java.util.List;

public class Hotel {
    private int id;
    private String name;
    private String address;
    private String telephoneNumber;
    private int numberOfRooms;
    private int cityId;
    private List<Room> rooms;

    //Constructor
    public Hotel(int id, String name, String address, String telephoneNumber, int numberOfRooms, int cityId){
        this.id = id;
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.numberOfRooms = numberOfRooms;
        this.cityId = cityId;
    }

    //Getter Methods for get requests
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getTelephoneNumber(){
        return telephoneNumber;
    }

    public int getNumberOfRooms(){
        return numberOfRooms;
    }

    public int getCityId(){
        return cityId;
    }
}
