package basic;

//자료형변환(TypeCast) : 값의 자료형을 일시적으로 변환하여 사용하는 방법
//=> 자동 형변환(JVM이 실행할 때 해줌), 강제 형변환(프로그래머가 함)
public class TypeCastApp {
	public static void main(String[] args) {
		//자동 형변환(promotion) : 자료형이 다른 값을 연산하기 위한 "JVM이" 자료형을 일시적으로 변환하는것.
		//10+13.5 => 정수값과 실수값의 합이기 때문에 원칙적으로는 연산 안 됨. 그래서 자동형변환을 통해 연산 되어질 수 있도록함.
		//>> 표현의 범위가 작은 자료형의 값이 큰 자료형의 값으로 형변환되어 연산처리. (단, boolean빼고. 얘는 연산못함. 나머지 7개를 사용함)
		// 크기 : byte < short <char < int < long < float < double
		System.out.println("결과 = "+(3+1.5)); 		
				// 정수3이 3.0이라는 실수로 자동 형변환됨.(실수가 정수보다 범위가 크니까)
				//3(int)+1.5(double) >> 3.0(double)+1.5(double) >> 4.5(double)
		
		double su = 10;		//10이 자동적으로 10.0으로 변환되어 저장. = 이것도 자동 형변환
		System.out.println("su = "+su);
		
		System.out.println("결과 = "+(95/10)); 	
			// (정수int)/(정수int)는 (정수int)라는 결과가 나옴 >> [결과] 35/10 = 3
		System.out.println("결과 = "+(95.0/10.0));//double/double >> double
			
		System.out.println("결과 = "+(95.0/10));//double/int >> double/double(자동 형변환) >> double"+(95/10)); 	

		System.out.println("결과 = "+(95/10.));//int/double >> double(자동 형변환)/double >> double
			// 10.0 뒤에 0은 불필요하기 때문에 생략되어도 괜찮. 

		
		int kor=95, eng=90;		//점수 입력
		int tot=kor+eng;		//총점 계산
		//double ave=tot/2;		//평균 계산. 나누기는 계산결과가 소수점이 나올 수 있기 때문에 double 사용
			// 연산 결과값 : 정수값(92)->실수값(92.0)으로 자동 형변환 됨.  => 내가 원하던 결과는 아님
		double ave=tot/2.0;		//평균 계산 => 실수값을 얻고 싶으면 피연산자들 중 한 개는 무조건 실수값으로 만들어주면 됨.
		//따라서 해결책) ①1.0을 곱하여 실수타입으로 만든 후 산술 연산 실시. ②su1, su2 중 하나를 double 타입으로 강제 타입변환 한 후 산술연산진행

		
		System.out.println("총점= "+tot+", 평균 = "+ave);
		
		
		//int 자료형보다 작은 자료형의 값은 무조건 int 자료형으로 형변환되어 연산 처리
		byte su1=10, su2=20;
		//byte su3=su1+su2;		//=> error! 
			//int는 byte로 형변환 안됨.(byte+byte = 결과값 int로 나옴). int는 byte변수에 저장 불가능.
		int su3=su1+su2;		//이렇게 하면 error 없음.
		System.out.println("합계 = "+su3);
		System.out.println("===========================================");

		
		
		
		//강제 형변환(casting) : 프로그래머가 Cast 연산자를 사용하여 원하는 자료형의 값을 일시적으로 변환하여 명령을 작성하는 방법 
		//입력 방법: (자료형)값
		//크기 상관 없음
		//보통은 큰 허용범위타입을 작은 허용범위타입으로 변환할때 사용
		
		//int num=12.3;		//error! 절대X
		int num = (int)12.3;		// (int)12.3 : 실수12.3이 정수 12로 강제로 변환시킴.
		System.out.println("num = "+num);
		
		int num1=95, num2=10;
		double num3=num1/num2;
		System.out.println("num3 = "+num3);		//연산결과 9 아니고 9.0 
		
		double num4=(double)num1/num2;		//강제형변환 연산자는 다른 연산자보다 먼저 실행됨.
		System.out.println("num4 = "+num4);		//연산결과 9
		
		
		// 큰 정수값은 언더바(_) 기호를 사용하여 표현 가능( , 사용 불가)
		int num5=100_000_000, num6=30;
		//int num7=num5*num6;			//연산결과가 30억이 나오면 int(-21억~21억까지 표현가능)로는 실행X.(오버플로우로 나머지 값은 버리게됨.=>쓰레기 등장!)
			// 정수값에 대한 연산결과는 4btye로만 표현가능
			// 위 연산의 문제점) 정수값에 대한 연산 결과값이 4byte로 표현할 수 있는 범위를 벗어났으므로 쓰레기 값이 만들어짐. 
			// 따라서, 변수에 쓰레기값이 저장되어 잘못된 결과가 나옴. : 실행오류
			// int num7=num5*num6;
			// 해결법) 정수값에 대한 연산 결과값이 8byte(longtype)로 표현될 수 있도록 강제 형변환
		long num7=(long)num5*num6;
		System.out.println("num7 = "+num7);
		
		
		//소수점 2자리 위치까지만 출력되도록 명령 작성
		System.out.println(10/3.);
		
		double number = 1.23456789;
		System.out.println("number = "+number);
		
		System.out.println("number(내림) = "+(int)(number*100)/100.0); 		//마지막 100은 100.0이 되어야 함.
		System.out.println("number(반올림) = "+(int)(number*100+0.5)/100.0);
		System.out.println("number(올림) = "+(int)(number*100+0.9)/100.0);
		
		//<응용>
		//소수점 한자리 위치까지만 출력되도록 명령 작성
		System.out.println("number(내림) = "+(int)(number*10)/10.0);
		
		//소수점 2자리 위치까지만 출력되도록 명령 작성
		System.out.println("number(내림) = "+(int)(number*100)/100.0);

		
		//소수점 3자리 위치까지만 출력되도록 명령 작성
		System.out.println("number(내림) = "+(int)(number*1000)/1000.0);
		
	}
}
