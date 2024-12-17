package day07;

import java.util.Scanner;

/*
자바 조별과제1 ,
주제 : 회원 서비스 구현하기 
   - 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) , 클래스(멤버변수)/객체
   - 회원은 최대 3명 까지 저장할수 있다.
   - 회원정보는 아이디 , 비밀번호 , 닉네임을 갖습니다.
   - 회원클래스를 정의하고 회원객체 활용하여 구현한다.
   - 프로그램 초기 메뉴 : 1.회원가입 2.로그인 : 
      1 선택시 : 아이디,비밀번호,닉네임 3개의 각 정보를 입력받아 저장하기.
      2 선택시 : 아이디,비밀번호를 입력받아 기존의 저장된 정보와 일치한 정보가 있으면 '로그인성공' 아니면 '로그인실패' 출력한다.

1. 코드 구현 : 카카오톡방에 과제 코드가 존재하는 본인 git 상세주소 제출 
2. 구현 된 코드에서 문법찾기 : 아래 링크의 각 슬라이드에서 조별 작성 , 카톡방 링크 참고
https://docs.google.com/presentation/d/1k7xc6I3MwnBI57zr1WTGm0mVgzQ5CXkmrEro2PFc9UI/edit?usp=sharing
*/
public class Example3 {
	public static void main(String[] args) {
		User u1 = new User(); User u2 = new User(); User u3 = new User();
		while(true) {
			System.out.println("1.회원가입 2.로그인");
			Scanner scan = new Scanner( System.in );
			int menu = scan.nextInt();
			if( menu == 1 ) { System.out.println("회원가입");
				System.out.println("> 아이디 입력 : "); 	String Id = scan.next(); 
				System.out.println("> 비밀번호 입력 : ");	String Pw = scan.next();
				System.out.println("> 닉네임 입력 : "); 	String Name = scan.next();
				if( u1.id == null ) {
					u1.id = Id; u1.pw = Pw; u1.name = Name;
				}else if( u2.id == null ) {
					u2.id = Id; u2.pw = Pw; u2.name = Name;
				}else if( u3.id == null ) {
					u3.id = Id; u3.pw = Pw; u3.name = Name;
				}
			}else if( menu == 2 ){
				System.out.println("> 아이디 입력 : ");
				String ID = scan.next();
				System.out.println("> 비밀번호 입력 : ");
				String PW = scan.next();
				if( u1.equals(id) == ID  && u1.equals(pw) == PW ) {
					System.out.println("로그인성공");
				}else if( u2.id == ID && u2.pw == PW ) {
					System.out.println("로그인성공");
				}else if( u3.id == ID && u3.pw == PW ) {
					System.out.println("로그인성공");
				}else { System.out.println("로그인실패"); }
			} // ei end
		} // w end
	} // m end
} // c end
