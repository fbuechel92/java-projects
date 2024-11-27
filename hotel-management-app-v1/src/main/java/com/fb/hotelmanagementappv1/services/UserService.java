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
        return hotelRepository.findHotelById(hotelId);
    }

    public List<Hotel> getHotelsByCityId(int cityId){
        return hotelRepository.findHotelsByCityId(cityId);
    }

    public List<Hotel> getAllHotels(){
        return hotelRepository.findAllHotels();
    }

    //Room-related Methods
    public Room getRoomById(int roomId){
        return roomRepository.findRoomById(roomId);
    }

    public List<Room> getRoomsByHotelId(int hotelId){
        Hotel hotel = hotelRepository.findHotelById(hotelId);
        if (hotel != null) {
            return hotel.getRooms();
        }
        return null;
    }

    //Booking-related Methods
    public String bookRoom(int roomId) {
        Room room = roomRepository.findRoomById(roomId);

        if (room == null) {
            return String.format("Room %d does not exist.", roomId);
        }
        if (room.isOccupied() == true) {
            return String.format("Room %d is already occupied.", roomId);
        }
        roomRepository.updateOccupied(roomId, true);
        return String.format("Room %d has been successfully booked.", roomId);
    }

    public String cancelRoom(int roomId) {
        Room room = roomRepository.findRoomById(roomId);

        if (room == null) {
            return String.format("Room %d does not exist.", roomId);
        }
        if (room.isOccupied() == false) {
            return String.format("Room %d is not booked. Cancellation not successful.", roomId);
        }
        roomRepository.updateOccupied(roomId, false);
        return String.format("Cancellation for room %d has been cancelled.", roomId);
    }
}