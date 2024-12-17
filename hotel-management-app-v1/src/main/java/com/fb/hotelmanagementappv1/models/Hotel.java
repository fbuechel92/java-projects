package com.fb.hotelmanagementappv1.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    private String telephoneNumber;
    private int numberOfRooms;

    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Room> rooms;

    //Variable that establishes a relationship between the Hotel and the City tables
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id")  // FK in hotel table
    private City city;

    //Constructor
    public Hotel(int id, String name, String address, String telephoneNumber, int numberOfRooms, City city){
        this.id = id;
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.numberOfRooms = numberOfRooms;
        this.city = city;
    }

    public Hotel(){
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

    //Methods for room list
    public List<Room> getRooms(){
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
}
