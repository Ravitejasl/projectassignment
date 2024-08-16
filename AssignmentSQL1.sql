
use department;


create table department(
department_id int,
department_name varchar(20),
location varchar(100),
primary key(department_id)
);




create table employee(

emp_id int,
emp_name varchar(20),
date_of_joining DATE,
emp_salary varchar(20),
commission Decimal(10,2),
percentage Decimal(5,2),
manager_id INT,
department_id INT,
foreign key (manager_id) references employee(emp_id),
foreign key (department_id) references department(department_id),
primary key(emp_id)
);

insert into department(department_id,department_name,location) values(1,'HR','New York');


insert into employee (emp_id,emp_name,date_of_joining, emp_salary,commission,percentage,manager_id,department_id)
values(1,'priya','2024-04-10',6000,5000,10,NULL,1);
update employee set manager_id=1 where emp_id=1;
 select * from department;
 select * from employee;


