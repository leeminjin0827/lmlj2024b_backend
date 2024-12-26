package day13.example.view;

import java.util.Scanner;

import day13.example.controller.WaitingController;
import day13.example.model.dto.WaitingDto;

public class WaitingView {
	
	// + 싱글톤
	private WaitingView() {}
	private static WaitingView instance = new WaitingView();
	public static WaitingView getInstance() {
		return instance;
	} // - 싱글톤 end
	
	Scanner scan = new Scanner(System.in);
	
	public void line() {
		while(true) {
			System.out.println(">> 대기번호 발행 프로그램 <<");
			System.out.println("1.등록 2.발행");
			
			int choose = scan.nextInt();
			if( choose == 1 ) { write(); }
			else if( choose == 2 ) { findAll(); }
		} // w end
	} // f end 
	
	public void write() {
		// [1] 입력
		System.out.println(" [대기번호 등록] ");
		System.out.println("전화번호 입력 : "); String phone = scan.next();
		System.out.println("인원수 입력 : "); String headcount = scan.next();
		// [2] 객체화
		WaitingDto waitingDto = new WaitingDto( phone , headcount );
		// [3] 컨트롤러에게 저장할 객체를 전달하고 결과를 응답받기.
		boolean result = WaitingController.getInstance().write( waitingDto );
		if( result == true ) { System.out.println("[대기번호 등록 성공]"); }
		else { System.out.println("[대기번호 등록 실패"); }
	} // f end
	
	public void findAll() {
		System.out.println(" [대기번호 발행]  ");
		WaitingDto[] result = WaitingController.getInstance().findAll();
			for( int i = 0; i <= result.length -1; i++ ) {
				WaitingDto waiting = result[i];
				if( waiting != null ) {
					System.out.printf("%d , %s , %s \n" ,
							i ,
							waiting.getPhone() ,
							waiting.getHeadcount() );
				} // if end
			} // for end
	} // f end

} // c end
