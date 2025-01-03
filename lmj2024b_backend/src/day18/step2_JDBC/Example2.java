package day18.step2_JDBC;

public class Example2 {
	public static void main(String[] args) {
		
		// [확인]
		Dao.getInstance();
		
		// [insert 확인]
		Dao.getInstance().insert();
		
		// [select 확인]
		Dao.getInstance().select();
		
		// [update 확인]
		Dao.getInstance().update();
		
		// [delete 확인]
		Dao.getInstance().delete();
		
		Dao.getInstance().select();
		
	} // main end
} // class end
