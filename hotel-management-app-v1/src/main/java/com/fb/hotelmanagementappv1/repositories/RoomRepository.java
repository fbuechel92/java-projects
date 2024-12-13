package com.fb.hotelmanagementappv1.repositories;

import com.fb.hotelmanagementappv1.models.Room;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {
    // Custom query methods
    Room findById(int roomId);
    List<Room> findByHotelId(int hotelId);
}
