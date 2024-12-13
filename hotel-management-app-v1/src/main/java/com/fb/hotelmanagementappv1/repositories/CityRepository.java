package com.fb.hotelmanagementappv1.repositories;

import com.fb.hotelmanagementappv1.models.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
    // Custom method to find a city by its name
    List<City> findByName(String name);
}
