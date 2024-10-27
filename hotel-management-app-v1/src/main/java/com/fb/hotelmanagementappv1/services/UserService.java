package com.fb.hotelmanagementappv1.services;

import com.fb.hotelmanagementappv1.models.Hotel;
import com.fb.hotelmanagementappv1.models.Room;
import com.fb.hotelmanagementappv1.repositories.HotelRepository;
import com.fb.hotelmanagementappv1.repositories.RoomRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private HotelRepository hotelRepository;
    private RoomRepository roomRepository;

    //Constructors
    @Autowired
    public UserService(HotelRepository hotelRepository, RoomRepository roomRepository) {
        this.hotelRepository = hotelRepository;
        this.roomRepository = roomRepository;
    }

    //Hotel-related Methods
    public Hotel getHotelById(int hotelId){
        return hotelRepository.getHotel(hotelId);
    }

    public List<Hotel> getHotelsByCityId(int cityId){
        return hotelRepository.getHotelsByCityId(cityId);
    }

    public List<Hotel> getAllHotels(){
        return hotelRepository.getAllHotels();
    }

    //Room-related Methods
    public Room getRoomById(int roomId){
        return roomRepository.getRoom(roomId);
    }

    public List<Room> getRoomsByHotelId(int hotelId){
        return roomRepository.getRoomsByHotelId(hotelId);
    }



}
