package day09;

import java.util.Scanner;

public class UserService {
	void userAdd ( Scanner scan , User[] users ) {
		System.out.println("> 전화번호 입력 : ");
		String phone = scan.next();
		System.out.println("> 인원수 입력 : ");
		int number = scan.nextInt();
		
		
		User user = new User();
		user.phone = phone;
		user.number = number;
		
		boolean saveState = false;
		for( int index = 0 ; index < users.length - 1 ; index++ ) {
			if( users[index] == null ) {
				users[index] = user;
				saveState = true;
				break;
			}
		}
		if( saveState ) { System.out.println("주문등록 성공"); }
		else { System.out.println("주문등록 실패"); }
	} // m end
	
	void userPrint( User[] users ) {
		System.out.println("> 주문 발행합니다. <");
		for( int index = 0 ; index <=users.length - 1 ; index++ ) {
			if( users[index] != null ) {
				User user = users[index];
				System.out.printf("전화번호 : %d , 인원수 : %s \n" ,
						index , user.phone , user.number );
			}
		}
	}
} // c end
