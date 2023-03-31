package basic;

//switch : 값을 비교하여 명령 선택 실행

public class SwitchApp {
	public static void main(String[] args) {
		//int choice=1;
		//int choice=2;
		int choice=3;
		//double a=1.0; 		//비교시 double type(실수)은 사용X (error 발생)
		
		
		switch(choice) {		
			//choice의 값이 case 1과 같으므로 case 1의 위치부터 아래로 작성된 모든 명령 실행.
			//case = position위치 알려주는.
		case 1: 		//case 값에서 변수,연산식, 조건식 불가능 (상수와 리터럴만 가능)
			System.out.println("수성으로 이동합니다.");
		case 2: 		//case값은 다 달라야 함. 중복X
			System.out.println("금성으로 이동합니다.");
		case 3: 
			System.out.println("화성으로 이동합니다.");
		}
		
		System.out.println("===========================================");

		//switch의 값과 case의 값이 모두 다른 경우 명령 미실행됨
		choice=4;
		switch(choice) {		

		case 1: 
			System.out.println("수성으로 이동합니다.");
		case 2: 
			System.out.println("금성으로 이동합니다.");
		case 3: 
			System.out.println("화성으로 이동합니다.");
		default :
			System.out.println("집으로 이동합니다.");
		}
		
		System.out.println("===========================================");

		//switch의 값과 case 값이 모두 다른 경우 default에 작성된 명령을 무조건 실행
		choice=4;
		switch(choice) {

		case 1: 
			System.out.println("수성으로 이동합니다.");
		case 2: 
			System.out.println("금성으로 이동합니다.");
		case 3: 
			System.out.println("화성으로 이동합니다.");
		default :
			System.out.println("집으로 이동합니다.");
		}
		
		System.out.println("===========================================");
		
		//break
		switch(choice) {		
		case 1: 
			System.out.println("수성으로 이동합니다."); break; 	//break 걸리면 밑으로 수행X. 여기서 멈춤.
		case 2: 
			System.out.println("금성으로 이동합니다."); break;
		case 3: 
			System.out.println("화성으로 이동합니다."); break;
		}
		
		System.out.println("===========================================");
		
		int jumsu=85;
		
		//변수값이 0~100 범위의 유효값인지 아닌지를 구분하여 출력하는 프로그램 작성
		
		/*
		 점수맞춰서 학점 출력~~ 깃허브에서 찾아붙여넣기~~
		 */
		
		System.out.println("===========================================");
		
		//문자열을 비교하여 명령 선택 실행 가능
		String kor="둘";
		String eng="";
		
		switch(kor) {
		case "하나": eng="One"; break;
		case "둘": eng="Two"; break;
		case "셋": eng="Three"; break;
		}
		
		System.out.println("[결과]"+kor+" = "+eng);
		
		System.out.println("===========================================");
				
	}
}
