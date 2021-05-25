DROP DATABASE IF EXISTS FINALEXAM;
CREATE DATABASE FINALEXAM;
USE FINALEXAM;
DROP TABLE IF EXISTS `Project`;
CREATE TABLE `Project`(
	
	ProjectID 	TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    ProjectName VARCHAR(20),
	TeamSize 	TINYINT  UNSIGNED	NOT NULL,
    IDManager 	TINYINT UNSIGNED	UNIQUE KEY,
	IDEmployees TINYINT UNSIGNED 	
   
);
INSERT INTO `Project`  (TeamSize, ProjectName, IDManager, IDEmployees	) 
VALUES
						( 4		,'SQL', 1			, 3	),
						( 2		, 'JAVA', 4			, 1	),
						( 3		, 'C#', 3			, 2	),
						( 3		, 'C++', 2			, 2	);
			
DROP TABLE IF EXISTS `User`;
CREATE TABLE `User`(
	IDUser 	TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	FullName 	VARCHAR(250)  	NOT NULL,
    Email 		VARCHAR(250)	UNIQUE KEY,
    `PassWord`	VARCHAR(50) 	NOT NULL,
    `Role`		ENUM("Manager","Employee"),
    ExpInYear 	TINYINT UNSIGNED DEFAULT 0,
    ProjectID	TINYINT UNSIGNED DEFAULT 0 ,
    ProjectName VARCHAR(20),
    ProSkill	VARCHAR(250) ,
	
    FOREIGN KEY (ProjectID) REFERENCES  `Project`(ProjectID)
    
);

INSERT INTO `User`(FullName					, Email				 ,`PassWord`	, `Role`, ExpInYear, ProjectId, ProjectName, ProSkill) 
VALUES
					( "Pham Cong Bao"	,	"baopc@vti.com.vn"	, 	"B1233233"	,	"Manager"  , 9        ,1, 'SQL' ,null),
                    ( "Pham Hoang Cuong",	"cuongph@vti.com.vn", 	"PassWord2"	,	"Manager"  , 4        ,4, 'C++' ,null),
                    ( "Nguyen Van Toan"	,	"Toannv@vti.com.vn"	, 	"PassWord3"	,	"Manager"  , 8        ,3, 'C#' ,null),
                    ( "Nguyen Cong Phuong",	"PhuongNc@vti.com.vn", 	"PassWord4"	,	"Manager"  , 7        ,2, 'JAVA' ,null),
                    ( "Nguyen Tien Linh",	"LinhNT@vti.com.vn", 	"PassWord5"	,	"Manager"  , 4        ,3, 'C#', null),
                    ( "Doan VAn Hau",		"HauDV@vti.com.vn"	, 	"PassWord6"	,	"Employee" , 0        , 1, 'SQL',"dev"),
                    ( "Nguyen Quang Hai",	"HaiNq@vti.com.vn"	, 	"PassWord7"	,	"Employee" , 0        , 1, 'SQL',"java"),
					( "Nguyen Trong Long",	"NguyenTl@vti.com.vn", 	"1234567",		"Employee" , 0        , 1, 'SQL',"React"),
					( "Doan Nguyen Duc"	,	"DucDn@vti.com.vn"	, 	"123456",		"Employee" , 0        , 2, 'JAVA', "php"),
					( "Nguyen Quang Hien",	"HienNq@vti.com.vn"	, 	"123456",		"Employee" , 0        , 3,  'C#', "sql"),
					( "Hoang A Ma",			"maha@vti.com.vn"	, 	"123456",		"Employee" , 0        , 3, 'C#', "python"),
					( "Hoang anh",			"hoanganh@vti.com.vn",	 "123456",		"Employee" , 0        , 4, 'C++', "javascript"),
					( "Hoang Bao",			"HoangBao@vti.com.vn", "123456"	,	"Employee" , 0        , 4, 'C++', "C#");




