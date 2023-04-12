package enumerate;

public class CompassApp {

	public static void main(String[] args) {
		//열거형에 선언된 상수필드값 출력 - 상수필드명을 제공받아 출력(숫자 출력이 아닌 상수필드명이 출력됨)
		System.out.println("동 = "+Compass.EAST);
		System.out.println("서 = "+Compass.WEST);
		System.out.println("남 = "+Compass.SOUTH);
		System.out.println("북 = "+Compass.NORTH);
		System.out.println("=====================================================================");
		
		
		System.out.println("=====================================================================");

		//EnumType.values() : 열거형에 선언된 모든 상수필드를 배열로 변환하여 반환하는 메소드
		//EnumType.ordinal() : 상수필드를 구분하기 위한 첨자(Index)를 반환하는 메소드
		for(Compass compass : Compass.values()) {
			System.out.println(compass+" = "+compass.getValue()+" >> "+compass.ordinal());
		}
	}
}
