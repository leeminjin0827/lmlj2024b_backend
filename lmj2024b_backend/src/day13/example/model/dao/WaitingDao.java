package day13.example.model.dao;

import day13.example.model.dto.WaitingDto;

public class WaitingDao {
	
	private WaitingDao() {} // +싱글톤
	private static WaitingDao instance = new WaitingDao();
	public static WaitingDao getinstance() { return instance; } // -싱글톤
	
	private WaitingDto[] waitingDB = new WaitingDto[999];
	
	public boolean write( WaitingDto waitingDto ) {
		for( int i = 0; i <= waitingDB.length -1; i++ ) {
			if( waitingDB[i] == null ) {
				waitingDB[i] = waitingDto;
				return true;
			} // if end
		} // for end
		return false;
	} // f end
	
	public WaitingDto[] findAll() {
		return waitingDB;
	} // f end
	
} // c end
