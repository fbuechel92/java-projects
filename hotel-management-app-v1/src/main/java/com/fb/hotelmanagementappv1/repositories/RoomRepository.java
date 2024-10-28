package com.fb.hotelmanagementappv1.repositories;

import com.fb.hotelmanagementappv1.models.Room;
import com.fb.hotelmanagementappv1.services.DataInitializationService;
import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RoomRepository {
    private List<Room> rooms;
    private DataInitializationService dataInitializationService;

    //Constructor
    public RoomRepository(){
        this.rooms = new ArrayList<>();
    }

    @Autowired
    public RoomRepository(DataInitializationService dataInitializationService){
        this.dataInitializationService = dataInitializationService;
    }

    //Data Initialization
    @PostConstruct
    public void roomDataInitialization(){
        this.rooms = dataInitializationService.getInitializationRoomData();
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

    public void updateOccupied(int roomId, boolean paramOccupied){
        for (Room room:rooms){
            if (room.getId() == roomId){
                room.setOccupied(paramOccupied);
            }
        }
    }
}