/**
 * Author:  TheSonett
 * Created: Mar 2, 2022
 */

-- mysql -h localhost -u root

/*---------------------------------------------------------------------------------*/

Create Database AirlineServer;
use AirlineServer;

/*---------------------------------------------------------------------------------*/

desc Admin_log;
desc User_details;
desc flight_details;

/*---------------------------------------------------------------------------------*/

/*---------------------------------------------------------------------------------*/

select * from Admin_log;
select * from User_details;
select * from flight_details;

/*---------------------------------------------------------------------------------*/

create Table Admin_log(admin_name VARCHAR(10) Primary Key, admin_pass VARCHAR(10));
Insert into Admin_log(admin_name , admin_pass)VALUES('admin','admin');
Insert into Admin_log(admin_name , admin_pass)VALUES('Tanmoy','admin');
Insert into Admin_log(admin_name , admin_pass)VALUES('Joy','admin');

/*---------------------------------------------------------------------------------*/

create table flight_details(flight_id VARCHAR(14) Primary Key, flight_no VARCHAR(14), flight_name VARCHAR(20), from_city VARCHAR(30), to_city VARCHAR(30), date_of_flight VARCHAR(10),flight_arrival_time VARCHAR(20), flight_reach_time VARCHAR(20), duration VARCHAR(20), first_class_seat INT(5), first_class_seat_booked INT(5), first_class_seat_aval INT(5),buss_class_seat INT(5), buss_class_seat_booked INT(5), buss_class_seat_aval INT(5), eco_class_seat INT(5), eco_class_seat_booked INT(5), eco_class_seat_aval INT(5),first_class_price INT(10), buss_class_price INT(10), eco_class_price INT(10))ENGINE=INNODB;
insert into flight_details values('ab12c','12345','demo_flight','Kolkata','Mumbai','01/01/2023','9:30 AM','12:30 PM','03:00 hrs',30,10,20,50,29,21,120,100,20,4500,3500,2500);
insert into flight_details values('ab32c','13345','demo_flight1','Kolkata','Chennai','02/02/2023','9:30 AM','12:30 PM','03:00 hrs',30,10,20,50,29,21,120,100,20,5500,4500,3500);
insert into flight_details values('ab52c','14345','demo_flight3','Kolkata','Mumbai','01/01/2023','9:30 AM','12:30 PM','03:00 hrs',30,10,20,50,29,21,120,100,20,4500,3500,2500);
insert into flight_details values('ab42c','15345','demo_flight2','Mumbai','Chennai','02/02/2023','9:30 AM','12:30 PM','03:00 hrs',30,10,20,50,29,21,120,100,20,18500,14500,9500);


/*---------------------------------------------------------------------------------*/

create table user_details(fullname VARCHAR(20), username VARCHAR(20) Primary Key, password VARCHAR(20), mobileno VARCHAR(15), address VARCHAR(40), city VARCHAR(30), state VARCHAR(30), 
pincode INT(10))ENGINE=INNODB;

Insert into user_details VALUES('abc1 xyz1','user1','pass1','+91 8240570345','address of abc1 xyz1','Kolkata','West Bengal',700059);
Insert into user_details VALUES('abc2 xyz2','user2','pass2','+91 8264570345','address of abc2 xyz2','Ranchi','Jharkhand',700159);
Insert into user_details VALUES('abc3 xyz3','user3','pass3','+91 8264440565','address of abc3 xyz3','Pune','Maharashtra',700139);
/*---------------------------------------------------------------------------------*/