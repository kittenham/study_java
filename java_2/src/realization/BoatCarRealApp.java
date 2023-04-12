package realization;

public class BoatCarRealApp {
	public static void main(String[] args) {
//		BoatCarReal boatCarReal = new BoatCarReal();
		
		//셋다 가능하지만, 자식클래스가 상속받은 모든 부모인터페이스 참조변수를 생성하여 자식클래스의 객체 저장이 가능하다.
		//=> 묵시적 객체 형변환에 의해 오버라이드 선언된 자식클래스의 메소드가 호출된다.
		//=> 인터페이스에 따라 호출가능한 메소드가 다를수 있다.
		BoatCar boatCar = new BoatCarReal();	//보트카로서의 기능 사용 가능
//		Car boatCar = new BoatCarReal();	//자동차로서의 기능만 사용 가능
//		Boat boatCar = new BoatCarReal();	//보트로서의 기능만 사용 가능
		
		boatCar.run();
		boatCar.navigate();
		boatCar.floationg();
		
	}
}
