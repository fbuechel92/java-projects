package com.fb.hotelmanagementappv1.controllers;

import com.fb.hotelmanagementappv1.models.Hotel;
import com.fb.hotelmanagementappv1.models.Room;
import com.fb.hotelmanagementappv1.services.ManagementService;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class ManagementController {
    private ManagementService managementService;

    //Constructor
    @Autowired
    public ManagementController(ManagementService managementService){
        this.managementService = managementService;
    }

    //Methods
    @GetMapping("/hotels/{hotelId}")
    public Hotel getHotelById(@PathVariable int hotelId){
        return managementService.getHotelbyId(hotelId);
    }

    //Room-related Methods
    @GetMapping("/rooms/status/{hotelId}")
    public List<Map<String, Object>> getRoomStatusesByHotelId(@PathVariable int hotelId) {
        List<Room> rooms = managementService.getRoomStatusesByHotelId(hotelId);
        return rooms.stream()
            .map(room -> Map.<String, Object>of(
                "roomId", room.getId(),
                "isOccupied", room.isOccupied()
            ))
            .collect(Collectors.toList());
    }

    @PostMapping("/rooms/{roomId}/book")
    public String bookRoom(@PathVariable int roomId){
        return managementService.bookRoom(roomId);
    }

    @DeleteMapping("/rooms/{roomId}/cancel")
    public String cancelRoom(@PathVariable int roomId){
        return managementService.cancelRoom(roomId);
    }
}