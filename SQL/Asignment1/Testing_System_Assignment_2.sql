-- question1
SELECT * FROM Department;

-- question2
SELECT DepartmentID FROM Department
WHERE DepartmentName = N'Sale'; 

-- question3
SELECT * FROM  `Account` 
WHERE 		LENGTH(Fullname) = (SELECT MAX(LENGTH(Fullname)) FROM `Account`);

-- question4
SELECT 		GroupName FROM 	`Group` 
WHERE 		CreateDate < '2019-12-20';

-- question5
SELECT QuestionID FROM Answer
GROUP BY QuestionID
HAVING 	COUNT(QuestionID) >= 4;

-- question6
SELECT 	* FROM 	`Group`
ORDER BY CreateDate DESC 
LIMIT 5;

-- question8
DELETE FROM Exam 
WHERE CreateDate < '2019-12-20';

-- question9
UPDATE 	`Account` SET Fullname 	= N'Nguyễn Bá Lộc', Email  = 'loc.nguyenba@vti.com.vn'
WHERE 		AccountID = 5;

-- question10
SELECT t1.AccountID, t1.FullName, t2.DepartmentName
FROM 	`Account` t1
JOIN 		Department t2	ON t1.DepartmentID = t2.DepartmentID;

-- question11
SELECT t1.PositionName, t2.Fullname
FROM 	Position t1
JOIN 		`Account` t2	ON t1.PositionID = t2.PositionID
WHERE PositionName = 'Dev';

-- question12
SELECT DepartmentID, COUNT(AccountID)
FROM `Account`
GROUP BY DepartmentID
HAVING  COUNT(AccountID)>3;

-- question13
SELECT QuestionID, COUNT(ExamID)
FROM Examquestion
GROUP BY QuestionID
HAVING COUNT(ExamID);

-- question14
SELECT CategoryID, COUNT(QuestionID)
FROM Question
GROUP BY CategoryID
HAVING COUNT(QuestionID);


-- question15
SELECT QuestionID, COUNT(AnswerID)
FROM Answer
GROUP BY QuestionID
HAVING COUNT(AnswerID); 

-- question19
SELECT TypeID, COUNT(QuestionID)
FROM Question
GROUP BY TypeID
HAVING COUNT(QuestionID);

-- question18

                
             
            

















