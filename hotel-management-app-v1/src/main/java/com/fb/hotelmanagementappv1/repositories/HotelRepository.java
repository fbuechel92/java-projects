package com.fb.hotelmanagementappv1.repositories;

import com.fb.hotelmanagementappv1.models.Hotel;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class HotelRepository {
    private List<Hotel> hotels;

    //Constructor
    public HotelRepository(){
        this.hotels = new ArrayList<>();
    }

    //Methods
    public void addHotel(Hotel paramHotel){
        hotels.add(paramHotel);
    }

    public Hotel getHotel(int id){
        for (Hotel hotel:hotels){
            if (hotel.getId() == id){
                return hotel;
            }
        }
        return null;
    }

    public List<Hotel> getAllHotels(){
        return hotels;
    }

    public List<Hotel> getHotelsByCityId(int paramCityId){
        List<Hotel> hotelList = new ArrayList<>();

        for (Hotel hotel:hotels){
            if (hotel.getCityId() == paramCityId){
                hotelList.add(hotel);
            }
        }
        return hotelList;
    }
}