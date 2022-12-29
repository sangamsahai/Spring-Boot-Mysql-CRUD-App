# Spring-Boot-Mysql-CRUD-App

This is an Spring Boot CRUD application. This uses MySQL database for persistence.
In this app, we demonstrate the following - 
1) How a basic Spring Boot app works
2) How the logical divion of a CRUD app looks like(Controller, Model, Repository etc)
3) How JPA is used to automatically create the code for CRUD operations
4) How we make Spring talk to DB layer

Things to note while running this app - 
1) Set the correct DB username and password in application.properties
2) This app assumes that a MySQL server instance is running on localhost
3) Run the below DDL in MySQL server before using the application

```
 create database store_database;
 
 use store_database;
 
 create table if not exists product_inventory
 (id bigint not null primary key auto_increment,
 product_name varchar(32) not null,
 color varchar(11),
 price int
 );
 ```
 
 <!-- https://www.youtube.com/watch?v=KLB7h1fbNGg -->
 
 You can use Postman to test the REST API(s).
 For example, to view all Products, use the endpoint - http://localhost:8080/producs
 Refer to the below screenshot from Postman - 
 
 
 

<img width="906" alt="Screen Shot 2022-12-28 at 6 35 36 PM" src="https://user-images.githubusercontent.com/10198686/209889008-bbd922c1-dfb8-4d84-ab8e-bdb4b2f3c551.png">
