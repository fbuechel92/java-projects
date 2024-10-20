package com.fb.hotelmanagementappv1;

public class Room {
    private int id;
    private int roomSize;
    private int numberOfBeds;
    private boolean hasBalcony;
    private boolean hasTV;

    //Constructor
    public Room(int id, int roomSize, int numberOfBeds, boolean hasBalcony, boolean hasTV){
        this.id = id;
        this.roomSize = roomSize;
        this.numberOfBeds = numberOfBeds;
        this.hasBalcony = hasBalcony;
        this.hasTV = hasTV;
    }

    //Getter methods
    private int getId(){
        return id;
    }

    private int getRoomSize(){
        return roomSize;
    }

    private int getNumberOfBeds(){
        return numberOfBeds;
    }

    private boolean getHasBalcony(){
        return hasBalcony;
    }

    private boolean getHasTV(){
        return hasTV;
    }
}