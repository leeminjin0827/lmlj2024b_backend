package day14.boardprogram9;

import day14.boardprogram9.view.BoardView;

/*
	자바 실습 : 비게시판 프로그램
	- 1. MVC패턴 으로 패키지와 클래스 구성
	- 2. 배열 대신 ArrayList 클래스 구성하기. 
*/

public class AppStart {
	public static void main(String[] args) {
		
		// + 싱글톤의 내부 함수 호출
		BoardView.getinstance().run();
			// - static 함수를 호출하는 방법 : 클래스명.함수명()
			// - static 없는 함수 호출하는 방법 : 객체.함수명();
	} // f end
} // c end
