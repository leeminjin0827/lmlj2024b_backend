package day07;

public class Example5 {
	public static void main(String[] args) {
		int[] data = new int[] {10,20,30,40,50};
		int sum = 0; int jum = 0;
		for( int i = 0 ; i <= data.length-1; i++ ) {
			sum += data[i];
		}
		jum = sum / data.length;
		System.out.println("총점은 "+sum+" 이고 평균은 "+jum+"이다");
	} // m end
} // c end
