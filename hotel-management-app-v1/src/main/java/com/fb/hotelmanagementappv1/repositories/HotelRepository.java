package com.fb.hotelmanagementappv1.repositories;

import com.fb.hotelmanagementappv1.models.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {
    // Custom query methods
    List<Hotel> findByCityId(int cityId);
}
