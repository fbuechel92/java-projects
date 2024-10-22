package com.fb.hotelmanagementappv1.repositories;

import com.fb.hotelmanagementappv1.models.City;
import java.util.ArrayList;
import java.util.List;

public class CityRepository {
    private List<City> cities;

    //Constructor
    public CityRepository(){
        this.cities = new ArrayList<>();
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
