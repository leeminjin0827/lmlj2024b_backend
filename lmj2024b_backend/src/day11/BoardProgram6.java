package day11;

import java.util.Scanner;

// (1) main함수 갖는 프로그램 실행 클래스
public class BoardProgram6 {
	public static void main(String[] args) {
		
		// *
		BoardDto[] boards = new BoardDto[100];
		BoardService bs = new BoardService();
		
		while(true) {
		
			System.out.print("1.등록 2.출력");
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			
			if( choose == 1 ) {
				bs.boardAdd( scan , boards );	// 등록함수 호출
			}else if( choose == 2 ) {
				bs.boardPrint( boards );		// 출력함수 호출
			} // if end
			
		} // w end
	} // m end
} // c end