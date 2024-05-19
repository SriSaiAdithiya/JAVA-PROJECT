Use JavaProject;
drop table Toll;
create table Bank
(
Bank_Name VARCHAR(25) NOT NULL,
Acc_No VARCHAR(16) PRIMARY KEY,
Closing_Bal DOUBLE
);

INSERT INTO BANK(Bank_Name,Acc_No,Closing_Bal)VALUES 
('hdfc','5578120934342178',80430);
INSERT INTO BANK(Bank_Name,Acc_No,Closing_Bal)VALUES 
('hdfc','8745616198269010',120000);
INSERT INTO BANK(Bank_Name,Acc_No,Closing_Bal)VALUES 
('sbi','6800901231673300',150000);
INSERT INTO BANK(Bank_Name,Acc_No,Closing_Bal)VALUES 
('sbi','4509780913674900',150000),
('hdfc','3328910267674343',400000);


CREATE TABLE CUSTOMER
(
CID  INT PRIMARY KEY AUTO_INCREMENT,
Aadhar_No VARCHAR(12),
Acc_No VARCHAR(16),FOREIGN KEY(Acc_No) REFERENCES Bank(Acc_No),
Email VARCHAR(320) UNIQUE,
Cust_Name VARCHAR(20),
Ph_no VARCHAR(10) UNIQUE,
Cust_Password VARCHAR(20)
);


INSERT INTO CUSTOMER (Acc_No,Aadhar_No,Email,Cust_Name,Ph_no,Cust_Password) VALUES
('5578120934342178','214365879876','Mahaa123@gamil.com','MahaaSri','6369406440','MahaaSri2004'),
('8745616198269010','987876565434','Dhivya@gamil.com','DhivyaDharshini','9342417328','Dhivya3113'),
('6800901231673300','675645341323','Priya05@gamil.com','PriyaDharshini','8148817750','PriyaD05'),
('4509780913674900','453467561092','Kavya567@gamil.com','Kavya','9089786712','Kavya005'),
('3328910267674343','786756450099','Nithish34@gamil.com','Nithish','8987215487','Nithish3404');



CREATE TABLE Contractor (
    Con_id INT PRIMARY KEY AUTO_INCREMENT,
	Aadhar VARCHAR(12) UNIQUE,
    Acc_No VARCHAR(16),
    FOREIGN KEY (Acc_No) REFERENCES Bank(Acc_No),
    email VARCHAR(320) UNIQUE,
    cname VARCHAR(25) NOT NULL,
    ph_no VARCHAR(10) NOT NULL UNIQUE,
    Con_Password VARCHAR(20));
ALTER TABLE Contractor AUTO_INCREMENT=121;
INSERT INTO BANK(Bank_Name,Acc_No,Closing_Bal)VALUES 
('SBI','9889677656653113',80430),
('Kotak','1122113311445533',80430),
('HDFC','9812334875673491',80430),
('IOB','0998531423198764',80430),
('BOI','9976564321789908',80430);
INSERT INTO Contractor (Acc_No,Aadhar,Email,cname,Ph_no,Con_Password) VALUES
('9889677656653113','124351716235','Shikardwn@gamil.com','ShikarDhawan','6940644063','ShikDwn'),
('1122113311445533','987887652431','Rahukl1@gamil.com','RahulKL','4241732893','WCoo1'),
('9812334875673491','198732134652','Megaa32@gamil.com','MegnaShri','4881775081','Meghere'),
('0998531423198764','198256315432','Rutu31@gamil.com','Ruturaj','8978671290','Ruturajcap'),
('9976564321789908','171617151712','SureshR03@gamil.com','Suresh Raina','7215487898','Raina003');

CREATE TABLE TAG
(
Tag_Id INT PRIMARY KEY AUTO_INCREMENT,
Wallet_Bal DOUBLE,
Security_Deposit INT DEFAULT 100
); 
INSERT INTO TAG(Wallet_Bal) VALUES
(30000),(40000),(5000),(6000);

CREATE TABLE VEHICLE
(
CID  INT,FOREIGN KEY (CID) REFERENCES customer(CID), 
 Veh_No VARCHAR(10) PRIMARY KEY,
    Veh_Type VARCHAR(10),
    Tag_Id INT,FOREIGN KEY(Tag_Id) REFERENCES TAG(Tag_Id)

);

insert into VEHICLE (CID,Veh_No,Veh_Type,Tag_Id)values 
(1,'TN37DS8273','lmv',211),
(2,'TN37DJ7777','hcm',212),
(3,'TN37CD5369','2axle',213),
(4,'TN66AB6756','lmv',214),
(5,'TN37NJ9876','hcm',215),
(6,'TN38IJ1254','2axle',216),
(7,'TN66L5334','hcm',217),
(8,'TN99L4466','hcm',218);


create table toll 
(
	Toll_No INT PRIMARY KEY
    -- Veh_Type VARCHAR(10),
    -- Fair_Amt INT

);

INSERT INTO TOLL(Toll_No) VALUES 
(121),(122),(123),(124),(125),(221),(222),(223),(321),(322),(323),(324),(325),(421),(422),(521),(522),(523),(524);

SELECT * from toll;
CREATE INDEX idx_Veh_Type ON VEHICLE(Veh_Type);

-- toll look up table
create table Toll_Fair
(
	Toll_No INT,FOREIGN KEY(Toll_No) REFERENCES TOLL(Toll_No),
    Veh_Type  VARCHAR(10),FOREIGN KEY(Veh_Type) REFERENCES VEHICLE(Veh_Type),
    Fair_Amt INT NOT NULL

);

create table Route
(
	RID INT,
    Src VARCHAR(20),
    Dest VARCHAR(20)
);
INSERT INTO ROUTE (RID,Src,Dest) VALUES 
(001,'Coimbatore','Chennai'),
(002,'Coimbatore','Pondicherry'),
(003,'Chennai','pondicherry'),
(004,'Chennai','Coimbatore'),
(005,'Pondicherry','Coimbatore'),
(006,'Pondicherry','Chennai');
SELECT * FROM ROUTE;
 -- create table TOLL_CONTRACTOR 

