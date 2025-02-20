USE CONSTRAINTS;

SELECT * FROM STUDENT;
SELECT * FROM VOTE;

SET SQL_SAFE_UPDATES=0;
DELETE FROM STUDENT;
DELETE FROM VOTE;

DESCRIBE STUDENT;
DESCRIBE VOTE;

DELIMITER //
CREATE TRIGGER STUDENT_ELIGIBLE_VOTE_TRIGGER
BEFORE INSERT ON STUDENT FOR EACH ROW
BEGIN
	IF (NEW.AGE>=18) THEN
		INSERT INTO VOTE( VOTER_ID,VOTER_NAME,AGE) VALUES(NEW.REGNO,NEW.STUDENT_NAME,NEW.AGE);
	END IF;
END;
//

INSERT INTO STUDENT(REGNO,STUDENT_NAME,AGE,GENDER,DEPT)VALUES(1000,'TAMILSELVAN',20,'MALE','IT');
INSERT INTO STUDENT(REGNO,STUDENT_NAME,AGE,GENDER,DEPT)VALUES(1001,'GAYATHRI',18,'FEMALE','CSE');
INSERT INTO STUDENT(REGNO,STUDENT_NAME,AGE,GENDER,DEPT)VALUES(1002,'MONIKA',16,'FEMALE','ECE');


