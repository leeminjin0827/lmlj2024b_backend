package day03;

public class Example3 {

	public static void main(String[] args) {
		// p.92 조건문
		
		// [1] if문
		int age = 10;
			// - 만약에 age(나이)값이 8 이상이면 출력함수 실행한다.
		if( age >= 8 ) { // if s
			System.out.println("학교에 다닙니다.");
		} // if e
		
		// [2] if ~ else문
			// - 만약에 age(나이)값이 8 이상이면 출력함수 실행한다.
		if( age >=8 ) { // if s
			System.out.println("학교에 다닙니다.");
		}else { // 아니면( 위 조건의 반대 - age(나이)값이 8 이상이 아니다 , 7이하뜻 )
			System.out.println("학교에 다니지 않습니다.");
		} // if e
		
			// * p95 1분복습
		char gender = 'F';
		if( gender == 'F' ) { // if s
			System.out.println("여성입니다.");
		}else {
			System.out.println("남성입니다.");
		} // if e
		
		// [3] if ~ elseif문
		// int age = 10; // 위에서 선언했으므로 생략
		int charge;
		if( age < 8 ) { // 만약에 age(나이)값이 8미만이면
			charge = 1000;
			System.out.println("취학 전 아동입니다.");
		}else if( age < 14 ) { // 만약에 age(나이)값이 8초과 이면서 14미만 이면
			charge = 2000;
			System.out.println("초등학생입니다.");
		}else if( age < 20 ) { // 만약에 age(나이)값이 14초과 이면서 20미만 이면
			charge = 2500;
			System.out.println("중, 고등학생 입니다.");
		}else if( age >= 60 ) { // 만약에 age(나이)값이 60 이상이면 , [1분복습 해답]
			charge = 0;
			System.out.println("경로우대입니다. 입장료는 " + charge + "원 입니다.");
		}else { // 그외 나머지 모두.
			charge = 3000;
			System.out.println("일반인 입니다.");
		} // if e
		System.out.println("입장료는 " + charge + "원 입니다.");
		
			// * [1분복습] , age >= 60 조건 추가  43줄
		
		// if~elseif ( 다수조건에 따른 하나의 결과실행문 ) vs if if ( 다수조건에 따른 N개의 결과실행문 )
		
		// p.100 나혼자코딩
		int score = 70;
		char grade;
		if( score >= 90 ) { 						// 만약에 성적이 100 ~ 90 이면 score <= 100 && score >= 90
			grade = 'A';
		}else if( score >= 80 ) {					// 아니고 성적이 89 ~ 80 이면 score <= 89 && score >= 80
			grade = 'B';
		}else if( score >= 70 ) {					// 아니고 성적이 79 ~ 70 이면 score <= 79 && score >= 70
			grade = 'C';
		}else if( score >= 60 ) { 					// 아니고 성적이 69 ~ 60 이면 score <= 69 && score >= 60
			grade = 'D';
		}else {										// 그외
			grade = 'F';
		}
		
		System.out.println( score );
		System.out.println( grade );
		
		// [1분복습] p100
			// 1. score >= 90 // 2. 'B'
	}
}
