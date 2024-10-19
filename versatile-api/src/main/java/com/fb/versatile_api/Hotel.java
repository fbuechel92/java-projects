package com.fb.versatile_api;

import java.util.List;
import java.util.ArrayList;

public class Hotel {
    private final String hotelName = "Black Forest Hotel";
    private final String hotelAddress = "Niemandsweg 404, 56841 Traben-Trarbach";
    private final String telephoneNumber = "06541 100 100";
    private int roomCount = 0;
    private List<Room> rooms = new ArrayList<>();

    //Methods to retrieve hotel info
    public String getHotelName(){
        return hotelName;
    }

    public String getHotelAddress(){
        return hotelAddress;
    }

    public String getTelephoneNumber(){
        return telephoneNumber;
    }

    //Methods to manage rooms
    public void addRoom(Room room){
        rooms.add(room);
        roomCount = rooms.size(); //update room count
    }

    public void removeRoom(Room room){
        rooms.remove(room);
        roomCount = rooms.size(); //update room count
    }

    //Methods to return and retrieve rooms
    public int roomCount(){
        return roomCount;
    }

    public List<Room> listRooms(){
        return rooms;
    }

    public Room findRoomByNumber(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null; //this is outside the if-clause as a fallback to have something to return
    }
}