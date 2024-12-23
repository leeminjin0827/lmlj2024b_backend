package day11;

public class BoarDto {
	
	// 멤버변수
	private String title;
	private String content;
	
	// 생성자
	public BoarDto( ) { }
	public BoarDto( String title , String content ) {
		this.title = title;
		this.content = content;
	}
	
	// 메소드
	public String getTitle() { return this.title; }
	public void setTitle( String title ) { this.title = title; }
	public String getContent() { return this.content; }
	public void setContent( String content ) { this.content = content; }
} // c end
