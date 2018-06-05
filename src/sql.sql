DROP TABLE IF EXISTS 12825612Address;
DROP TABLE IF EXISTS 12825612Advertisement;
DROP TABLE IF EXISTS 12825612User;

CREATE TABLE 12825612Address (ID int(10) NOT NULL AUTO_INCREMENT, State varchar(255), Suburb varchar(255), Street varchar(255), Postcode varchar(255), PRIMARY KEY (ID));
CREATE TABLE 12825612Advertisement (ID int(10) NOT NULL AUTO_INCREMENT, Address varchar(255), Price varchar(255), PropertyType varchar(255), Bedrooms varchar(255), Bathrooms varchar(255), ParkingSpaces varchar(255), Description varchar(255), ContractName varchar(255), PhoneNumber varchar(255), PRIMARY KEY (ID));
CREATE TABLE 12825612User (ID int(10) NOT NULL AUTO_INCREMENT, Username varchar(255), Password varchar(255), Gender varchar(255), Email varchar(255), Discriminator varchar(255) NOT NULL, PRIMARY KEY (ID));