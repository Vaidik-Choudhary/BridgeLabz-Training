-- DDL Operations

CREATE DATABASE HealthClinicDB;

SHOW DATABASES;

USE HealthClinicDB;

CREATE TABLE Doctor (
	DoctorID INT AUTO_INCREMENT PRIMARY KEY,
    FirstName VARCHAR(50) NOT NULL,
    LastName VARCHAR(50) NOT NULL,
    Specialization VARCHAR(100) NOT NULL,
    Phone VARCHAR(15) UNIQUE,
    CreatedOn DATETIME DEFAULT CURRENT_TIMESTAMP
    );
    
ALTER TABLE Doctor ADD Email VARCHAR(100) UNIQUE;

-- DML Operations

INSERT INTO Doctor (FirstName, LastName, Specialization, Phone, Email) 
	VALUES ('Anuj','Vishwakarma','Neurologist','9039311343','Anuj123@gamil.com'),
	('Aryan','Borker','Cardiologist','9039321343','Aryan123@gamil.com'),
	('Vaidik','Choudhary','General','9039311543','Vaidik123@gamil.com');

SELECT * FROM Doctor;

SELECT DoctorID, FirstName, LastName 
FROM Doctor
WHERE Specialization = 'General';

UPDATE Doctor SET Phone ='9893278862' WHERE DoctorID = 1;

SELECT DoctorID, FirstName, LastName, Phone 
FROM Doctor
WHERE DoctorID = 1 ;

DELETE FROM Doctor WHERE DoctorID = 2;

