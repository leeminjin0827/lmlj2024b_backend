package day04;

public class Example2 {

	public static void main(String[] args) {
		
		// while 문 p.107
		/*
		 	while( 조건식 ){
		 		실행문
		 	}
		 	- 조건식이 truel이면 {} 안에 있는 실행문 실행한다.
		 */
		
		// [1] while문 활용하여 1부터 10까지 더하기
		int num = 1; // 1.초기값
		int sum = 0; // =0 없으면 Unresolved compilation problem: 발생
			// int sum; 변수가 참조 또는 가지고 있는 값이 없다. 쓰레기값,임의값
			// 쓰레기값(임의값/초기값없는상태) vs 0 vs null vs '' vs ""
			// * 변수에 0를 대입하지 않으면 초기값이 없으므로 임의값(쓰레기값)은 연산을 할 수 없다.
		while(num <= 10) { // 만약에 num이 10 이하이면 반복처리 2. 조건문
			sum += num;		// sum = sum + num;
			num++;			// num = num + 1	// num 1증가 3. 증감식
		}
		System.out.println("1부터 10까지의 합은 : " + sum + "입니다.");
		
		// - for문 처리
		int sum2 = 0;
		for( int num2 = 1 ; num2 <= 10 ; num2++ ) {
			// 1. 초기값	  ;  2. 조건문   ; 3. 증감식
			sum2 += num2;
		}
		System.out.println("1부터 10까지의 합은 : " + sum2 + "입니다.");
		
		// 1분복습 : 1. while 2.num++;
		
		// [2] while문이 무한히 반복되는 경우 , 조건식에 상수 true
//		while(true) {
//			System.out.println("[while]쇼핑몰 24시간 실행중!!!");
//		}
		
		// - for문 표현
//		for( ; ;) {
//			System.out.println("[for]쇼핑몰 24시간 실행중!!!");
//		}
		
		// [3] do ~ while 문 , 1~10까지 더하는 프로그램
		int num3 = 1;
		int sum3 = 0;
		do { // 먼저 실행후					   , 선 처리
			sum3 += num3;
			num3++;
		}while( num3 <= 10); // 실행후 조건검사 , 후 조건 검사
		
		System.out.println("1부터 10까지의 합 : "+sum3);
		
		// [4] 구구단중에서 2단 만 출력하시오. while 과 do~while문으로 구현하기.
		// 1. while 문
		int num4 = 1;			// 1. 초기값
		while( num4 <= 9 ) {	// 2. 조건식
			System.out.printf(" 2 X %d = %d \n" , num4 , (2*num4) );
			num4++;				// 3. 증감식
		}
		
		// 2. do~while 문
		int num5 = 1;			// 1. 초기값		// 선 실행
		do {
			System.out.printf(" 2 X %d = %d \n" , num5 , (2*num5));
			num5++;				// 2. 증감식
		}while( num5 <= 9 );	// 3. 조건식		// 후 조건검사
		
		// 3. for문
		for( int num6 = 1 ; num6 <= 9 ; num6++ ) { // 1.초기값 ; 2.조건식 ; 3.증감식
			System.out.printf(" 2 X %d = %d \n" , num6 , (2*num6));
		}
	}
}










