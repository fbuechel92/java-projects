package com.fb.hotelmanagementappv1.models;

public class Room {
    private int id;
    private boolean isOccupied;
    private int roomSize;
    private int numberOfBeds;
    private boolean hasBalcony;
    private boolean hasTV;

    //Constructor
    public Room(int id, boolean isOccupied, int roomSize, int numberOfBeds, boolean hasBalcony, boolean hasTV){
        this.id = id;
        this.isOccupied = isOccupied;
        this.roomSize = roomSize;
        this.numberOfBeds = numberOfBeds;
        this.hasBalcony = hasBalcony;
        this.hasTV = hasTV;
    }

    //Getter methods
    public int getId(){
        return id;
    }

    public boolean getIsOccupied(){
        return isOccupied;
    }

    public int getRoomSize(){
        return roomSize;
    }

    public int getNumberOfBeds(){
        return numberOfBeds;
    }

    public boolean getHasBalcony(){
        return hasBalcony;
    }

    public boolean getHasTV(){
        return hasTV;
    }
}