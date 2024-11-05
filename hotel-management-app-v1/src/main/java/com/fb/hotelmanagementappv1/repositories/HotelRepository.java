package com.fb.hotelmanagementappv1.repositories;

import com.fb.hotelmanagementappv1.dataSource.DataInititalization;
import com.fb.hotelmanagementappv1.models.Hotel;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class HotelRepository {
    private DataInititalization dataInititalization;

    //Constructor
    public HotelRepository(DataInititalization dataInititalization){
        this.dataInititalization = dataInititalization;
    }

    //Methods
    public void addHotel(Hotel paramHotel){
        dataInititalization.getHotels().add(paramHotel);
    }

    public Hotel getHotel(int id){
        for (Hotel hotel:dataInititalization.getHotels()){
            if (hotel.getId() == id){
                return hotel;
            }
        }
        return null;
    }

    public List<Hotel> getAllHotels(){
        return dataInititalization.getHotels();
    }

    public List<Hotel> getHotelsByCityId(int paramCityId){
        List<Hotel> hotelList = new ArrayList<>();

        for (Hotel hotel:dataInititalization.getHotels()){
            if (hotel.getCityId() == paramCityId){
                hotelList.add(hotel);
            }
        }
        return hotelList;
    }
}