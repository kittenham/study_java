package basic;

//break문 : 

public class BreakApp {
	public static void main(String[] args) {
		//[일반적으로는] 반복문은 조건식의 결과가 거짓인 경우 반복문을 종료.
		for(int i=1;i<=5;i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
		
		//if 구문의 조건이 참인 경우 break 구문을 이용하여 반복문 종료
		for(int i=1;i<=5;i++) {
			if(i==3) break;
			System.out.print(i+"\t");
		}
		System.out.println();		
		
		System.out.println("===========================================");
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j==3) break;		//이때의 break는 해당break를 포함하는 반복문 for(int j=1;j<=5;j++)만 종료함.
				System.out.println("i = "+i+", j = "+j);
			}
		}
		
		System.out.println("===========================================");

		//반복문 작성시, 반복문을 구분하기위한 식별자(라벨명)을 선언할 수 있다.
		//형식)  라벨명:반복문
		loop:		//라벨명 = loop
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j==3) break loop;		//j가 3이 나왔을때, for(int i=1;i<=5;i++) 반복문 전부 종료.
				System.out.println("i = "+i+", j = "+j);
			}
		}
		
	}

}
