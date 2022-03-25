-- Creating DB

CREATE SCHEMA practice;

-- Creating table

use practice;

CREATE TABLE students(
  sid INTEGER(11) AUTO_INCREMENT PRIMARY KEY,
  sname VARCHAR(11) NOT NULL,
  sphone VARCHAR(11)
)

INSERT INTO students
(sname,sphone)
VALUES
('Shreya','9810101010'),
('Prachi','9822222222')
