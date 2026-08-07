use HealthClinicDB;

-- unnormalized table --------------------------------------------------------------------------------------------------------------------------------

CREATE TABLE BookingSheet_UNF (
    ApptID INT,
    PatientName VARCHAR(100),
    PatientPhone VARCHAR(15),
    DoctorName VARCHAR(200),
    Specialization VARCHAR(200),
    Department VARCHAR(200),
    AppointmentDate DATE,
    TimeSlot TIME,
    Symptoms VARCHAR(255)
);

INSERT INTO BookingSheet_UNF
VALUES
(101,'Rita Shah','98765xxxxx','Dr. Rao, Dr. Iyer','Cardiology, ENT','Cardiology, ENT','2026-08-10','10:00:00','Chest Pain, Ear Pain'),
(102,'Rita Shah','98765xxxxx','Dr. Rao','Cardiology','Cardiology','2026-08-20','11:00:00','Follow-up');

DROP TABLE BookingSheet_UNF;

-- 1 NF table -----------------------------------------------------------------------------------------------------------------------------------------

CREATE TABLE BookingSheet_1NF (
    ApptID INT,
    PatientName VARCHAR(100),
    PatientPhone VARCHAR(15),
    DoctorName VARCHAR(100),
    Specialization VARCHAR(100),
    Department VARCHAR(100),
    AppointmentDate DATE,
    TimeSlot TIME,
    Symptoms VARCHAR(100)
);

INSERT INTO BookingSheet_1NF
VALUES
(101,'Rita Shah','98765xxxxx','Dr. Rao','Cardiology','Cardiology','2026-08-10','10:00:00','Chest Pain'),
(101,'Rita Shah','98765xxxxx','Dr. Iyer','ENT','ENT','2026-08-10','10:00:00','Ear Pain'),
(102,'Rita Shah','98765xxxxx','Dr. Rao','Cardiology','Cardiology','2026-08-20','11:00:00','Follow-up');

DROP TABLE BookingSheet_1NF;


-- 2NF tables -----------------------------------------------------------------------------------------------------------------------------------------

CREATE TABLE Doctor_2NF (
    DoctorID INT PRIMARY KEY,
    DoctorName VARCHAR(100),
    Specialization VARCHAR(100),
    Department VARCHAR(100)
);

CREATE TABLE Appointment_2NF (
    ApptID INT,
    PatientName VARCHAR(100),
    PatientPhone VARCHAR(15),
    DoctorID INT,
    AppointmentDate DATE,
    TimeSlot TIME,
    Symptoms VARCHAR(100),
    FOREIGN KEY (DoctorID) REFERENCES Doctor_2NF(DoctorID)
);

INSERT INTO Doctor_2NF
VALUES
(1,'Dr. Rao','Cardiology','Cardiology'),
(2,'Dr. Iyer','ENT','ENT');

INSERT INTO Appointment_2NF
VALUES
(101,'Rita Shah','98765xxxxx',1,'2026-08-10','10:00:00','Chest Pain'),
(101,'Rita Shah','98765xxxxx',2,'2026-08-10','10:00:00','Ear Pain'),
(102,'Rita Shah','98765xxxxx',1,'2026-08-20','11:00:00','Follow-up');

DROP TABLE Doctor_2NF;
DROP TABLE Appointment_2NF;


-- 3NF tables -----------------------------------------------------------------------------------------------------------------------------------------

CREATE TABLE Department (
    DepartmentID INT PRIMARY KEY auto_increment,
    DepartmentName VARCHAR(100)
);

CREATE TABLE Doctor (
    DoctorID INT PRIMARY KEY auto_increment,
    DoctorName VARCHAR(100),
    Specialization VARCHAR(100),
    DepartmentID INT,
    FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID)
);

CREATE TABLE Patient (
    PatientID INT PRIMARY KEY auto_increment,
    PatientName VARCHAR(100),
    PatientPhone VARCHAR(15)
);

CREATE TABLE Appointment (
    AppointmentID INT PRIMARY KEY auto_increment,
    PatientID INT,
    DoctorID INT,
    AppointmentDate DATE,
    TimeSlot TIME,
    Symptoms VARCHAR(100),
    FOREIGN KEY (PatientID) REFERENCES Patient(PatientID),
    FOREIGN KEY (DoctorID) REFERENCES Doctor(DoctorID)
);

