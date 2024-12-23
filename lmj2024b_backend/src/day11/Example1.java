package day11;

import java.util.Scanner;

/*
	자바 과제11 : 회왼제 게시판
		- 초기메뉴는 로그인 과 회원가입 를 제공한다.
		- 로그인 성공하면 게시물등록과 게시물출력 를 제공합니다.
			- 단 게시물 등록시 작성자를 현재 로그인된 회원아이디로 자동 등록 됩니다.
*/
public class Example1 {
	public static void main(String[] args) {
		
		UserDto[] users = new UserDto[100];
		BoarDto[] boars = new BoarDto[100];
		UserService uv = new UserService();
		BoarService bv = new BoarService();
		while(true) {
			System.out.println("1.로그인 2.회원가입");
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			boolean saveSates = false;
			if( choose == 1 ) {
				uv.loginAdd( scan , users );
				saveSates = true;
			}else if( choose == 2 ) {
				uv.userAdd( scan , users );
			} // if end
			
			if( saveSates ) {
				int menu = scan.nextInt();
				System.out.println("1.게시물등록 2.게시물출력");
				if( menu == 1 ) {
					bv.boarAdd( scan , boars );
				}else if( menu == 2 ) {
					bv.BoarPrint( boars );
				}
				
			} // if end
		} // w end
	} // m end
} // c end
