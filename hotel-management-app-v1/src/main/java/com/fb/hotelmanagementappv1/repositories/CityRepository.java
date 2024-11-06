package com.fb.hotelmanagementappv1.repositories;

import com.fb.hotelmanagementappv1.dataSource.DataInititalization;
import com.fb.hotelmanagementappv1.models.City;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class CityRepository {
    private DataInititalization dataInititalization;

    //Constructor
    public CityRepository(DataInititalization dataInititalization){
        this.dataInititalization = dataInititalization;
    }

    //Methods
    public void addCity(City paramCity){
        dataInititalization.getCities().add(paramCity);
    }

    public City getCity(int id){
        for (City city : dataInititalization.getCities()) {
            if (city.getId() == id) {
                return city;
            }
        }
        return null;
    }

    public List<City> getAllCities(){
        return dataInititalization.getCities();
    }
}