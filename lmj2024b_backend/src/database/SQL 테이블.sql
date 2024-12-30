-- 한줄주석
# 한줄주석
/* 여러 주석 */
-- 실행 : 실행할 명령어에 커서를 두고 ctrl+enter
# [1] db server의 전체 데이터베이스 목록 조회
show databases;
# [2] db server의 local path 조회
show variables like 'datadir';
# [3] db server의 db 생성
create database mydb1230;
# [4] db server의 db 삭제
drop database mydb1230;
drop database if exists mydb1230;
# [5] db server의 사용할 db 활성화
use mydb1230;

create database my1230;
use my1230;
# [1] 테이블 생성한다. create table 테이블명( 필드명 타입 );
create table testtable1( 필드명 int );
# [2] 현재 활성화(사용) 중인 DB내 모든 테이블 조회
show tables;
# [3] 테이블 생성한다. create table 테이블명( 필드명 타입 , 필드명 타입 );
# 여러개 필드가 존재할 경우 , (쉴표) 구분한다.
create table testtable2( 필드명1 int , 필드명2 double );
# [4] 테이블 삭제한다. crop table 테이블명
drop table testtable1;
drop table if exists testtable2;
# [5] MYSQL 데이터 타입
# 다양한 데이터 타입 이용한 테이블 생성 실습
create table testtable3( # 테이블 생성 시작 # 주의할점 : DB 사용 활성화가 된 상태에서 가능 , use ~~ 실행 확인
	# 속성명 타입 , 속성명 타입
    정수필드1 tinyint		, 정수필드2 smallint		, 정수필드3 mediumint	, 정수필드4 int		, 정수필드5 bigint ,
    실수필드1 float		, 실수필드3 double			,
	날짜필드 date			, 시간필드 time			, 날짜시간 datetime 	,
    문자필드1 char(100)	, 문자필드2 varchar(100)	, 문자필드3 text		, 문자필드4 longtext	, 
    논리필드 bool			# 마지막 필드 뒤에는 ,(쉼표) 넣지 않는다.
); # 테이블 생성 끝
show tables; # 전체 테이블 목록 조회
# [6] 특정한 테이블 조회
select * from testtable3;

# 실습1 : boardservice9 의 DB 설계 하시오.
# 단계1 : DB서버의 DB 만들기
create database boardservice9;
# 단계2 : 지정한 DB의 테이블 만들기 위해서 DB 활설화
use boardservice9;
# 단계3 : 지정한 DB의 테이블 생성하기.
create table board(
	title varchar(100)		, # 임의로 제목은 최대 100글자로 설계			# 자바 : private String title;
    content longtext		, # 임의로 내용은 긴글과 사진도 넣기위해 설계		# 자바 : private String content;
    writer varchar(30)		  # 임의로 작성자는 최대 30글자로 설계			# 자바 : private String writer;
);
show tables;

# 실습2 : day09 패키지의 WaitingService 의 DB 설계 하시오. 전화번호 인원수
create database WaitingService;			# 단계1 : DB 서버의 DB 만들기
use WaitingService;						# 단계2 : DB 서버의 사용할 DB 활성화 하기
create table Waiting(					# 단계3 : 활성화 한 DB내 테이블을 적절한 타입으로 선언한다.
	phone char(13) , # 임의로 핸드폰번호는 13자리로 고정해서 사용 하려는 설계는 varchar 보다는 char이 좋다.
    peaple int		 # 임의로 인원수는 int 타입 설계
);
show tables;

# [7] 제약조건 : 테이블에서 문제/결함 되는 데이터가 입력되지 않도록 제약
use mydb1230;
create table testtable4(
	# 필드명 타입 제약조건
    필드명1 tinyint not null		,	-- 지정한 필드에는 null를 대입할 수 없다.
    필드명2 smallint unique		,	-- 지정한 필드에는 중복값을 대입할 수 없다.
    필드명3 int default 10		, 	-- 지정한 필드에는 레코드삽입시 값을 생략하면 자동으로 기본값이 대입된다.
    필드명4 bigint auto_increment	,	-- 지정한 필드에는 레코드삽입시 순서대로 자동번호가 대입된다.
    PK필드명5 double	,
    constraint primary key( PK필드명5 ) -- 지정한 필드를 PK필드로 설정 ( not null 과 unique 포함 )
);
create table testtable5(
	FK필드명1 double	,
    constraint foreign key( FK필드명1 ) references testtable4(PK필드명5)
    -- 지정한 필드를 FK필드로 설정 하고 참조할 PK필드가 위치한 테이블명과 PK필드명을 작성한다.
);
# 실습1 : boardservice7 에서 회원제 게시판 DB 설계하시오.
	# 회원테이블 , 게시판테이블 => 회원이 존재해야 게시물이 존재한다. 즉] 회원(PK) 게시물(FK)
create database boardservice7;
use boardservice7;
# 회원 테이블
create table member(
	mno int auto_increment ,
    -- 회원번호 는 자동번호 부여하기 위해 auto_increment 제약조건 선택.
    -- 회원번호 는 최대 20억 이상이 될 경우가 없을 것 같아서 int 타입 선택.
    mid varchar(30) not null unique	,
    -- 회원아이디 는 공백이라는 아이디가 존재하면 안되서 not null 제약조건 선택 ,
    -- 회원아이디 는 중복을 차단 해야 하므로 unique 제약조건 선택	,
    mpwd varchar(30) not null ,
    -- 회원비밀번호 는 공백을 차단하기 위해 not null 제약조건 선택 ,
    mname varchar(10) not null ,
    -- 회원명 은 공백을 차단하기 위해 not null 제약조건 선택 ,
    -- 회원명 은 최대 10글자까지 입력받기 위해 varchar(10) 으로 선택
    constraint primary key( mno ) -- 회원번호를 pk필드로 선정 , not null 과 unique 포함
);
# 게시판 테이블
create table board(
	bno bigint auto_increment ,
    -- 게시물번호 는 자동번호를 부여하기 위해 auto_increment 사용 ,
    -- 20억이상의 게시물벌호는 표현하기 위해 bigint 사용.
    btitle varchar(100) not null ,
    -- 게시물제목 은 공백을 없애기 위해 not null 사용
    -- 문자가 최대 100글자까지 가능하도록 설계
    bcontent text ,
    -- 게시물내용 은 공백을 허용
    -- 최대 4GB 까지 대용량 입력 가능하도록 사용
    bdate datetime default now() ,
    -- 게시물작성일 에는 default 기본값에 now() 함수를 사용하면 시스템 날짜/시간이 삽입된다.
    bview int default 0 ,
    -- 게시물조회수 에는 기본값을 0으로 한다.
    constraint primary key( bno ) ,
    -- 게시물번호 를 pk필드로 선정
    mno int , # FK필드 #회원번호FK
    -- 참조할 필드와 동일한 타입으로 선정
    constraint foreign key( mno ) references member( mno )
    -- board테이블의 mno필드가 member테이블의 mno 필드를 참조한다.
    
);






