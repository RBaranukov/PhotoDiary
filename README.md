# Photo_Diary
List of clients , who came to photoshooting of my bride

In this application I'm using Spring MVC with Hibernate and SQL(MySQL). It is a CRUD-application on a Tomcat server(local).

SQL table is creating by this script: 

create database photo_clients;
use photo_clients;

create table clients(
id int NOT NULL auto_increment,
name_surname varchar(40),
communication varchar(20),
phone_number varchar(15),
cost int default 0,
conditions varchar(50),
notes varchar(100),
advertising_source varchar(30),
primary key (id)
)


