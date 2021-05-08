DROP DATABASE IF EXISTS ThucTap;
CREATE DATABASE IF NOT EXISTS ThucTap;
USE ThucTap;
-- Question1
DROP TABLE IF EXISTS Country;
CREATE TABLE Country(
Country_ID INT AUTO_INCREMENT PRIMARY KEY,
Country_Name VARCHAR(50)
);

DROP TABLE IF EXISTS Location;
CREATE TABLE Location(
Location_ID INT AUTO_INCREMENT PRIMARY KEY,
Street_Adress VARCHAR(50),
Postal_Code Double,
Country_ID INT, FOREIGN KEY(Country_ID) REFERENCES Country(Country_ID)
);


DROP TABLE IF EXISTS Employee;
CREATE TABLE Employee(
Employee_ID INT AUTO_INCREMENT PRIMARY KEY,
Full_Name VARCHAR(50),
Email VARCHAR(50),
Location_ID INT, FOREIGN KEY(Location_ID) REFERENCES Location(Location_ID)
);

INSERT INTO Country(Country_Name)
VALUES 	('Việt Nam'),
		('Nhật Bản'),
        ('Mỹ'),
        ('Trung Quốc');
        
INSERT INTO Location(Street_Adress, Postal_Code, Country_ID)
VALUES 	('Tôn Đức Thắng', '12345', '1'),
		('Trần Hưng Đạo', '12345', '1'),
        ('Osaka', '13245', '2'),
        ('Trùng Khánh', '14325', '4'),
        ('Wall', '12453', '3');
        
        
INSERT INTO Employee(Full_Name, Email, Location_ID)
VALUES 	('Trần Văn Chức', 'nn01@gmail.com', '2'),
		('Lê Mạnh Hùng', 'nn02@gmail.com', '1'),
        ('OzaWa', 'nn03@gmail.com', '3'),
        ('Eric', 'nn04@gmail.com', '5'),
        ('Tiểu Long Nữ', 'nn05@gmail.com', '4');
	

-- Question2.a

SELECT Full_Name, Email, Country_Name
FROM employee e
JOIN location l ON e.Location_ID = l.Location_ID
JOIN country c ON l.Country_ID = c.Country_ID
WHERE Country_Name = 'Việt Nam';

-- Question2.b
SELECT c.Country_Name
FROM country c
JOIN location l ON l.Country_ID = c.Country_ID
JOIN employee e ON e.Location_ID = l.Location_ID
WHERE Email = 'nn03@gmail.com';

-- Question2.c
SELECT l.Street_Adress, COUNT(e.Employee_ID) 
FROM location l
JOIN employee e ON  e.Location_ID = l.Location_ID
GROUP BY e.Employee_ID;

SELECT country_name, COUNT(employee_id) 
FROM location 
RIGHT JOIN country USING(country_id) 
INNER JOIN employee USING(location_id) GROUP BY country_id;

-- Question4
DROP TRIGGER IF EXISTS deletelocation;
DELIMITER $$
CREATE TRIGGER deletelocation 
BEFORE DELETE ON location FOR EACH ROW
BEGIN
UPDATE employee SET location_id = NULL WHERE location_id = OLD.location_id;
END; 
$$ DELIMITER ;

-- Question3
DROP TRIGGER IF EXISTS total_employee_of_each_country;
DELIMITER $$
CREATE TRIGGER total_employee_of_each_country BEFORE INSERT ON employee FOR EACH ROW
BEGIN
IF (SELECT c.country_name 
FROM country c 
JOIN location l ON l.Country_ID = c.Country_ID
WHERE location_id = NEW.location_id) 
IN (SELECT country_name, COUNT(employee_id)
FROM location l
JOIN country c ON l.Country_ID = c.Country_ID
JOIN employee e ON e.Location_ID = l.Location_ID
GROUP BY country_id 
HAVING COUNT(employee_id) >= 10) THEN
SIGNAL SQLSTATE '404'
SET MESSAGE_TEXT = 'each country can not pass 10 employee'; 
END IF;
END;
$$ DELIMITER ;






        
