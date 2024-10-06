package com.fb.versatile_api;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelController {

    private Hotel hotel = new Hotel();

    @GetMapping("/hotel")
    public String getHotelInfo(){
        return String.format(
            "Hotel Name: %s.<br>" +
            "Hotel Address: %s.<br>" +
            "Contact: %s.<br><br>" +
            "Total rooms: %s<br>",
            hotel.getHotelName(),
            hotel.getHotelAddress(),
            hotel.getTelephoneNumber(),
            hotel.roomCount()
        );
    }

    @GetMapping("/hotel/listrooms")
    public String listHotelRooms() {
        List<Room> rooms = hotel.listRooms();
        StringBuilder result = new StringBuilder("Rooms: <br>");
        for (Room room : rooms) {
            result.append(String.format("Room %d: %d beds, $%.2f<br>", room.getRoomNumber(), room.getBedCount(), room.getRoomPrice()));
        }
        return result.toString();
    }

    @PostMapping("/hotel/add")
    public String addRoom(@RequestParam int roomNumber, @RequestParam int bedCount, @RequestParam double roomPrice){
        Room room = new Room(roomNumber, bedCount, roomPrice);
        hotel.addRoom(room);
        return String.format("Room %d successfully added", room.getRoomNumber());
    }

    @DeleteMapping("/hotel/delete")
    public String removeRoom(@RequestParam int roomNumber){
        Room room = hotel.findRoomByNumber(roomNumber);
        if (room != null) {
            hotel.removeRoom(room);
            return String.format("Room %d successfully removed", room.getRoomNumber());
        }
        return "Room not found";
    }
}