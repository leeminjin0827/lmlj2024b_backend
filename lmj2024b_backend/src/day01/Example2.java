package day01;

public class Example2 {

	public static void main(String[] args) {
		
		// 자료형/타입/분류 : 데이터를 나누는 방법
		/*
		  	- 자바 기본 타입 , 8가지
		  			[키워드]		[용량]		[저장범위]
		  	[논리]	
		  			boolean		1바이트		true 혹은 false
		  	
		  	[문자]	
		  			char		2바이트		유니코드 , 작은따옴표로 감싼 문자		, 'A'
		  			*String		N바이트		문자열클래스 , 큰따옴표로 감싼 문자열	, "ABC"
		  	
		  	[정수]	
		  			byte		1바이트		-128 ~ +127 저장
		  			short		2바이트		+-3만정도 저장
		  			int			4바이트		+-21억정도 저장 , 리터럴정수(키보드로 입력한 값은 정수) , 정수기본타입
		  			long		8바이트		+-21억이상 저장 , 리터럴정수 뒤에 L/l 붙이기
		  			
		  	[실수 , 부동소수점 ]	
		  			float		4바이트		소수점8자리 표현
		  			double		8바이트		소수점17자리 표현
		  			
		  	* 타입 목적 : 메모리 효율적으로 적절하게 선택하여 사용하자.(설계)
		 */
		
		// 1. boolean 타입은 true와 false만 저장할수 있다.
		boolean bool1 = true; 		System.out.println("bool1 : " + bool1); // + 연결 연산자 , "문자열"+변수호출값
		// boolean bool2 = 3; 		// 오류발생 : boolean 타입에 3을 저장할수 없다.
		boolean bool3 = false;		System.out.println( "bool3 : " + bool3 ); 
		
		// 2. char 타입은 작은따옴표를 이용한 문자1개만 저장할수 있다.
		char ch1 = 'A'; System.out.println( "ch1 : " + ch1 );
		// char ch2 = 'ABC';		// 오류발생 : 문자1개만 저장가능 하므로 오류
		// char ch3 = "ABC";		// 오류발생 : char는 큰따옴표를 사용할수 없다.
		
		// 3. String 클래스타입은 큰따옴표를 이용한 문자여러개 저장할수 있다. *참고로 기본타입은 아니다.
		String str1 = "ABC";		System.out.println( "str1 : " + str1 );
		// String str2 = 'ABC';		// 오류발생 : 문자여러개는 큰따옴표로 감싸야 한다.
		
		// 4. byte 타입은 -128 ~ +127 까지 저장이 가능하다.
		byte b1 = 100;				System.out.println( "b1 : " + b1 );
		// byte b2 = 300;			// 오류발생 : 타입의 저장 허용범위 벗어났기 떄문에 오류
		
		// 5. short 타입은 대략 +-3만정도 저장이 가능하다.
		short s1 = 32000;			System.out.println("s1 : " + s1 );
		// short s2 = 40000;		// 오류발생 : 타입의 저장 허용범위 벗어났기 때문에 오류
		
		// 6. int 타입은 대략 +-21억정도 저장이 가능하다.
		int i1 = 2100000000;		System.out.println("i1 : " + i1);
		// int i2 = 3000000000;		// 오류발생 : 타입의 저장 허용범위 벗어났기 때문에 오류
		
		// 7. long 타입은 대략 +-21억 이상 저장이 가능하다. , 정수리터럴 값 뒤에 L/l 붙인다.
		long lo1 = 3000000000L;		 System.out.println("lo1 : " + lo1);
		// long lo2 = 4000000000;	// 오류발생 : 리터럴값은 int 이므로 long에 대입할수 없다.
		
		// 8. float 타입은 소수점 8자리 까지 표현 , 실수리터럴 값 뒤에 F/f 붙인다.
		// float f1 = 0.123456789123456789; // 오류발생 : 실수 리퍼럴값은 double 이므로 float에 대입할 수 없다.
		float f2 = 0.123456789123456789F; 	System.out.println("f2 : " + f2 ); // 0.12345679
		
		// 9. double 타입은 소수점 17자리 까지 표현 , 실수리터럴 값의 기본타입
		double d1 = 0.123456789123456789; 	System.out.println("d1 : " + d1 );
		
		
	}

}
