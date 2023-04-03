package basic;

//continue : 
//continue는 반복문 안에서만 쓸수있음.

public class ContinueApp {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			System.out.println(i+"\t");
		}
		System.out.println();
		System.out.println("===========================================");

		for(int i=1;i<=5;i++) {
			if(i==3) continue;		
				//continue를 만나면 i=3일때만 출력신호(System.out.println(i+"\t"))를 넘어가고 다시 위로 올라가서 i++진행.
			System.out.println(i+"\t");
		}
		
		System.out.println("===========================================");

		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j==3) continue;		//j==3인것은 출력신호 건너뛰고 다시 위로 올라가서 for문 반복함.
				System.out.println("i = "+i+", j = "+j);
			}
		}
		
		System.out.println("===========================================");

		loop:		//라벨명 = loop
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j==3) continue loop;		//loop라는 명령을 다시 실행해주세요 => (for(int i=1;i<=5;i++) 반복문 재실행
				System.out.println("i = "+i+", j = "+j);
			}
		}
		
		
	}

}
