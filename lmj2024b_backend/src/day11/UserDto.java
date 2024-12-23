package day11;

public class UserDto {
	// 멤버변수
	private String id;
	private String pw;
	
	// 생성자
	public UserDto( ) { }
	public UserDto( String id , String pw ) {
		this.id = id;
		this.pw = pw;
	}
	
	// 메소드
	public String getId() { return this.id; }
	public void setId( String id ) { this.id = id; }
	public String getPw() { return this.pw; }
	public void setPw( String pw ) { this.pw = pw; }
} // c end
