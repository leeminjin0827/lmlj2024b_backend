package day07;

import java.util.Scanner;

/*
자바 과제5 : (식당) 대기번호 발행 프로그램
- 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) , 클래스(멤버변수)/객체
- 전화번호 , 인원수 를 입력받아서 저장·출력 구현
- 명단 클래스 설계한다.
- 총 대기명단은 3개 까지 가능하다. 
제출 : 카카오톡방에 과제 코드가 존재하는 본인 git 상세주소 제출 
*/
public class Example1 {
	public static void main(String[] args) {
		Audeks audeks1 = new Audeks(); Audeks audeks2 = new Audeks();
		Audeks audeks3 = new Audeks();
		while(true) {
			System.out.println("== 대기번호발행 ==");
			System.out.println("1.등록 2.발행");
			Scanner scan = new Scanner ( System.in );
			int 메뉴 = scan.nextInt();
			if( 메뉴 == 1 ) { System.out.println(">> 1. 등록 ");
				System.out.println("> 전화번호 : ");
				String 전화번호 = scan.next();
				System.out.println("> 인원수 : ");
				String 인원수 = scan.next();
				if( audeks1.전화번호 == null ) {
					audeks1.전화번호 = 전화번호; audeks1.인원수 = 인원수;
				}else if( audeks2.전화번호 == null ) {
					audeks2.전화번호 = 전화번호; audeks2.인원수 = 인원수;
				}else if( audeks3.전화번호 == null ) {
					audeks3.전화번호 = 전화번호; audeks3.인원수 = 인원수;
				}
			} // i end
			else if( 메뉴 == 2 ) { System.out.println(">> 2. 발행");
				if( audeks1.전화번호 != null ) {
					System.out.println("전화번호 : "+audeks1.전화번호+ " / 인원수 : "+audeks1.인원수);
				}
				if( audeks2.전화번호 != null ) {
					System.out.println("전화번호 : "+audeks2.전화번호+ " / 인원수 : "+audeks2.인원수);
				}
				if( audeks3.전화번호 != null ) {
					System.out.println("전화번호 : "+audeks3.전화번호+ " / 인원수 : "+audeks3.인원수);
				}
			} // e i end
		} // w end
	} // m end
} // c end
