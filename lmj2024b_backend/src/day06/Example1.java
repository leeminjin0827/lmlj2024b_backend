package day06;

import java.util.Scanner;

/*
	자바과제 3 : (식당) 대기번호 발행 프로그램
	-  문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문)
	-  전화번호 , 인원수 를 입력받아서 저장.출력 구현
	-  총 대기명단은 3개 까지 가능하다. 대기명단 1개당 전화번호.인원수 저장소(변수) 2개 필요 , 대기명단3 --> 변수 6개 필요.
*/
public class Example1 {
	public static void main(String[] args) {

		String 전화번호1 = null; String 인원수1 = null;
		String 전화번호2 = null; String 인원수2 = null;
		String 전화번호3 = null; String 인원수3 = null;
		while(true) {
			System.out.println(" ===== 대기번호 프로그램 ===== ");
			System.out.println("1.등록 2.출력");
			Scanner scan = new Scanner ( System.in );
			int 메뉴 = scan.nextInt();
			if( 메뉴 == 1 ) { System.out.println(">> 1. 등록 선택했습니다.");
				System.out.println("> 전화번호 : "); String wjsghk = scan.next();
				System.out.println("> 인원수 : "); String dlsdnjs = scan.next();
				if( 전화번호1 == null ) { 전화번호1 = wjsghk; 인원수1 = dlsdnjs; }
				else if( 전화번호2 == null ) { 전화번호2 = wjsghk; 인원수2 = dlsdnjs; }
				else if( 전화번호3 == null ) { 전화번호3 = wjsghk; 인원수3 = dlsdnjs; }
				else { System.out.println("** 등록 실패 : 대기번호가 더이상 발행불가합니다 **"); }
			} // i end
			else if( 메뉴 == 2 ){ System.out.println(">> 2. 출력 선택했습니다.");
				if( 전화번호1 != null ) { System.out.println("> 전화번호 : " + 전화번호1 + " 인원수 : " + 인원수1 ); };
				if( 전화번호2 != null ) { System.out.println("> 전화번호 : " + 전화번호2 + " 인원수 : " + 인원수2 ); };
				if( 전화번호3 != null ) { System.out.println("> 전화번호 : " + 전화번호3 + " 인원수 : " + 인원수3 ); };
			} // i end
		} // w end
	} // m end
} // c end
