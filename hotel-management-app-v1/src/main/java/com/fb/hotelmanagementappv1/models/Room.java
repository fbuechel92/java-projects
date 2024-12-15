package com.fb.hotelmanagementappv1.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private boolean isOccupied;
    private int roomSize;
    private int numberOfBeds;
    private boolean hasBalcony;
    private boolean hasTV;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hotel_id")  // FK in room table
    private Hotel hotel;

    //Constructor
    public Room(int id, boolean isOccupied, int roomSize, int numberOfBeds, boolean hasBalcony, boolean hasTV){
        this.id = id;
        this.isOccupied = isOccupied;
        this.roomSize = roomSize;
        this.numberOfBeds = numberOfBeds;
        this.hasBalcony = hasBalcony;
        this.hasTV = hasTV;
    }

    public Room(){
    }

    //Getter methods
    public int getId(){
        return id;
    }

    public boolean isOccupied(){
        return isOccupied;
    }

    public int getRoomSize(){
        return roomSize;
    }

    public int getNumberOfBeds(){
        return numberOfBeds;
    }

    public boolean hasBalcony(){
        return hasBalcony;
    }

    public boolean hasTV(){
        return hasTV;
    }

    //Setter Methods
    public void setOccupied(boolean paramIsOccupied){
        this.isOccupied = paramIsOccupied;
    }
}