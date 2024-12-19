package day09;

import java.util.Scanner;

public class PlayerService {
	void playerAdd( Scanner scan , Player[] players ){
		System.out.println(">> 회원가입 <<");
		System.out.println("아이디 입력 : ");
		String id = scan.next();
		System.out.println("비밀번호 입력 : ");
		String pw = scan.next();
		System.out.println("닉네임 입력 : ");
		String name = scan.next();
		
		Player player = new Player();
		player.id = id;
		player.pw = pw;
		player.name = name;
		
		boolean savee = false;
		for( int index = 0 ; index <= players.length - 1 ; index++ ) {
			if( players[index] == null ) {
				players[index] = player;
				savee = true;
				break;
			} // i end
		} // f end
		if(savee) { System.out.println("등록"); }
		else { System.out.println("실패"); }
	} // m end
	void playerPrint( Scanner scan , Player[] players ){
		System.out.println(">> 로그인 <<");
		System.out.println("아이디 입력 : ");
		String ID = scan.next();
		System.out.println("비밀번호 입력 : ");
		String PW = scan.next();
		System.out.println(players[0].id);
		for(  int index = 0; index <= players.length - 1 ; index++ ) {
			if( players[index] != null ) {
				if( ID.equals(players[index].id) && PW.equals(players[index].pw)) {
					System.out.println("로그인 성공");
				}else {
					System.out.println("로그인 실패");
				}
			} // i end
		} // f end
	} // m end
} // c end
