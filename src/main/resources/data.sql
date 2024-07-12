CREATE TABLE IF NOT EXISTS BOTTLE (
    id INT AUTO_INCREMENT PRIMARY KEY,
    address VARCHAR(255) NOT NULL,
    number_of_bottles INT NOT NULL,
    picked_up BOOLEAN NOT NULL
);


INSERT INTO BOTTLE (address, number_of_bottles, picked_up) VALUES ('123 Main St', 10, false);
