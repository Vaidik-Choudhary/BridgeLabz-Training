create database health_clinic;
use health_clinic;

create table patient (
	patient_id int primary key auto_increment,
    name varchar(100) not null,
    phone varchar(15),
    dob Date);
    
create table doctor (
	doctor_id int primary key auto_increment,
    name varchar(100) not null,
    speciality varchar(50));
    
create table Appointment (
	appointment_id int primary key auto_increment,
    patient_id int not null,
    doctor_id int not null,
    appointment_date datetime not null,
    status varchar(20) Default 'Scheduled',
    foreign key(patient_id) references patient(patient_id),
    foreign key(doctor_id) references doctor(doctor_id));
    
insert into patient (name, phone, dob) values
    ('Ravi Kumar', '9876500000', '1990-01-01'),
    ('Meena S',     '9123400000', '1988-05-05');
    
insert into doctor (name, speciality) values
    ('Dr. Anita',  'Cardiology'),
    ('Dr. Suresh', 'Orthopedic');
    
insert into appointment (patient_id, doctor_id, appointment_date, status) values
    (1, 1, '2026-08-05 10:00:00', 'Scheduled'),
    (1, 2, '2026-08-06 11:30:00', 'Scheduled'),
    (2, 1, '2026-08-07 09:00:00', 'Scheduled');
    
SELECT p.name AS patient, d.name AS doctor, a.appointment_date
FROM appointment a
JOIN patient p ON a.patient_id = p.patient_id
JOIN doctor d  ON a.doctor_id  = d.doctor_id
ORDER BY a.appointment_date;

CREATE TABLE appointment_bad (
    appt_id INT PRIMARY KEY AUTO_INCREMENT,
    patient_name varchar(100),
    patient_phone VARCHAR(15),
    doctor_name VARCHAR(100),
    doctor_specialty VARCHAR(50),
    appt_date DATETIME
);

INSERT INTO appointment_bad (patient_name, patient_phone, doctor_name, doctor_specialty, appt_date) VALUES
    ('Ravi Kumar', '9876500000', 'Dr. Anita',  'Cardiology', '2026-08-05 10:00:00'),
    ('Ravi Kumar', '9876500000', 'Dr. Suresh', 'Orthopedic', '2026-08-06 11:30:00'),
    ('Meena S', '9123400000', 'Dr. Anita',  'Cardiology', '2026-08-07 09:00:00');
    
UPDATE appointment_bad
SET patient_phone = '9999999999'
WHERE patient_name = 'Ravi Kumar';

SELECT ROW_COUNT();

select * from appointment_bad;
    
UPDATE patient
SET phone = '9999999999'
WHERE name = 'Ravi Kumar';

ALTER TABLE doctor ADD COLUMN department_name VARCHAR(50);

UPDATE doctor SET department_name = 'Cardiology Dept' WHERE speciality = 'Cardiology';

UPDATE doctor SET department_name = 'Ortho Dept' WHERE speciality = 'Orthopedic';

select * from doctor;

ALTER TABLE doctor DROP COLUMN department_name;

CREATE TABLE department (
    department_id   INT PRIMARY KEY AUTO_INCREMENT,
    department_name VARCHAR(50) NOT NULL
);

ALTER TABLE doctor ADD COLUMN department_id INT;

ALTER TABLE doctor ADD FOREIGN KEY (department_id) REFERENCES department(department_id);

INSERT INTO department (department_name) VALUES ('Cardiology Dept'), ('Ortho Dept');

UPDATE doctor SET department_id = 1 WHERE speciality = 'Cardiology';

UPDATE doctor SET department_id = 2 WHERE speciality = 'Orthopedic';

UPDATE department SET department_name = 'Cardiology Department' WHERE department_id = 1;

UPDATE department SET department_name = 'Orthopedic Department' WHERE department_id = 2;

SELECT d.name, d.speciality, dep.department_name
FROM doctor d JOIN department dep ON d.department_id = dep.department_id;

DELIMITER $$
CREATE PROCEDURE seed_appointments(IN n INT)
BEGIN
    DECLARE i INT DEFAULT 0;
    WHILE i < n DO
        INSERT INTO appointment (patient_id, doctor_id, appointment_date, status)
        VALUES (
            1 + FLOOR(RAND() * 2),
            1 + FLOOR(RAND() * 2),
            DATE_ADD('2026-01-01', INTERVAL FLOOR(RAND()*365) DAY),
            'Scheduled'
        );
        SET i = i + 1;
    END WHILE;
END$$
DELIMITER ;

CALL seed_appointments(50000);

SELECT * FROM appointment WHERE patient_id = 1;

SELECT * FROM appointment
WHERE doctor_id = 1 AND appointment_date > '2026-06-01';

CREATE INDEX idx_doctor_date ON appointment(doctor_id, appointment_date);

SELECT * FROM appointment
WHERE doctor_id = 1 AND appointment_date > '2026-06-01';

DROP TABLE IF EXISTS appointment_bad;

DROP PROCEDURE IF EXISTS seed_appointments;
