
# 테이블 : 표( 행과 열로 이루어진 집합 )
# 속성/필드 : 세로단위 제목
# 레코드/튜플 : 가로단위 자료

# 1. 데이터베이스 생성
drop database if exists mydb0102;	# -- 데이터베이스 삭제
create database mydb0102;			# -- 데이터베이스 생성
use mydb0102;						# -- 데이터베이스 활성화
# 2. 테이블 생성
create table table1(
	mno int auto_increment  , 
    mname varchar(30) not null unique , 
    mcount int ,
    constraint primary key( mno )
);
# DML : 데이터베이스 조작어
# 1.insert	2.select  3.update  4.delete
#	  [C]	   [R]		 [U]	   [D]

# [1] insert : 레코드(행/튜플) 삽입
# insert into 테이블명( 속성명1 , 속성명2 ) values( 값1 , 값2 );
insert into table1( mname , mcount ) values( '박명수' , 10 );
insert into table1( mcount , mname ) values( 20 , '유재석' ); # mname 속성에 제약조건이 unique 이므로 중복 삽입 불가능하다.(1번만가능)
# insert into table1( mcount ) values( 30 ); # mname 속성에 제약조건이 not null 이므로 삽입시 초기값 대입 해야한다.
insert into table1( mno , mname , mcount ) values( 3 , '강호동' , 30 ); # mno속성의 초기값 생략하면 auto_increment 이므로 자동번호가 부여된다.
insert into table1 values ( 4 , '신동엽' , 40 ); # 테이블의 모든 속성들을 순서대로 초기값 대입할 경우 속성명은 생략해도 된다.
# insert 에 여러개 레코드 삽입하기.
insert into table1 values ( 5 , '서장훈' , 50 ) , ( 6 , '하하' , 60 );

# [2] select : 레코드(행/튜플) 조회
# 1. 전체 속성 의 레코드 조회 : select * from 테이블명;		, *[와일드카드] 모든 속성명 뜻
select * from table1;
# 2. 특정 속성 의 레코드 조회 : select 속성명1 from 테이블명; 	, 속성명이 2개 이상 일때 ,(쉼표) 구분한다.
select mno from table1;
select mno , mname from table1;
select mno , mname , mcount from table1;
# 3. 레코드 조회 속성값 조건 , [조건절] where 조건;
select * from table1 where mname = '유재석';		# mname 속성이 '유재석'인 레코드 조회
select * from table1 where mno = 3;				# mno 속성이 3 인 레코드 조회
select * from table1 where mcount = 50;			# mcount 속성이 50 인 레코드 조회

# [3] update : 레코드의 속성 값 수정
# 1. 전체 레코드의 속성값 수정 : update 테이블명 set 속성명 = 새로운값;
update table1 set mcount = 0;	# 오류 해결 방안 : mysql workbench safe mode 끄기.
set SQL_SAFE_UPDATES = 0; # safe mode 끄기
set SQL_SAFE_UPDATES = 1; # safe mode 켜기

# 2. 특정 레코드의 속성값 수정 : update 테이블명 set 속성명 = 새로운값 where [조건절]
update table1 set mcount = 100 where mname = '유재석'; # mcount속성값이 '유재석' 인 레코드의 mcount속성값를 100으로 수정

# 3. 여러 속성값 수정		: update 테이블명 set 속성명 = 새로운값 , 속성명2 = 새로운값 where [조건절]
update table1 set mname = '강호동2' , mcount = 200 where mno = 3; # mno속성값이 3 인 레코드의 manme 과 mcount 값 수정한다.

# [4] delete : 레코드 삭제
# 1. 전체 레코드 삭제		: delete from 테이블명;
delete from table1;

# 2. 특정 레코드 삭제		: delete from 테이블명 where [조건절];
delete from table1 where mno = 3;
