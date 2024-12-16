package com.fb.hotelmanagementappv1.services;

import com.fb.hotelmanagementappv1.models.Hotel;
import com.fb.hotelmanagementappv1.models.Room;
import com.fb.hotelmanagementappv1.repositories.HotelRepository;
import com.fb.hotelmanagementappv1.repositories.RoomRepository;
import java.util.List;
import java.util.Optional;
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
        return hotelRepository.findById(hotelId).orElse(null);
    }

    public List<Hotel> getHotelsByCityId(int cityId){
        return hotelRepository.findByCityId(cityId);
    }

    public List<Hotel> getAllHotels(){
        return hotelRepository.findAll();
    }

    //Room-related Methods
    public Room getRoomById(int roomId){
        return roomRepository.findById(roomId).orElse(null);
    }

    public List<Room> getRoomsByHotelId(int hotelId){
        return roomRepository.findByHotelId(hotelId);
    }

    //Booking-related Methods
    public String bookRoom(int roomId) {
        Optional<Room> roomOptional = roomRepository.findById(roomId);
        if (!roomOptional.isPresent()) {
            return String.format("Room %d does not exist.", roomId);
        }
        Room room = roomOptional.get();
        if (room.isOccupied()) {
            return String.format("Room %d is already occupied.", roomId);
        }
        room.setOccupied(true);
        roomRepository.save(room);
        return String.format("Room %d has been successfully booked.", roomId);
    }

    public String cancelRoom(int roomId) {
        Optional<Room> roomOptional = roomRepository.findById(roomId);
        if (!roomOptional.isPresent()) {
            return String.format("Room %d does not exist.", roomId);
        }
        Room room = roomOptional.get();
        if (!room.isOccupied()) {
            return String.format("Room %d is not booked. Cancellation not successful.", roomId);
        }
        room.setOccupied(false);
        roomRepository.save(room);
        return String.format("Cancellation for room %d has been successfully processed.", roomId);
    }
}