package day13.example.model.dto;

public class WaitingDto {
	
	// 멤버변수
	private String phone;
	private String headcount;
	
	// 생성자
	public WaitingDto() {}
	public WaitingDto( String phone , String headcount ) {
		this.phone = phone;
		this.headcount = headcount;
	}
	
	// 메소드
	public String getPhone() { return this.phone; }
	public String getHeadcount() { return this.headcount; }
	public void setPhone( String phone ) { this.phone = phone; }
	public void setHeadcount( String headString ) { this.headcount = headString; }
	
} // c end