-- Create the City table
CREATE TABLE city (
                      id INT AUTO_INCREMENT PRIMARY KEY,
                      name VARCHAR(255) NOT NULL
);

-- Create the Hotel table
CREATE TABLE hotel (
                       id INT AUTO_INCREMENT PRIMARY KEY,
                       name VARCHAR(255) NOT NULL,
                       address VARCHAR(255) NOT NULL,
                       telephone_number VARCHAR(20),
                       number_of_rooms INT,
                       city_id INT,
                       FOREIGN KEY (city_id) REFERENCES city(id) ON DELETE CASCADE
);

-- Create the Room table
CREATE TABLE room (
                      id INT AUTO_INCREMENT PRIMARY KEY,
                      is_occupied BOOLEAN NOT NULL,
                      room_size INT NOT NULL,
                      number_of_beds INT NOT NULL,
                      has_balcony BOOLEAN NOT NULL,
                      has_tv BOOLEAN NOT NULL,
                      hotel_id INT,
                      FOREIGN KEY (hotel_id) REFERENCES hotel(id) ON DELETE CASCADE
);
