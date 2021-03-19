CREATE DATABASE Nhan_su;

USE Nhan_su;

CREATE TABLE Department 
(
  Department_ID int NOT NULL PRIMARY KEY AUTO_INCREMENT,
  Department_Name varchar(20) NOT NULL
);

CREATE TABLE Position 
(
  Position_ID int NOT NULL PRIMARY KEY AUTO_INCREMENT,
  Position_Name varchar(20) NOT NULL
);

CREATE TABLE account_table 
(
  Account_ID int NOT NULL PRIMARY KEY AUTO_INCREMENT,
  email varchar(100),
  Username varchar(20) NOT NULL,
  Fullname varchar(30) NOT NULL,
  Department_ID int NOT NULL,
  Position_ID int NOT NULL,
  CreateDate date NOT NULL
);

CREATE TABLE group_table 
(
  Group_ID int NOT NULL PRIMARY KEY AUTO_INCREMENT,
  GroupName varchar(30) NOT NULL,
  CreatorID int,
  CreateDate date NOT NULL
);

CREATE TABLE groupaccount 
(
  Group_ID int NOT NULL,
  Account_ID int NOT NULL,
  JoinDate date NOT NULL
);

CREATE TABLE typequestion 
(
  Type_ID int NOT NULL PRIMARY KEY AUTO_INCREMENT,
  TypeName enum('Essay','Multiple-Choice') NOT NULL
);

CREATE TABLE categoryquestion 
(
  Category_ID int NOT NULL PRIMARY KEY AUTO_INCREMENT,
  CategoryName varchar(20) NOT NULL
);

CREATE TABLE question 
(
  Question_ID int NOT NULL PRIMARY KEY AUTO_INCREMENT,
  Content varchar(200) NOT NULL,
  Category_ID int NOT NULL,
  Type_ID int NOT NULL,
  Creator_ID int NOT NULL,
  CreateDate date NOT NULL
);

CREATE TABLE answer 
(
  Answer_ID int NOT NULL PRIMARY KEY AUTO_INCREMENT,
  Content varchar(200) NOT NULL,
  Question_ID int NOT NULL,
  isCorrect enum('Trule','False') NOT NULL
);

CREATE TABLE exam 
(
  Exam_ID int NOT NULL PRIMARY KEY  AUTO_INCREMENT,
  CodeExam bigint NOT NULL,
  Title varchar(50) DEFAULT NULL,
  Category_ID int NOT NULL,
  Duration time NOT NULL,
  CreatorExam_ID int DEFAULT NULL,
  CreateExamDate date DEFAULT NULL
);

CREATE TABLE examquestion 
(
  Exam_ID int NOT NULL PRIMARY KEY AUTO_INCREMENT,
  Question_ID int NOT NULL
);

-- Add data department
INSERT INTO department( Department_Name )
VALUE 
  ('Marketing'),
  ('Sale'),
  ('Nhân sự'),
  ('Tài chính'),
  ('Giám đốc'),
  ('Phó giám đốc'),
  ('Kỹ thuật');


-- Add data Position
INSERT INTO Position (Position_Name)
VALUE 
  ('Dev'),
  ('Test'),
  ('Scrum Master'),
  ('PM'),
  ('Senior');
  
-- Add data account_table
INSERT INTO account_table (Email, Username, Fullname, Department_ID, Position_ID, CreateDate)
VALUE 
  ('abc@gmail.com', 'chuctranbk', 'Tran Van Chuc', 7, 1, 19/3/2021),
  ('maian@gmail.com', 'abcxyz', 'Mai Van An', 7, 5, 19/3/2020),
  ('Quyetnguyen@gmail.com', 'QuyetPM', 'Nguyen Van Quyet', 3, 4, 20/3/2018),
  ('','HaThu', 'Nguyen Thi Thu Ha', 7, 2, 19/3/2020),
  ('', 'HaiPK','Nguyen Hoang Hai', 7, 3, 19/3/2021);
  










