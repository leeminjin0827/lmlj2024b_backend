package day11;

import java.util.Scanner;

public class UserService {
	
	// 회원가입 
	public void userAdd( Scanner scan , UserDto[] users ) {
		System.out.println(">> 회원가입 <<");
		System.out.println("아이디 입력 : "); String id = scan.next();
		System.out.println("비밀번호 입력 : "); String pw = scan.next();
		
		boolean saveSate = false;
		UserDto userDto = new UserDto( id , pw );
		for( int index = 0; index <= users.length - 1 ; index++ ) {
			if( users[index] == null ) {
				users[index] = userDto;
				saveSate = true;
			} // if end
		} // f end
		if( saveSate ) { System.out.println("등록 성공"); }
		else { System.out.println("등록 실패"); }
	} // v end(end)
	
	// 로그인
	public boolean loginAdd( Scanner scan , UserDto[] users ) {
		System.out.println(">> 로그인 <<");
		System.out.println("아이디 입력 : "); String ID = scan.next();
		System.out.println("비밀번호 입력 : "); String PW = scan.next();
		
		boolean usersave = false;
		for( int i = 0 ; i <= users.length - 1 ; i++ ) {
			if( users[i] != null ) {
				if( ID.equals(users[i].getId()) && PW.equals(users[i].getPw()) ){
					usersave = true;
					System.out.println("로그인 성공");
				}else if( ID.equals(users[i].getId()) || PW.equals(users[i].getPw()) ){
					usersave = false;
					System.out.println("로그인 실패");
				}
			}return; // if end
		} // f end
	} // v end
} // c end
	
class BoarService{
		
	// 게시물 등록
	public void boarAdd( Scanner scan , BoarDto[] boars ) {
		System.out.println(">> 게시물 등록 <<");
		System.out.println("제목 : "); String title = scan.next();
		System.out.println("내용 : "); String content = scan.next();
		BoarDto boarDto = new BoarDto( title , content );
		boolean save = false;
		for( int i = 0 ; i <= boars.length - 1 ; i++ ) {
			if( boars[i] == null ) {
				boars[i] = boarDto;
				save = true;
			} // if end
		} // f end 
		if( save ) { System.out.println("등록 성공"); }
		else { System.out.println("등록 실패"); }
	} // v end
	
	// 게시물 출력
	public void BoarPrint( BoarDto[] boars ) {
		for( int i = 0 ; i <= boars.length - 1 ; i++) {
			if( boars[i] != null ) {
				System.out.printf("제목 : %s , 내용 : %s" ,
						boars[i].getTitle() ,
						boars[i].getContent() );
			} // if end
		} // f end
	} // v end
} // c end

