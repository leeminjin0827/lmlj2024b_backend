package day13.example.controller;

import day13.example.model.dao.WaitingDao;
import day13.example.model.dto.WaitingDto;

public class WaitingController {
	
	private WaitingController() {} // +싱글톤
	private static WaitingController instance = new WaitingController();
	public static WaitingController getInstance() {
		return instance; } // -싱글톤
	
	public boolean write( WaitingDto waitingDto ) {
		boolean result =  WaitingDao.getinstance().write( waitingDto );
		return result;
		
	} // f end
	
	public WaitingDto[] findAll() {
		WaitingDto[] result = WaitingDao.getinstance().findAll();
		return result;
		
	} // f end
	
	
} // c end
