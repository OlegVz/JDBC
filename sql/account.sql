use hybrisDB;

create table account(accno int,lastname varchar(25),firstname varchar(25),bal int);

select * from account;

insert into account values(1, 'Vozniuk', 'Oleg', 1000);
update account set bal = 5000 where accno = 1;