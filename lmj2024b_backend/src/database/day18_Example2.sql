# 전체 실행 : ctrl + shift + enter
# 단위 실행 : 커서위치 + ctrl + enter

# [1] 데이터베이스 준비
drop database if exists mydb0103;
create database mydb0103;
use mydb0103;
# [2] 테이블 생성
create table user(
	uno int unsigned auto_increment ,
    uname varchar(30) not null ,
    uage int not null ,
    constraint primary key(uno)
);
select * from user;
update user set uname = '강호동' , uage = 50 where uno = 3;