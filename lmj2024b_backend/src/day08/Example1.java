package day08;

import java.util.Scanner;

/*
	자바 과제7 : (식당) 대기번호 발행 프로그램
	- 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) , 클래스(멤버변수)/객체
	- 전화번호 , 인원수 를 입력받아서 저장·출력 구현
	- 명단 클래스 설계한다.
	- 총 대기명단은 100개 까지 가능하다. 
	제출 : 카카오톡방에 과제 코드가 존재하는 본인 git 상세주소 제출 
*/
public class Example1 {
	public static void main(String[] args) {
		User[] userArray = new User[100]; 
		while(true) {
			System.out.println("-- 대기번호 발행 --");
			System.out.println("1. 주문등록 2. 발행");
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			if( choose == 1 ) { System.out.println("1. 주문등록");
				System.out.println(" > 전화번호"); String sum = scan.next();
				System.out.println(" > 인원수"); int num = scan.nextInt();
				User user = new User();
				user.sum = sum;
				user.num = num;
				boolean saveState = false;
				for( int index = 0; index <= userArray.length - 1 ; index++ ) {
					if( userArray[index] == null ) {
						userArray[index] = user;
						saveState = true;
						break;
					} // i end
				} // f end
				if( saveState == true ) { System.out.println("> 주문등록 성공"); }
				else { System.out.println("> 주문등록 실패"); }
			}else if( choose == 2 ) { System.out.println("2. 발행");
				for( int index = 0 ; index <= userArray.length - 1 ; index++ ) {
					if( userArray[index] != null ) {
						User user = userArray[index];
						System.out.printf("순번 : %d , 전화번호 : %s , 인원수 : %s \n",
								index , user.sum , user.num);
					}
				}
			}
		} // w end
	} // m end
} // c end
