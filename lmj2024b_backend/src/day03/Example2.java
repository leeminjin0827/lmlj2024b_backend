package day03;

public class Example2 {

	public static void main(String[] args) {

		// p.88 연습문제
		
		// 1.
			int myAge = 23;
			int teacherAge = 38;
			
			boolean value = (myAge > 25);
			System.out.println(value);
			
			System.out.println(myAge <= 25);
			System.out.println( myAge == teacherAge);
			
			char ch;
			ch = (myAge > teacherAge) ? 'T' : 'F';
			
		// 2.
			int num;
			num = -5 + 3 * 10 / 2;
			System.out.println(num); // 10
		
		// 3. 10 10 11 10
			int num2 = 10;
			System.out.println(num2);
			System.out.println(num2++);
			System.out.println(num2);
			System.out.println(--num2);
			
		// 4. false true false
			int num3 = 10;
			int num4 = 20;
			boolean result;
			result = ( ( num3 > 10 ) && ( num4 > 10) );
			System.out.println(result);
			result = ( ( num3 > 10 ) || ( num4 > 10) );
			System.out.println(result);
			System.out.println(!result);
			
		// 6. 18 8 2
			int num5 = 8;
			System.out.println(num5 += 10);
			System.out.println(num5 -= 10);
			System.out.println(num >>= 2);
			
		// 7. 30
			int num6 = 10;
			int num7 = 20;
			int result3 = (num6 >= 10) ? num7 + 10 : num7 - 10;
			System.out.println(result3);
	}
}
