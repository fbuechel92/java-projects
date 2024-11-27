package com.fb.hotelmanagementappv1.controllers;

import com.fb.hotelmanagementappv1.models.Hotel;
import com.fb.hotelmanagementappv1.models.Room;
import com.fb.hotelmanagementappv1.services.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserService userService;

    //Constructor to initialize service classes
    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    //Hotel-related Methods
    @GetMapping("/hotels")
    public List<Hotel> getHotels(@RequestParam(value = "cityId", required = false) Integer cityId) {
        if (cityId != null) {
            return userService.getHotelsByCityId(cityId);
        } else {
            return userService.getAllHotels();
        }
    }

    @GetMapping("/hotels/{hotelId}")
    public Hotel getHotelById(@PathVariable int hotelId){
        return userService.getHotelById(hotelId);
    }

    @GetMapping("/cities/{cityId}/hotels")
    public List<Hotel> getHotelsByCityId(@PathVariable int cityId){
        return userService.getHotelsByCityId(cityId);
    }

    //Room-related Methods
    @GetMapping("/hotels/{hotelId}/rooms")
    public List<Room> getRoomsByHotelId(@PathVariable int hotelId){
        return userService.getRoomsByHotelId(hotelId);
    }

    @PostMapping("/rooms/{roomId}/book")
    public String bookRoom(@PathVariable int roomId){
        return userService.bookRoom(roomId);
    }

    @DeleteMapping("/rooms/{roomId}/cancel")
    public String cancelRoom(@PathVariable int roomId){
        return userService.cancelRoom(roomId);
    }
}