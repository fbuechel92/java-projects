package com.fb.hotelmanagementappv1.repositories;

import com.fb.hotelmanagementappv1.models.City;
import com.fb.hotelmanagementappv1.services.DataInitializationService;
import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CityRepository {
    private List<City> cities;
    private DataInitializationService dataInitializationService;

    //Constructor
    public CityRepository(){
        this.cities = new ArrayList<>();
    }

    @Autowired
    public CityRepository(DataInitializationService dataInitializationService){
        this.dataInitializationService = dataInitializationService;
    }

    //Data Initialization
    @PostConstruct
    public void cityDataInitialization() {
        this.cities = dataInitializationService.getInitializationCityData();
    }

        //Methods
    public void addCity(City paramCity){
        cities.add(paramCity);
    }

    public City getCity(int id){
        for (City city : cities) {
            if (city.getId() == id) {
                return city;
            }
        }
        return null;
    }

    public List<City> getAllCities(){
        return cities;
    }
}