select * from NA_USER_AUTH
select * from USER_INFO
select * from USER_ADDRESS
--alter table USER_ADDRESS drop column USER_CODE


--truncate table NA_USER_AUTH
--delete USER_INFO where USER_CODE=1234567
--delete USER_ADDRESS where USER_CODE=1234567

--drop table NA_USER_AUTH
--drop table USER_INFO
--drop table USER_ADDRESS

--alter table USER_ADDRESS add USER_CODE DECIMAL not null primary key(USER_CODE) 
--alter table USER_INFO add foreign key(USER_CODE) references USER_ADDRESS(USER_CODE)
--alter table NA_USER_AUTH add USER_CODE decimal
--drop table USER_INFO
--create table USER_INFO (USER_CODE DECIMAL PRIMARY KEY,USER_NAME VARCHAR ,USER_YYPE VARCHAR,foreign key(USER_CODE) references USER_ADDRESS(USER_CODE))

--CREATE TABLE USER_ADDRESS(USER_CODE DECIMAL,STREET VARCHAR(35),CITY VARCHAR(20),STATE VARCHAR(15),MOBIE DECIMAL(10))  

