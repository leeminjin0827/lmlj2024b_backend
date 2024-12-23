package day11;

import java.util.Scanner;

public class BoardService { 
	
	// 1. 멤버변수
	// 2. 생성자
	// 3. 메소드
	
	// 3-1 게시물 등록
	public void boardAdd( Scanner scan , BoardDto[] boards ) {
		 System.out.println("제목 : "); String title = scan.next();
		 System.out.println("내용 : "); String content = scan.next();
		 System.out.println("작성자 : "); String writer = scan.next();
		 // * 생성자를 이용한 객체 생성
		 BoardDto boardDto = new BoardDto(title,content,writer);
		 // * 배열에 저장
		 boolean saveSate = false;
		 for( int index = 0; index <= boards.length - 1; index++ ) {
			 if( boards[index] == null ) {
				 boards[index] = boardDto;
				 saveSate = true;
				 break;
			 } // if end
		 } // f end
		 if( saveSate ) { System.out.println("등록 성공"); }
		 else { System.out.println("등록 실패"); }
	} // m end
	
	// 3-2 모든 게시물 출력
	public void boardPrint( BoardDto[] boards ) {
		for( int index = 0 ; index <= boards.length - 1 ; index++ ) {
			if( boards[index] != null ) {
				System.out.printf("제목: %s , 내용: %s , 작성자: %s ," ,
						boards[index].getTitle() ,
						boards[index].getContent() ,
						boards[index].getWriter() );
			} // if end
		} // f end
	} // m end
} // c end