INSERT INTO Department(DepartmentName)
VALUES
('Cardiology'),
('ENT'),
('Orthopedic'),
('Neurology'),
('General');

INSERT INTO Doctor(DoctorName,Specialization,DepartmentID)
VALUES
('Dr. Rao','Cardiology',1),
('Dr. Iyer','ENT',2),
('Dr. Choudhary','Orthopedic',3),
('Dr. Vishwakarma','Neurology',4),
('Dr. verma','General',5);

INSERT INTO Patient(PatientName,PatientPhone)
VALUES
('Rita Shah','98765xxxxx'),
('Anuj Vishwakarma','8903453955'),
('Aryan Borker','7843657432'),
('Ravi Kumar','9683627586'),
('Raghav Sharma','8976547654');

INSERT INTO Appointment( PatientID ,DoctorID ,AppointmentDate ,TimeSlot , Symptoms)
VALUES
(1,1,'2026-08-10','10:00:00','Chest Pain'),
(2,2,'2026-08-10','10:00:00','Ear Pain'),
(3,3,'2026-08-20','11:00:00','Follow-up'),
(4,1,'2026-08-20','12:00:00','Follow-up'),
(3,5,'2026-08-10','11:00:00','Indigestion'); 

-- the given ideal Schema -----------------------------------------------------------------------------------------------------------------------------

CREATE TABLE Department (
DepartmentID INT AUTO_INCREMENT PRIMARY KEY,
DepartmentName VARCHAR(80) NOT NULL
);

CREATE TABLE Doctor (
DoctorID INT AUTO_INCREMENT PRIMARY KEY,
FirstName VARCHAR(50) NOT NULL,
LastName VARCHAR(50) NOT NULL,
Specialization VARCHAR(100) NOT NULL,
Phone VARCHAR(15) UNIQUE,
DepartmentID INT NOT NULL REFERENCES Department(DepartmentID)
);

DESC Doctor;

DROP TABLE Doctor;

CREATE TABLE Doctor (
DoctorID INT AUTO_INCREMENT PRIMARY KEY,
FirstName VARCHAR(50) NOT NULL,
LastName VARCHAR(50) NOT NULL,
Specialization VARCHAR(100) NOT NULL,
Phone VARCHAR(15) UNIQUE,
DepartmentID INT NOT NULL,
FOREIGN KEY(DepartmentID) REFERENCES Department(DepartmentID)
);

CREATE TABLE Patient (
PatientID INT AUTO_INCREMENT PRIMARY KEY,
FirstName VARCHAR(50) NOT NULL,
LastName VARCHAR(50) NOT NULL,
DateOfBirth DATE NOT NULL,
Gender CHAR(1) CHECK (Gender IN ('M','F','O')),
Phone VARCHAR(15) UNIQUE,
Address VARCHAR(200)
);

CREATE TABLE Appointment (
AppointmentID INT AUTO_INCREMENT PRIMARY KEY,
PatientID INT NOT NULL REFERENCES Patient(PatientID),
DoctorID INT NOT NULL REFERENCES Doctor(DoctorID),
AppointmentDate DATE NOT NULL,
TimeSlot TIME NOT NULL,
Status VARCHAR(20) DEFAULT 'Scheduled'
);

DESC Appointment;

DROP TABLE Appointment;

CREATE TABLE Appointment (
AppointmentID INT AUTO_INCREMENT PRIMARY KEY,
PatientID INT NOT NULL,
DoctorID INT NOT NULL,
AppointmentDate DATE NOT NULL,
TimeSlot TIME NOT NULL,
Status VARCHAR(20) DEFAULT 'Scheduled',
FOREIGN KEY(PatientID) REFERENCES Patient(PatientID),
FOREIGN KEY(DoctorID) REFERENCES Doctor(DoctorID)
);

CREATE INDEX IX_Appointment_DoctorDate
ON Appointment (DoctorID, AppointmentDate);

show tables;

drop table Appointment;
drop table Doctor;
drop table department;
drop table patient;

show tables;
