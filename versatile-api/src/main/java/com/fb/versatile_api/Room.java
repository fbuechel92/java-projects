package com.fb.versatile_api;

public class Room {
    private int roomNumber;
    private boolean occupied = false;
    private int bedCount;
    private double roomPrice;

    //Creating a new room instance with a constructor for post requests
    public Room(int roomNumber, int bedCount, double roomPrice){
        this.roomNumber = roomNumber;
        this.occupied = false; //per default, rooms are not occupied
        this.bedCount = bedCount;
        this.roomPrice = roomPrice;
    }

    //Getter methods for get requests
    public int getRoomNumber(){
        return roomNumber;
    }

    public boolean isOccupied(){
        return occupied;
    }

    public int getBedCount(){
        return bedCount;
    }

    public double getRoomPrice(){
        return roomPrice;
    }

    //Setter methods for put requests
    public void setRoomNumber(int roomNumberParam){
        roomNumber = roomNumberParam;
    }

    public void setOccupied(boolean occupiedParam){
        occupied = occupiedParam;
    }

    public void setBedCount(int bedCountParam){
        bedCount = bedCountParam;
    }

    public void setRoomPrice(double roomPriceParam){
        roomPrice = roomPriceParam;
    }

    //I probably don't need specific methods for deletion. Rather, I want to delete the entire room.
}

