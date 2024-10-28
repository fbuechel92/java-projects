package com.fb.hotelmanagementappv1.repositories;
import com.fb.hotelmanagementappv1.models.Hotel;
import com.fb.hotelmanagementappv1.services.DataInitializationService;
import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HotelRepository {
    private List<Hotel> hotels;
    private DataInitializationService dataInitializationService;

    //Constructor
    public HotelRepository(){
        this.hotels = new ArrayList<>();
    }

    @Autowired
    public HotelRepository(DataInitializationService dataInitializationService){
        this.dataInitializationService = dataInitializationService;
    }

    //Data Initialization
    @PostConstruct
    public void hotelDataInitialization(){
        this.hotels = dataInitializationService.getInitializationHotelData();
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