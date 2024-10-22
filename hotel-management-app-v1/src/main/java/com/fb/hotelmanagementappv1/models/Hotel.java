package com.fb.hotelmanagementappv1.models;

public class Hotel {
    private int id;
    private String name;
    private String address;
    private String telephoneNumber;
    private int numberOfRooms;

    //Constructor
    public Hotel(int id, String name, String address, String telephoneNumber, int numberOfRooms){
        this.id = id;
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.numberOfRooms = numberOfRooms;
    }

    //Getter Methods for get requests
    private int getId(){
        return id;
    }

    private String getName(){
        return name;
    }

    private String getAddress(){
        return address;
    }

    private String getTelephoneNumber(){
        return telephoneNumber;
    }

    private int getNumberOfRooms(){
        return numberOfRooms;
    }
}