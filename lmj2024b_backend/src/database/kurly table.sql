# [1] DB 생성
create database kurly;
# [2] DB 사용 활성화
use kurly;
# [3] 주문 테이블 
create table ordert(
	ono		int auto_increment	, # 주문 번호
    odate	datetime not null default now() , # # 주문 날짜
    arrival	datetime not null , # 배송 예상 날짜
    today	bool not null default false  # 당일 배송 논리
);
