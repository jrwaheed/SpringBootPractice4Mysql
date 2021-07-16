create table Customers (
	id int auto_increment primary key,
	last_name varchar(50),
	first_name varchar(50),
	balance double,
	mortgage_holder tinyint
);

insert into Customers (last_name, first_name, balance, mortgage_holder) values ('Coltrane','John', 10000, 0);
insert into Customers (last_name, first_name, balance, mortgage_holder) values ('Jacksom','Michael', 94543, 1);
insert into Customers (last_name, first_name, balance, mortgage_holder) values ('Davis','Miles', 10, 0);
insert into Customers (last_name, first_name, balance, mortgage_holder) values ('Holliday','Billie', 780000, 1);