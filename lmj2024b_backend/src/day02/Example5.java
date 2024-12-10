package day02;

import java.util.Scanner;

public class Example5 { // class s

	public static void main(String[] args) { // main s

	// JS day10 연산자 문제 10개 (1_연산자.js) 를 자바로 풀이하기
		// [지문1] 국어 , 영어 , 수학 점수를 각 입력받아서 각 변수에 저장하고 총점 과 평균을 계산하여 console탭에 출력하시오.
			Scanner scan = new Scanner(System.in);
			System.out.println("[1] 국어 점수 입력 : ");
			int 국어점수 = scan.nextInt();
			System.out.println("[1] 영어 점수 입력 : ");
			int 영어점수 = scan.nextInt();
			System.out.println("[1] 수학 점수 입력 : ");
			int 수학점수 = scan.nextInt();
			int 총점 = 국어점수+영어점수+수학점수;
			int 평균 = 총점/3;
			System.out.println("[1] 총점은 "+총점+"이고 평균은 "+평균+"이다");
//	     [지문2] 반지름를 입력받아서 원넓이[반지름*반지름*3.14] 계산하여 console탭에 출력하시오.
			System.out.println("[2] 반지름 입력 : ");
			int 반지름 = scan.nextInt();
			double 원넓이 = 반지름*반지름*3.14;
			System.out.println("[2] 원넓이는 : "+원넓이);
	      
	    // [지문3] 두 실수를 입력받아서 앞 실수의 값이 뒤실수의 값의 비율% 계산하여 console탭에 출력하시오.
			System.out.println("[3] 실수1 입력 : ");
			float 실수1 = scan.nextFloat();
			System.out.println("[3] 실수2 입력 : ");
			float 실수2 = scan.nextFloat();
			double 비율 = (실수1/실수2)*100;
			System.out.println("[3] : "+비율);
	      
	    // [지문4] 정수를 입력받아 입력받은 값이 홀수이면 true / 짝수이면 false 로 console탭에 출력하시오.
			System.out.println("[4] 정수를 입력 : ");
			int 정수1 = scan.nextInt();
			boolean 결과1 = 정수1%2 == 1;
			System.out.println("[4] : "+결과1);
	      
	    // [지문5] 정수를 입력받아 입력받은 값이 7의 배수이면 true / 아니면 false 로 console탭에 출력하시오.
			System.out.println("[5] 정수를 입력 : ");
			int 정수2 = scan.nextInt();
			boolean 결과2 = 정수2 %7 == 0;
			System.out.println("[5] : "+결과2);

	    // [지문6] 정수를 입력받아 입력받은 값이 홀수 이면서 7배수 이면 true / 아니면 false 로 console탭에 출력하시오.
			System.out.println("[6] 정수를 입력 : ");
			int 정수3 = scan.nextInt();
			boolean 결과3 = 정수3 %2 == 1 && 정수3 %7 == 0;
			System.out.println("[6] : "+결과3 );
	      
	    // [지문7] 십만원 단위의 금액을 입력받아 입력받은 금액의 지폐수를 console탭에 출력하시오.
	          // -> 입력 예] 356789 입력시 , 출력 예] 십만원:3장 만원:5장 천원6장 
			System.out.println("[7] 십만원 단위 금액 입력 : ");
			int 금액 = scan.nextInt();
			int 십만원 = 금액/100000;
			금액 -= 십만원*100000;
			int 만원 = 금액/10000;
			금액 -= 만원*10000;
			int 천원 = 금액/1000;
			System.out.println("[7] 십만원: "+십만원+ "장 만원 : "+만원+"장 천원 :"+천원+"장");
			
	    // [지문8] 1차점수 와 2차점수 각각 입력받아서 
	       // -> 총점이 150점이상이면 '합격' 아니면 '불합격' 으로 console탭에 출력하시오.
			System.out.println("[8] 1차점수 입력 : ");
			int 점수1차 = scan.nextInt();
			System.out.println("[8] 2차점수 입력 : ");
			int 점수2차 = scan.nextInt();
			int 총점1 = 점수1차+점수2차;
			System.out.println(총점1 >= 150? "합격" : "불합격" );
	} // main e

} // class e
