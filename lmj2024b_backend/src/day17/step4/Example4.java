package day17.step4;

public class Example4 {
	public static void main(String[] args) {
		
		// [1] customer 인스턴스 생성
		Customer customer = new Customer();
		// 첫글자 대문자 : 클래스명/인터페이스
		
		// [2] buyer = customer;
		Buy buyer = customer;
		
		// [3]
		Sell seller = customer; // (업) 캐스팅
		seller.sell(); // 판매하기
		
		// [4] 변수명 instanceof 타입: 변수가 창조하는 인트선트의 타입 조회 
		if( seller instanceof Customer ) { // true 로 예상
			Customer customer2 = (Customer)seller; // (다운)캐스팅
			customer2.buy();			// 구매하기
			customer2.sell();			//판매하기
		}
		
	} // m end
} // c end
