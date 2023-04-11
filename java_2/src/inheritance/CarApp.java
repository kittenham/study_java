package inheritance;

public class CarApp {
	public static void main(String[] args) {
		Car car = new Car("싼타페","홍길동");
		
		System.out.println("모델명 = "+car.getModelName());
		System.out.println("소유자 = "+car.getUserName());
		System.out.println("====================================================================");
		/*		
		System.out.println("car.toString = "+car.toString()); 		//toString은 Object 클래스에 있는 메소드를 호출 한것.
		//Object.toString() : 참조변수에 저장된 객체를 참조하여 "클래스명@메모리주소"형식의 문자열로 변환하여 반환하는 메소드
		System.out.println("car = "+car);	//이렇게해도 위와 같은 결과를 얻음. 이유 : 참조변수를 출력할 경우 자동으로 toString() 메소드가 호출되기 때문. 
 		*/
		
		//Object 클래스의 toString() 메소드가 아닌 Car 클래스의 toString()메소드 자동 호출
		System.out.println("car = "+car);
		System.out.println("====================================================================");
		
		String name = "홍길동";		//문자열이 저장된 String 객체를 생성하여 객체의 메모리 주소를 참조변수에 저장하는것.
		
		System.out.println("name = "+name);
		System.out.println("name = "+name.toString()); //=> 출력은 위와 아래가 똑같음. 사실 정석은 아래것.
		//String 클래스에 오버라이드 선언된 toString() 메소드 호출
		//=> String.toString() : String 객체에 저장된 문자열을 반환하는 메소드
		//=> System.out.println("name = "+name.toString());
		//=> String 클래스의 참조변수를 출력할 경우 자동으로 String 클래스의 toString() 메소드 호출
	}

}
