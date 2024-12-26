package day13.example;

import day13.example.view.WaitingView;

/*
	자바 과제12 : (식당) 대기번호 발행 프로그램
	- 1. MVC패턴 으로 패키지와 클래스 구성
		- 클래스 : AppStart , WaitingView , WaitingController , WaitingDao , WaitingDto
	- 2. 전화번호 와 인원수를 입력받아 대기등록 기능 구축하기.
	- 3. 현재 모든 대기명단을 출력하는 기능 구축하기.
	
	제출 : 카카오톡방에 과제 코드가 존재하는 본인 git 상세주소 제출 
*/
public class AppStart {
	public static void main(String[] args) {
		
		// 실글톤의 메소드 호출
		WaitingView.getInstance().line();
		
	} // f end
} // c end
