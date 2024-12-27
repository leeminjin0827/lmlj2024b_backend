package day14.example2.model.dao;

import java.util.ArrayList;

import day14.example2.model.dto.ClassDto;

public class ClassDao {
	
	// + 싱글톤
	private ClassDao() {}
	private static ClassDao instance = new ClassDao();
	public static ClassDao getInstance() {
		return instance;
	}
	// - 싱글톤
	
	// 수업 리스트 선언
	private ArrayList<ClassDto> classDB = new ArrayList<>();
	
	// 1. 수업 등록 처리 함수
	public boolean create( ClassDto classDto ) {
		classDB.add(classDto);
		return true;
	} // f end
	
	// 2. 수업 리스트 반환 처리 함수
	public ArrayList<ClassDto> read(){
		// [1] 모든 수업정보를 갖는 리스트객체 반환
		return classDB;
	} // f end
	
	// 3. 수업 수정 처리 함수
	public boolean update( ClassDto classDto ) {
		// 리스트에 존재하지 않는 번호면 실패
		for( int i = 0; i <= classDB.size() -1 ; i++ ) {
			if( classDto.getCode() != classDB.size() -1 ) {
				return false;
			} // if end
		} // for end
		classDB.set( classDto );
		return true;
	} // c end
	
	// 4. 수업 삭제 처리 함수
	public boolean delete( int dCode ) {
		// [1] 리스트에서 지목한 번호를 .remove()함수 이용해서 요소 삭제
		for( int i = 0; i <= classDB.size() -1; i++ ) {
			if( dCode != classDB.size() -1 ) {
				return false;
			} // if end
		} // for end
		classDB.remove( dCode ); // 삭제 처리
		// 삭제 결과 반환
		return true;
	} // f end
	
} // c end
