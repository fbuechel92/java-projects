package com.fb.hotelmanagementappv1;

public class Hotel {
    private int id;
    private String name;
    private String address;
    private String telephoneNumber;
    private int numberOfRooms;

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

    //Setter Methods not included for now. Do I need them?
}