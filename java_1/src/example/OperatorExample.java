package example;

public class OperatorExample {
	public static void main(String[] args) {
		//245678초를 일시분초 형식으로 변환하여 출력하세요.

		//<나>
		int tot = 245678;
		int sec = tot%60;
		int min = (tot/60)%60;
        int time = (tot/(60*60))%24;
        int day = (tot/(60*60*24));
		System.out.println(day+"일 "+time+"시 "+min+"분 "+sec+"초");
		
		//<풀이>
		int cho = 245678;
		int ill = cho/(24*60*60);	//24*60*60=86400
		cho%=86400;			//cho=cho%86400
		int si = cho/(60*60);
		cho%=3600;
		int bun = cho/60;
		int chocho=cho%60;
		System.out.println(ill+"일 "+si+"시 "+bun+"분 "+chocho+"초");


		System.out.println("===============================================");
		//한대의 가격이 1억 5천원만인 비행기를 20대 구매할 경우 지불해야될 금액을 계산하여 출력하세요. 
		//단, 15대 이상 구매할 경우 1대당 25%의 할인율을 적용하여 계산하세요.
		
		int one = 150_000_000;
		int air = 20;
		long all = (long)(air>=15 ? one*(1-0.25) : one)*air;		//L을 붙이는건 숫자일때만 가능. 숫자가 아닌 변수를 사용할때는 L을 붙이면 X. 변수 둘 중 하나를 long으로 만들어 줘야함(강제 형변환)

		System.out.println((long)one*air+"원");
		System.out.println("지불금액 : "+all+"원");



		System.out.println("===============================================");
	}
}
