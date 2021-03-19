CREATE TABLE Trainee
(
 Trainee_ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
 Full_Name varchar(50) NOT NULL,
 Birth_Date DATE,
 Gender ENUM ('male', 'female', 'unknown'),
 ET_IQ INT,
 ET_Gmath INT,
 ET_English INT,
 Training_Class BIGINT,
 Evaluation_Notes varchar(200)
);

-- add field VTI_Account 
ALTER TABLE Trainee
  ADD VTI_Account varchar(20) NOT NULL UNIQUE KEY;

CREATE TABLE nhanvien
(
  ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  FullName varchar(50),
  Ma_Code varchar(5),
  ModifiedDate DATETIME
);
CREATE TABLE nhanvien
(
  ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  FullName varchar(50),
  BirthDate DATE,
  Gender ENUM ('male', 'female', 'unknown'),
  IsDeletedFlag ENUM ('0', '1')
);


