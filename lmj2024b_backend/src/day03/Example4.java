package day03;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) { // main s
	/*		
	 *		
	 		// 자바 과제2 : 조건문을 이용한 9개 유형
	 		// 제출 방법 : 강의 카카오톡방에 풀이한 코드가 위치한 
	 		 * 
	 * 		[ 구현 문제 , FOR문 없이 풀이 ] 
				문제1 : 점수를 정수형으로 입력받아 점수가 90점 이상이면 '합격' 아니면 '불합격' 출력 하시오.

				문제2 : 점수를 정수형으로 입력받아 점수가 90점 이상이면 'A등급', 80점 이상이면 'B등급', 70점 이상이면 'C등급', 그외 '재시험' 으로 출력 하시오.

				문제3 : 각 3개의 정수형으로 수를 입력받아 가장 큰 수를 출력 하시오. [ 전제조건 : 각 정수는 서로 다른 정수값 ]

				문제4 : 각 3개의 정수형으로 수를 입력받아 오름차순 순서대로 출력하시오. [ 전제조건 : 각 정수는 서로 다른 정수값 ]

				문제5 : 가위바위보 게임 구현하기.
				      - 가위가 '0' 이고 바위가 '1' 이고 보가 '2' 일때 플레이어1와 플레이어2 가 있습니다.
				     - 승리자 판단과 무승부 경우의수를 출력하시오.
				      [입력 조건] 플레이어1 과 플레이어2 에게 각각 입력을 받습니다.
				     [출력 조건] 플레이어1 이기면 ' 플레이어1 승리 ', 플레이어2 이기면 ' 플레이어2 승리 ' 무승부 이면 '무승부' 출력 하시오.

				문제6 : 윤년/평년 판단하기
				   [ 입력조건 ] 하나의 연도를 입력 받습니다.
				   [ 윤년/평년 조건 ]
				   -연수가 4로 나누어 떨어지는 해는 윤년으로 한다.
				   -연수가 4, 100으로 나누어 떨어지는 해는 평년으로 한다.
				   -연수가 4, 100, 400으로 나누어 떨어지는 해는 윤년으로 둔다.
				   [ 출력조건] '입력한OOOO년 은' 윤년 입니다.  혹은 평년 입니다 로 출력하시오.

				문제7 : 주차 사용요금 계산하기
				   [ 선언 변수 조건 ] 입차시간이 9시30분 입니다. 
				   - int 시 = 9;  int 분 = 30; 이와 같이 변수를 먼저 선언해주세요.
				   [ 출차시간 입력 조건 ] 출차시간의 시 와 분을 각 입력받아 각 변수에 저장하시오. 
				   [ 처리출력 조건 ] 1분당 1000원으로 계산하여 사용요금' 0000원' 을 출력하시오,
				   - 단 입차 시간 이전 으로 입력 할 경우에는 '출차시간 오류' 출력하시오.

				문제8 : 로그인 처리
				   [입력 조건] 아이디[문자열] 와 비밀번호[문자열] 를 입력받기
				   [처리출력 조건]
				   1. 아이디가 'admin' 이고 비밀번호가 '1234' 모두 동일하면 '로그인성공'
				   2. 아이디가 다르면 '아이디 정보가 일치하지 않습니다.'
				   3. 아이디는 일치하고 비밀번호가 다르면 '비밀번호 정보가 일치하지 않습니다'
				   [ 참고 ]
				   1. 문자열 비교시에는 == 같다 연산자 대신에 .equals() 함수를 이용해주세요.
				   예] 
				      String name = scan.next();
				      name =="admin" 대신에 name.equals( "admin" ) 사용.

				문제9 : 당첨번호 개수  찾기
				   [ 선언 변수 조건 ] int 공1 = 14 ; int 공2 = 21 ; int 공3 = 9; 이와 같이 변수를 먼저 선언해주세요.
				   [ 입력 조건 ] 세개의 정수를 입력받아 각 변수에 저장하시오.
				   [ 출력 조건 ] 입력받은 세 정수 중에서 공1~공3 까지 동일한 번호 가 몇개 인지 출력하시오.
	 */
	// 1 
		Scanner scan = new Scanner(System.in);
//		System.out.println("[1] 점수를 입력하세요.");
//		int score1 = scan.nextInt();
//		if( score1 >= 90 ) {
//			System.out.println("[1] 합격");
//		}else {
//			System.out.println("[1] 불합격");
//		}
		
	// 2
//		System.out.println("[2] 점수를 입력하세요.");
//		int score2 = scan.nextInt();
//		if( score2 >= 90 ) {
//			System.out.println("[2]A등급");
//		}else if( score2 >= 80 ) {
//			System.out.println("[2]B등급");
//		}else if( score2 >= 70 ) {
//			System.out.println("[2]C등급");
//		}else { System.out.println("[2]재시험");}
		
	// 3
		
//		System.out.println("[3] 정수 1 입력 : ");
//		int str1 = scan.nextInt();
//		System.out.println("[3] 정수 2 입력 : ");
//		int str2 = scan.nextInt();
//		System.out.println("[3] 정수 3 입력 : ");
//		int str3 = scan.nextInt();
//		
//		int best = str1;
//		if( best < str2 ) {
//			best = str2;
//		}
//		if( best < str3 ) {
//			best = str3;
//		}
//		System.out.println("제일큰수 "+best);
	
	// 4
//		System.out.println("[4] 정수 1 입력 : ");
//		int str4 = scan.nextInt();
//		System.out.println("[4] 정수 2 입력 : ");
//		int str5 = scan.nextInt();
//		System.out.println("[4] 정수 3 입력 : ");
//		int str6 = scan.nextInt();
//		int non = 0;
//		if( str4 < str6 ) { non = str4; str4 = str6; str6 = non; }
//		if( str5 < str6 ) { non = str5; str5 = str6; str6 = non; }
//		System.out.println("[4] 결과 : "+str4+str5+str6);
		
	// 5
//		System.out.println("[5] 플레이어 1 입력 : ");
//		int str7 = scan.nextInt();
//		System.out.println("[5] 플레이어 2 입력 : ");
//		int str8 = scan.nextInt();
//		if( str7 > str8 ) {
//			System.out.println("플레이어1 승리"); 
//			}else if( str7 < str8 ) {
//			System.out.println("플레이어2 승리");
//		}else {
//			System.out.println("무승부");
//		}
		
	// 6
		System.out.println("[6] 하나의 연도를 입력하세요.");
		int xtr1 = scan.nextInt();
		if ( xtr1 %4 == 0 ) {
			System.out.println("[6] 입력한 "+xtr1+"년 은 윤년입니다.");
		}else if ( xtr1 %4 == 0 && xtr1 %100 == 0) {
			System.out.println("[6] 입력한 "+xtr1+"년 은 평년입니다.");
		}else if ( xtr1 %4 == 0 && xtr1 %100 == 0 && xtr1 %400 == 0 ) {
			System.out.println("[6] 입력한 "+xtr1+"년 은 윤년입니다.");
		}else { System.out.println("[6] 입력한 "+xtr1+"년 은 평년입니다.");}
		
	// 7 입차시간 9시 30분
		int 시 = 9;
		int 분 = 30;
		System.out.println("[7] 출차시간의 시를 입력하세요.");
		int xtr2 = scan.nextInt();
		System.out.println("[7] 출차시간의 분을 입력하세요.");
		int xtr3 = scan.nextInt();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}