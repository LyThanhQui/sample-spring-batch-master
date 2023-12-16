
## Spring Batch Program Introduced

Let's assume the problem is that we have an electronics store, every day orders are recorded and logged in CSV format by the store staff.

However, the system does not have the function to import these CSV data into the database. A batch needs to be run every day at the end of the day to do this job.


## Input 
csv with orders data

## Ouput
Inserted database record

## Start database
$ docker-compose up -d

## Start project
$ ./mvnw spring-boot:run

## Access from host
$ mysql -u demo -P 33061 -p

## Create table
CREATE TABLE orders (
id INT AUTO_INCREMENT PRIMARY KEY,
customer_id INT(12) NOT NULL,
item_id INT(12) NOT NULL,
item_name VARCHAR(50),
item_price INT(12) NOT NULL,
purchase_date DATETIME
);

## Check database
$ mysql -h 0.0.0.0 -u demo -P 33061 -p demo

$ mysql> select * from orders;


