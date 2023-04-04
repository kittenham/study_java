package basic;

public class MathRandomApp {
	public static void main(String[] args) {
		
		//Math 클래스 : 수학관련 기능을 제공하는 클래스
		//Math.random() : 0.0보다 크거나 같고 1.0보다 작은 실수 난수값을 반환하는 메소드
		
		//=> 0.0 <= 난수값 < 1.0
		for(int i=1;i<=5;i++) {
			System.out.println(i+"번째 실수 난수값 = "+Math.random());
		}
		
		System.out.println("============================================================");
		
		//정수 난수
		//(int)(Math.random())*100 => 0 <= 난수값 < 100 = 0~99
		for(int i=1;i<=5;i++) {
			System.out.println(i+"번째 정수 난수값 = "+(int)(Math.random()*100));
		}
		
		System.out.println("============================================================");
		
		//정수 난수
		//(int)(Math.random())*45 => 0 <= 난수값 < 45 = 0~44
		for(int i=1;i<=5;i++) {
			System.out.println(i+"번째 정수 난수값 = "+(int)(Math.random()*45));
		}
		System.out.println("============================================================");
		
		//정수 난수
		//(int)(Math.random())*45+1 => 1 <= 난수값 < 46 = 1~45
		for(int i=1;i<=6;i++) {
			System.out.println(i+"번째 정수 난수값 = "+(int)(Math.random()*45+1));
		}
		
	}
}
