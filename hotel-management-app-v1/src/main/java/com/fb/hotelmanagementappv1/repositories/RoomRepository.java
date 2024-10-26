package com.fb.hotelmanagementappv1.repositories;

import com.fb.hotelmanagementappv1.models.Room;
import java.util.ArrayList;
import java.util.List;

public class RoomRepository {
    private List<Room> rooms;

    //Constructor
    public RoomRepository(){
        this.rooms = new ArrayList<>();
    }

    //Methods
    public void addRoom(Room paramRoom){
        rooms.add(paramRoom);
    }

    public Room getRoom(int id){
        for (Room room:rooms){
            if (room.getId() == id){
                return room;
            }
        }
        return null;
    }

    public List<Room> getAllRooms(){
        return rooms;
    }

    public List<Room> getRoomsByHotelId(int paramHotelId){
        List<Room> roomList = new ArrayList<>();

        for (Room room:rooms){
            if (room.getHotelId() == paramHotelId){
                roomList.add(room);
            }
        }
        return roomList;
    }
}
