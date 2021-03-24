-- Question1
CREATE VIEW thongke AS 
SELECT t1.DepartmentID, t1.DepartmentName, t2.Fullname
FROM 	`Account` t2
LEFT JOIN 	Department t1	ON t1.DepartmentID = t2.DepartmentID
WHERE DepartmentName = 'Sale';

SELECT DepartmentName, FullName FROM thongke;



-- Question3
DROP VIEW IF EXISTS thongke;
CREATE VIEW thongke AS 
SELECT QuestionID
FROM   question
WHERE character_length(Content) > 60;

DELETE FROM answer 
WHERE QuestionID = (SELECT QuestionID FROM thongke);

DELETE FROM examquestion 
WHERE QuestionID = (SELECT QuestionID FROM thongke);

DELETE FROM question
WHERE QuestionID = (SELECT QuestionID FROM thongke);

-- question4

CREATE VIEW thong_ke_nhan_vien AS
SELECT d.DepartmentName, COUNT(a.AccountID) AS number_of_accounts
FROM department d
INNER JOIN `account` a ON d.DepartmentID = a.DepartmentID 
GROUP BY a.DepartmentID
HAVING number_of_accounts = (SELECT MAX(number_of_accounts) FROM (SELECT COUNT(a.AccountID) AS number_of_accounts
							 FROM department d
							 INNER JOIN `account` a ON d.DepartmentID = a.DepartmentID 
							 GROUP BY a.DepartmentID) AS temp); 
			
-- question2
CREATE VIEW Account_Join_maxgroup AS
SELECT a.FullName, COUNT(ga.GroupID) AS number_of_groups
FROM  groupaccount ga
RIGHT JOIN `account` a ON ga.AccountID = a.AccountID
GROUP BY ga.AccountID
HAVING number_of_groups = (SELECT MAX(number_of_groups) FROM (SELECT COUNT(ga.GroupID) AS number_of_groups
															    FROM  groupaccount ga
															    RIGHT JOIN `account` a ON ga.AccountID = a.AccountID
															    GROUP BY ga.AccountID) AS Temp);
                                                                
-- question5

SELECT
q.QuestionID, q.Content, q.CategoryID, q.TypeID, 
a.FullName
FROM question q 
JOIN `account` a ON q.CreatorID = a.AccountID
WHERE a.FullName LIKE 'Nguyen%';

SELECT
q.QuestionID, q.Content, q.CategoryID, q.TypeID, 
a.FullName
FROM question q 
JOIN `account` a ON q.CreatorID = a.AccountID
WHERE LEFT(FullName, 6) = 'Nguyen';
                                                            







 

