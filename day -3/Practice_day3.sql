show databases;

use healthclinicdb;

select * from Department;
select * from Doctor;
select * from Patient;
select * from Appointment;

select DoctorName, specialization from Doctor;

select * from Patient where PatientPhone like '98%';

Select * from Appointment where AppointmentDate = '2026-08-10';

Select * from Doctor where DepartmentID ='1';

select distinct AppointmentDate from Appointment;

select * from Patient where PatientName like '%Shah%';

Select * from Appointment where AppointmentDate > '2026-08-10';

select count(*) from doctor;

select PatientName from Patient order by PatientName;

select D.DoctorName, DP.DepartmentName 
from Doctor D
join Department DP
on D.DepartmentID = DP.DepartmentID;

select P.PatientName, A.AppointmentDate
from Appointment A
join patient P
on A.PatientID = P.PatientID order by AppointmentDate, PatientName;

select 
P.PatientName,
D.DoctorName,
A.AppointmentDate
from Appointment A
join Patient P
on A.PatientID = P.PatientID
join Doctor D
on A.DoctorID = D.DoctorID;

select 
P.PatientName,
D.DoctorName
from Appointment A
join Patient P
on A.PatientID = P.PatientID
join Doctor D
on A.DoctorID = D.DoctorID;

select DP.DepartmentName,count(D.DoctorID) 
from Department DP
left join Doctor D
on DP.DepartmentID = D.DepartmentID
group by DP.DepartmentName;

SELECT DISTINCT P.PatientID, P.PatientName
FROM Patient P
INNER JOIN Appointment A
ON P.PatientID = A.PatientID;

SELECT D.DoctorID, D.DoctorName
FROM Doctor D
LEFT JOIN Appointment A
ON D.DoctorID = A.DoctorID
WHERE A.AppointmentID IS NULL;

SELECT
D.DoctorName,COUNT(A.AppointmentID) AS TotalAppointments
FROM Doctor D
LEFT JOIN Appointment A
ON D.DoctorID = A.DoctorID
GROUP BY D.DoctorID, D.DoctorName;

SELECT
DP.DepartmentName, COUNT(D.DoctorID) AS TotalDoctors
FROM Department DP
LEFT JOIN Doctor D
ON DP.DepartmentID = D.DepartmentID
GROUP BY DP.DepartmentID, DP.DepartmentName
ORDER BY TotalDoctors DESC
LIMIT 1;

SELECT P.PatientName,D.DoctorName,DP.DepartmentName, A.AppointmentDate
FROM Appointment A
JOIN Patient P
ON A.PatientID = P.PatientID
JOIN Doctor D
ON A.DoctorID = D.DoctorID
JOIN Department DP
ON D.DepartmentID = DP.DepartmentID;

select 
P.PatientName,
D.DoctorName,
A.AppointmentDate,
A.TimeSlot
from Appointment A
join Patient P
on A.PatientID = P.PatientID
join Doctor D
on A.DoctorID = D.DoctorID;