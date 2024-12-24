package day12;

class Student{
	// + 정적변수 : 프로그램 시작될때 1번 생성된다.
	public static int serialNum = 1000;
	// + 멤버변수 : 인스턴스 생성할때마다 각 변수가 생성된다.
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	// + 생성자

	// + 메소드
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName( String name ) {
		studentName = name;
	}
	
} // c end

class Student1{
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student1() {
		serialNum++;	// 학생이 생성될때마다 1증가
		studentID = serialNum; // 증가된 값을 학번 멤버변수에 대입한다.
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName( String name ) {
		studentName = name;
	}
	
} // c end

class Student2{
	// static변수에 private
	private static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student2() {
		serialNum++;	// 학생이 생성될때마다 1증가
		studentID = serialNum; // 증가된 값을 학번 멤버변수에 대입한다.
	}
	public static int getSerialNum() { // static은 this안씀 공용이라
		int i = 10;
		// return this.serialNum;
		return serialNum;
	}
	public static void setSerialNum( int serialNum ) {
		// this.serialNum = serialNum;
		Student2.serialNum = serialNum; 
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName( String name ) {
		studentName = name;
	}
	
} // c end

public class Example3 {
	public static void main(String[] args) {
		
		// 인스턴스 생성
		Student studentLee = new Student();
		studentLee.setStudentName("이지원");
		System.out.println( studentLee.serialNum ); // 1000
		studentLee.serialNum++; // 1증가
		
		// 인스턴스 생성
		Student studentSon = new Student();
		studentSon.setStudentName("손수건");
		System.out.println( studentSon.serialNum ); // 1001
		System.out.println( studentLee.serialNum ); // 1001
		
		System.out.println( studentSon.studentName ); // 이지원
		System.out.println( studentLee.studentName ); // 손수건
		
		// 예2]
		Student1 studentLee1 = new Student1();
		studentLee.setStudentName("이지원");
		System.out.println( studentLee1.studentID ); // 1001
		
		Student1 studentSon1 = new Student1();
		studentSon.setStudentName("손수건");
		System.out.println( studentSon1.studentID); // 1002
		
		// 예3] 클래스 변수
		System.out.println( Student.serialNum );
		System.out.println( Student1.serialNum);
		
		// 예4]
		// Student2.serialNum; // static변수도 private 외부클래스 접근불가능.
		System.out.println( Student2.getSerialNum() );
	} // v end
} // c end

/*
	클래스 2개 : Student , Example3 
	인스턴스 2개 : new Student(); , new Student();
	생성된멤버변수 : 8개
		( studentID , studentName , grade , address )
		( studentID , studentName , grade , address )
	정적변수 : 1개
*/