//Created table in MYSQL Workbench
CREATE TABLE student(
          sid CHAR(9),
          name VARCHAR(20),
          login CHAR(8),
          age INTEGER,
          gpa REAL
)


//Inserting records in table

use demo;
INSERT INTO student 
VALUES 
		(1,'Shreya','shr123',21,4.4),
		(2,'Kunal','kun123',24,3.9),
		(3,'Vaibhav','vai123',21,4.2),
		(4,'Vanshika','van123',22,4.5),
		(5,'Siddhant','sid123',20,4.5);
