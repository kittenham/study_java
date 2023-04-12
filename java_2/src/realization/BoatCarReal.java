package realization;

public class BoatCarReal implements BoatCar{	//모든 interface의 메소드를 오버라이드 해줘야함

	@Override
	public void run() {
		System.out.println("땅 위를 달리는 능력");
		
	}

	@Override
	public void floationg() {
		System.out.println("공중에 떠 있는 능력");
	}

	@Override
	public void navigate() {
		System.out.println("바다를 항해하는 능력");
	}

}
