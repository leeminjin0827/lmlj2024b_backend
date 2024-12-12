package day04;

public class Example3 {

	public static void main(String[] args) {
		
		// p.113 1분복습 : 1. int num = 1 ; 2. num <= 10 ; 3. num++
		
		// [1] for , 1부터 10까지 더하는 과정
			// 1.			
		int sum = 0;
		sum += 1; sum += 2; sum += 3; sum += 4; sum += 5;
		sum += 6; sum += 7; sum += 8; sum += 9; sum += 10;				
			// - 반복되는코드 : sum +=
			// - 반복되지않는코드 : int sum = 0; , 1 2 3 4 5 6 7 8 9 10
				// - 패턴/규칙 : 1부터 10까지 1씩증가 규칙
			// 2.
		int sum2 = 0;
		for( int i = 1 ; i <= 10 ; i++ ) { // i는 1부터 10까지 1씩 증가반복
			sum2 += 1;
		}
		System.out.println("1부터 10까지 합 : " + sum2 );
		
		// [2] 나 혼자 코딩
		for( int i = 1 ; i <= 10 ; i++ ) {
			System.out.println("안녕하세요"+i);
		}
		
		// [3] 구구단 , for중첩 , 단마다 곱 계산( 단for 안에 곱for 포함 )
		for( int dan = 2 ; dan <= 9; dan++ ) {
			// dan 2부터 9까지 1씩증가 하면서 반복
			
			for( int times = 1 ; times <= 9 ; times++) {
				// times는 1부터 9까지 1씩증가 하면서 반복
				System.out.println( dan + "x" + times + "=" + dan * times );
			}
		}
		
		// [4] 1분 복습
		for( int xxck = 3 ; xxck <= 7 ; xxck++ ) {
			for( int fuxx = 1 ; fuxx <= 7 ; fuxx++ ) {
				System.out.println( xxck + "X" + fuxx + "=" + xxck * fuxx );
			}
		}
		
		// [5] continue문 , 이후의 문장은 수행하지 않고 for문의 증감식으로 이동한다.
		// 1~~100까지의 홀수값들의 합계
		int total = 0;
		for( int num = 1 ; num <= 100 ; num++ ) {
			if( num %2 == 0 ) {
				// 만약에 현재 반복되고 있는 num변수값이 나누기 2했을때 0 이면 [짝수]
				continue;
			} // i end
			total += num;	
		} // f end
		System.out.println("1부터 100까지 홀수의 합 : " + total );
		
		// [6] 1분 복습
		// 1. num = 1 2. num <= 100 3. num %3 != 0
		
		// [7] break , 가장가까운 for/switch 문{} 을 탈출/종료 한다.
		int sum3 = 0;
		for( int num = 0 ; ; num ++ ) {
			sum3 += num;
			if( sum3 >= 100 ) { break; }
			// 만약에 sum3이 100보다 이상이면 반복문 종료
		}
		
		// [8] p.123
	}

}
