create table city (
  ID int not null,
  Name VARCHAR(35) not null,
  CountryCode VARCHAR(3) not null,
  District VARCHAR(20) not null ,
  Population int not null,
  constraint pk_city primary key (ID)
);

create table country (
  Code char(3) NOT NULL ,
  Name char(52) NOT NULL,
  Continent varchar(20) NOT NULL ,
  Region char(26) NOT NULL ,
  SurfaceArea float NOT NULL,
  IndepYear smallint ,
  Population int NOT NULL ,
  LifeExpectancy float ,
  GNP float ,
  GNPOld float ,
  LocalName char(45) NOT NULL,
  GovernmentForm char(45) NOT NULL,
  HeadOfState char(60) ,
  Capital int ,
  Code2 char(2) NOT NULL,
  constraint pk_country primary key (Code)
);

CREATE TABLE countrylanguage (
  CountryCode char(3) NOT NULL,
  Language char(30) NOT NULL,
  IsOfficial CHAR(1) NOT NULL,
  Percentage float NOT NULL,
  constraint pk_countrylanguage PRIMARY KEY (CountryCode,Language)
) ;

