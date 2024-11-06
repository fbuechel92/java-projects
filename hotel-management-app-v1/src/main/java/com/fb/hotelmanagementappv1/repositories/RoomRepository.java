package com.fb.hotelmanagementappv1.repositories;

import com.fb.hotelmanagementappv1.dataSource.DataInititalization;
import com.fb.hotelmanagementappv1.models.Room;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class RoomRepository {
    private DataInititalization dataInititalization;

    //Constructor
    public RoomRepository(DataInititalization dataInititalization){
        this.dataInititalization = dataInititalization;
    }

    //Methods
    public void addRoom(Room paramRoom){
        dataInititalization.getRooms().add(paramRoom);
    }

    public Room getRoom(int id){
        for (Room room:dataInititalization.getRooms()){
            if (room.getId() == id){
                return room;
            }
        }
        return null;
    }

    public List<Room> getAllRooms(){
        return dataInititalization.getRooms();
    }

    public List<Room> getRoomsByHotelId(int paramHotelId){
        List<Room> roomList = new ArrayList<>();

        for (Room room:dataInititalization.getRooms()){
            if (room.getHotelId() == paramHotelId){
                roomList.add(room);
            }
        }
        return roomList;
    }

    public void updateOccupied(int roomId, boolean paramOccupied){
        for (Room room:dataInititalization.getRooms()){
            if (room.getId() == roomId){
                room.setOccupied(paramOccupied);
            }
        }
    }
}