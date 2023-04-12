package realization;

//interface는 다중상속 가능.
//인터페이스가 다른 인터페이스를 상속받기 위해서는 "extends 키워드" 사용
public interface BoatCar extends Car, Boat {

	void floationg();
	
}
