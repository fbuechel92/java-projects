package com.fb.hotelmanagementappv1.services;

import com.fb.hotelmanagementappv1.models.City;
import com.fb.hotelmanagementappv1.models.Hotel;
import com.fb.hotelmanagementappv1.models.Room;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataInitializationService {

    private List<City> cities;
    private List<Hotel> hotels;
    private List<Room> rooms;

    public DataInitializationService() {
        cities = initializeCities();
        hotels = initializeHotels();
        rooms = initializeRooms();
    }

    private List<City> initializeCities() {
        List<City> cities = new ArrayList<>();
        cities.add(new City(1, "New York"));
        cities.add(new City(2, "Los Angeles"));
        cities.add(new City(3, "Chicago"));
        cities.add(new City(4, "Houston"));
        cities.add(new City(5, "Phoenix"));
        cities.add(new City(6, "Philadelphia"));
        cities.add(new City(7, "San Antonio"));
        cities.add(new City(8, "San Diego"));
        cities.add(new City(9, "Dallas"));
        cities.add(new City(10, "San Jose"));
        cities.add(new City(11, "London"));
        cities.add(new City(12, "Paris"));
        cities.add(new City(13, "Berlin"));
        cities.add(new City(14, "Tokyo"));
        cities.add(new City(15, "Sydney"));
        cities.add(new City(16, "Toronto"));
        cities.add(new City(17, "Dubai"));
        cities.add(new City(18, "Mumbai"));
        cities.add(new City(19, "São Paulo"));
        cities.add(new City(20, "Cape Town"));
        return cities;
    }

    private List<Hotel> initializeHotels() {
        List<Hotel> hotels = new ArrayList<>();
        hotels.add(new Hotel(1, "Hotel California", "42 Sunset Blvd, Los Angeles", "123-456-7890", 10, 2));
        hotels.add(new Hotel(2, "The Grand Budapest Hotel", "1 Zubrowka Street, Zubrowka", "123-456-7891", 15, 13));
        hotels.add(new Hotel(3, "Ritz Paris", "15 Place Vendôme, Paris", "123-456-7892", 20, 12));
        hotels.add(new Hotel(4, "The Plaza", "768 5th Ave, New York", "123-456-7893", 25, 1));
        hotels.add(new Hotel(5, "Marina Bay Sands", "10 Bayfront Ave, Singapore", "123-456-7894", 30, 14));
        hotels.add(new Hotel(6, "Burj Al Arab", "Jumeirah St, Dubai", "123-456-7895", 15, 17));
        hotels.add(new Hotel(7, "Taj Mahal Palace", "Apollo Bandar, Mumbai", "123-456-7896", 20, 18));
        hotels.add(new Hotel(8, "Four Seasons Hotel Sydney", "199 George St, Sydney", "123-456-7897", 10, 15));
        hotels.add(new Hotel(9, "The Savoy", "Strand, London", "123-456-7898", 25, 11));
        hotels.add(new Hotel(10, "Fairmont Royal York", "100 Front St W, Toronto", "123-456-7899", 20, 16));
        hotels.add(new Hotel(11, "Hilton Chicago", "720 S Michigan Ave, Chicago", "123-456-7800", 15, 3));
        hotels.add(new Hotel(12, "Hotel Icon", "17 Science Museum Rd, Hong Kong", "123-456-7801", 20, 14));
        hotels.add(new Hotel(13, "Park Hyatt Tokyo", "3-7-1-2 Nishi Shinjuku, Tokyo", "123-456-7802", 25, 14));
        hotels.add(new Hotel(14, "Palace Hotel Tokyo", "1-1-1 Marunouchi, Tokyo", "123-456-7803", 30, 14));
        hotels.add(new Hotel(15, "Shangri-La Hotel", "1 Tooley St, London", "123-456-7804", 15, 11));
        hotels.add(new Hotel(16, "The Oberoi", "Dr. Zakir Hussain Marg, New Delhi", "123-456-7805", 20, 18));
        hotels.add(new Hotel(17, "Hotel Unique", "Av. Brigadeiro Luís Antônio, São Paulo", "123-456-7806", 25, 19));
        hotels.add(new Hotel(18, "Belmond Mount Nelson Hotel", "76 Orange St, Cape Town", "123-456-7807", 30, 20));
        hotels.add(new Hotel(19, "The Peninsula", "700 Fifth Avenue, New York", "123-456-7808", 15, 1));
        hotels.add(new Hotel(20, "The Langham", "1c Portland Place, London", "123-456-7809", 20, 11));
        hotels.add(new Hotel(21, "Mandarin Oriental", "66 Knightsbridge, London", "123-456-7810", 25, 11));
        hotels.add(new Hotel(22, "The Ritz-Carlton", "181 Wellington St W, Toronto", "123-456-7811", 30, 16));
        hotels.add(new Hotel(23, "The Peninsula Paris", "19 Avenue Kléber, Paris", "123-456-7812", 15, 12));
        hotels.add(new Hotel(24, "Le Bristol Paris", "112 Rue du Faubourg Saint-Honoré, Paris", "123-456-7813", 20, 12));
        hotels.add(new Hotel(25, "Hotel de Crillon", "10 Place de la Concorde, Paris", "123-456-7814", 25, 12));
        hotels.add(new Hotel(26, "The St. Regis", "2 East 55th Street, New York", "123-456-7815", 30, 1));
        hotels.add(new Hotel(27, "The Waldorf Astoria", "301 Park Avenue, New York", "123-456-7816", 15, 1));
        hotels.add(new Hotel(28, "The Knickerbocker", "6 Times Square, New York", "123-456-7817", 20, 1));
        hotels.add(new Hotel(29, "The Peninsula Chicago", "108 E Superior St, Chicago", "123-456-7818", 25, 3));
        hotels.add(new Hotel(30, "The Drake", "140 E Walton Pl, Chicago", "123-456-7819", 30, 3));
        hotels.add(new Hotel(31, "The Houstonian", "111 N Post Oak Ln, Houston", "123-456-7820", 15, 4));
        hotels.add(new Hotel(32, "Hotel ZaZa", "5701 Main St, Houston", "123-456-7821", 20, 4));
        hotels.add(new Hotel(33, "The Phoenician", "6000 E Camelback Rd, Phoenix", "123-456-7822", 25, 5));
        hotels.add(new Hotel(34, "Arizona Biltmore", "2400 E Missouri Ave, Phoenix", "123-456-7823", 30, 5));
        hotels.add(new Hotel(35, "The Rittenhouse", "210 W Rittenhouse Square, Philadelphia", "123-456-7824", 15, 6));
        hotels.add(new Hotel(36, "The Logan", "1 Logan Square, Philadelphia", "123-456-7825", 20, 6));
        hotels.add(new Hotel(37, "Hotel Emma", "136 E Grayson St, San Antonio", "123-456-7826", 25, 7));
        hotels.add(new Hotel(38, "The St. Anthony", "300 E Travis St, San Antonio", "123-456-7827", 30, 7));
        hotels.add(new Hotel(39, "Hotel del Coronado", "1500 Orange Ave, San Diego", "123-456-7828", 15, 8));
        hotels.add(new Hotel(40, "The US Grant", "326 Broadway, San Diego", "123-456-7829", 20, 8));
        hotels.add(new Hotel(41, "The Joule", "1530 Main St, Dallas", "123-456-7830", 25, 9));
        hotels.add(new Hotel(42, "The Adolphus", "1321 Commerce St, Dallas", "123-456-7831", 30, 9));
        hotels.add(new Hotel(43, "Fairmont San Jose", "170 S Market St, San Jose", "123-456-7832", 15, 10));
        hotels.add(new Hotel(44, "The Westin San Jose", "302 S Market St, San Jose", "123-456-7833", 20, 10));
        hotels.add(new Hotel(45, "The Ritz-Carlton", "600 Stockton St, San Francisco", "123-456-7834", 25, 10));
        hotels.add(new Hotel(46, "Four Seasons Hotel", "757 Market St, San Francisco", "123-456-7835", 30, 10));
        hotels.add(new Hotel(47, "The Fairmont", "950 Mason St, San Francisco", "123-456-7836", 15, 10));
        hotels.add(new Hotel(48, "The St. Regis", "125 3rd St, San Francisco", "123-456-7837", 20, 10));
        hotels.add(new Hotel(49, "The Palace Hotel", "2 New Montgomery St, San Francisco", "123-456-7838", 25, 10));
        hotels.add(new Hotel(50, "Hotel Nikko", "222 Mason St, San Francisco", "123-456-7839", 30, 10));
        return hotels;
    }

    private List<Room> initializeRooms() {
        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room(1, false, 20, 1, true, true, 1));
        rooms.add(new Room(2, false, 30, 2, false, true, 1));
        rooms.add(new Room(3, true, 40, 3, true, false, 1));
        rooms.add(new Room(4, false, 50, 4, false, true, 1));
        rooms.add(new Room(5, true, 60, 1, true, false, 1));
        rooms.add(new Room(6, false, 20, 1, false, true, 2));
        rooms.add(new Room(7, true, 30, 2, true, false, 2));
        rooms.add(new Room(8, false, 40, 3, false, true, 2));
        rooms.add(new Room(9, true, 50, 4, true, false, 2));
        rooms.add(new Room(10, false, 60, 1, false, true, 2));
        rooms.add(new Room(11, true, 20, 1, true, false, 3));
        rooms.add(new Room(12, false, 30, 2, false, true, 3));
        rooms.add(new Room(13, true, 40, 3, true, false, 3));
        rooms.add(new Room(14, false, 50, 4, false, true, 3));
        rooms.add(new Room(15, true, 60, 1, true, false, 3));
        rooms.add(new Room(16, false, 20, 1, false, true, 4));
        rooms.add(new Room(17, true, 30, 2, true, false, 4));
        rooms.add(new Room(18, false, 40, 3, false, true, 4));
        rooms.add(new Room(19, true, 50, 4, true, false, 4));
        rooms.add(new Room(20, false, 60, 1, false, true, 4));
        rooms.add(new Room(21, true, 20, 1, true, false, 5));
        rooms.add(new Room(22, false, 30, 2, false, true, 5));
        rooms.add(new Room(23, true, 40, 3, true, false, 5));
        rooms.add(new Room(24, false, 50, 4, false, true, 5));
        rooms.add(new Room(25, true, 60, 1, true, false, 5));
        rooms.add(new Room(26, false, 20, 1, false, true, 6));
        rooms.add(new Room(27, true, 30, 2, true, false, 6));
        rooms.add(new Room(28, false, 40, 3, false, true, 6));
        rooms.add(new Room(29, true, 50, 4, true, false, 6));
        rooms.add(new Room(30, false, 60, 1, false, true, 6));
        rooms.add(new Room(31, true, 20, 1, true, false, 7));
        rooms.add(new Room(32, false, 30, 2, false, true, 7));
        rooms.add(new Room(33, true, 40, 3, true, false, 7));
        rooms.add(new Room(34, false, 50, 4, false, true, 7));
        rooms.add(new Room(35, true, 60, 1, true, false, 7));
        rooms.add(new Room(36, false, 20, 1, false, true, 8));
        rooms.add(new Room(37, true, 30, 2, true, false, 8));
        rooms.add(new Room(38, false, 40, 3, false, true, 8));
        rooms.add(new Room(39, true, 50, 4, true, false, 8));
        rooms.add(new Room(40, false, 60, 1, false, true, 8));
        rooms.add(new Room(41, true, 20, 1, true, false, 9));
        rooms.add(new Room(42, false, 30, 2, false, true, 9));
        rooms.add(new Room(43, true, 40, 3, true, false, 9));
        rooms.add(new Room(44, false, 50, 4, false, true, 9));
        rooms.add(new Room(45, true, 60, 1, true, false, 9));
        rooms.add(new Room(46, false, 20, 1, false, true, 10));
        rooms.add(new Room(47, true, 30, 2, true, false, 10));
        rooms.add(new Room(48, false, 40, 3, false, true, 10));
        rooms.add(new Room(49, true, 50, 4, true, false, 10));
        rooms.add(new Room(50, false, 60, 1, false, true, 10));
        return rooms;
    }

    //Methods to access the initialized data
    public List<Hotel> getInitializationHotelData(){
        return hotels;
    }

    public List<Room> getInitializationRoomData(){
        return rooms;
    }

    public List<City> getInitializationCityData(){
        return cities;
    }
}