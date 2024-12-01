package com.fb.hotelmanagementappv1.controllers;

import com.fb.hotelmanagementappv1.models.Hotel;
import com.fb.hotelmanagementappv1.models.Room;
import com.fb.hotelmanagementappv1.services.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<Hotel>> getHotels(@RequestParam(value = "cityId", required = false) Integer cityId) {
        List<Hotel> hotels;
        if (cityId != null) {
            hotels = userService.getHotelsByCityId(cityId);
        } else {
            hotels = userService.getAllHotels();
        }
        return ResponseEntity.status(HttpStatus.OK).body(hotels);
    }

    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable int hotelId){
        Hotel hotel = userService.getHotelById(hotelId);
        if(hotel == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(hotel);
        }
    }

    @GetMapping("/cities/{cityId}/hotels")
    public ResponseEntity<List<Hotel>> getHotelsByCityId(@PathVariable int cityId){
        List<Hotel> hotels = userService.getHotelsByCityId(cityId);
        return ResponseEntity.status(HttpStatus.OK).body(hotels);
    }

    //Room-related Methods
    @GetMapping("/hotels/{hotelId}/rooms")
    public ResponseEntity<List<Room>> getRoomsByHotelId(@PathVariable int hotelId){
        List<Room> rooms = userService.getRoomsByHotelId(hotelId);
        return ResponseEntity.status(HttpStatus.OK).body(rooms);
    }

    @PostMapping("/rooms/{roomId}/book")
    public ResponseEntity<String> bookRoom(@PathVariable int roomId){
        String response = userService.bookRoom(roomId);
        if(response == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        } else {
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        }
    }

    @DeleteMapping("/rooms/{roomId}/cancel")
    public ResponseEntity<String> cancelRoom(@PathVariable int roomId){
        String response = userService.cancelRoom(roomId);
        if(response == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(response);
        }
    }
}