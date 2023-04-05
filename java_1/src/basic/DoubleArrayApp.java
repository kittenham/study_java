package basic;

//2차원 배열 : 1차원 배열의 모임 (1차원 배열 값의 모임이 아님)

public class DoubleArrayApp {
	public static void main(String[] args) {
		// 형식)  자료형[][] 참조변수 = new 자료형[행 갯수][열 갯수];
		//=> 행 갯수 : 2차원 배열에 생성되는 1차원 배열의 개수
		//=> 열 갯수 : 1차원 배열에 생성되는 요소의 개수
		
		int[][] num = new int[2][3];		// 첨자가 2개가 나와야함. 행과 열 구분. 2행 3열
		
		System.out.println("num = "+num);
		System.out.println("num[0] = "+num[0]);
		System.out.println("num[1] = "+num[1]);		//출력해보면 num[1]이 가지는 1차원배열의 메모리 주소가 나옴.
		
		System.out.println("======================================================");
		
		System.out.println("num[0][0] = "+num[0][0]);	
		System.out.println("num[0][1] = "+num[0][1]);	
		System.out.println("num[0][2] = "+num[0][1]);	
				
		System.out.println("num[1][0] = "+num[1][0]);	
		System.out.println("num[1][1] = "+num[1][1]);	
		System.out.println("num[1][2] = "+num[1][1]);	// 요소의 범위를 벗어나면 예외처리=> 에러
		
		System.out.println("======================================================");
		
		System.out.println("num.length ="+num.length);
		System.out.println("num[0].length ="+num[0].length);
		System.out.println("num[1].length ="+num[1].length);
		
		System.out.println("======================================================");
		
		for(int i=0;i<num.length;i++) {			//1차원 배열('행')을 일괄처리 하기 위한 반복문
			for(int j=0;j<num[i].length;j++) {		//요소('열')을 일괄처리 하기 위한 반복문
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("======================================================");

		//요소에 0이 아닌 다른 값 넣어보자
		int[][] su = new int[][] {{10,20,30},{40,50,60},{70,80,90}};	//3행 3열의 2차원 배열이 됨. 이때 new int[][] 생략해도 됨.
		
		for(int[] array : su) {			//2차원 배열을 사용할 때(일괄처리할때)는 for문을 2번 써 줘야함. 행과 열을 계산해야 하기 때문 . 따라서 n차원배열에서는 for문을 n번 사용함.
			for(int temp: array) {
				System.out.print(temp+"\t");
			}
			System.out.println();
		}
		
		System.out.println("======================================================");
		
		//1차원 배열의 요소의 개수가 정해져 있지 않은 2차원 배열 선언
		//=> 1차원 배열의 메모리 주소를 저장하는 참조요소만 생성되고 1차원 배열은 생성되지 않는다.
		//=> 2차원 배열의 참조요소는 null이 저장됨.
		int[][] value = new int[3][];		//3행짜리만 만들었음. 열이 없어도 에러가 나오지 않음.
		
		System.out.println("value = "+value);
		System.out.println("value[0] = "+value[0]);
		System.out.println("value[1] = "+value[1]);
		System.out.println("value[2] = "+value[2]);
		
		System.out.println("======================================================");

		//2차원 배열의 참조요소에 1차원 배열을 생성하여 메모리 주소 저장
		//=> 1차원 배열의 요소의 개수를 다르게 생성하여 저장 가능 : 가변배열
		value[0]=new int[3];
		value[1]=new int[2];
		value[2]=new int[4];
		
		System.out.println("======================================================");

		//자바는 다차원 배열을 가변배열로 선언 가능. 메모리 절약하려고 사용하는것.
		int[][] su2 = new int[][] {{10,20,30},{40,50},{60,70,80,90}};	//얘도 가변배열.
		
		
	}
}
