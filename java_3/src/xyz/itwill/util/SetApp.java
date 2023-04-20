package xyz.itwill.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//콜렉션 클래스(Collection Class) : 자료구조(Data Structure)를 사용하여 다수의 객체를 효율적으로 관리(추가,삭제,검색)하기 위한 
//기능을 제공하는 데이터 수집 클래스를 통칭

//=> Set 인터페이스, List 인터페이스, Map 인터페이스 중 하나를 상속받아 작성된 클래스
//=> 이때 Set, List 인터페이스는 Collection 인터페이스를 상속받는다.

//Set 인터페이스를 상속받은 콜렉션 클래스 - HashSet, TreeSet 등 (Oracle 홈페이지 들어가면 자식클래스 종류 많이 나옴)
//=> *객체의 저장 순서가 없으며(단점->내가 원하는 값을 뽑아낼수가없다.), 
//메모리 주소와 객체에 저장된 *값이 동일한 객체는 중복 저장되지 않는다*.(장점=똑같은 값을 같는 객체가 없다는 말)


public class SetApp {
	
	public static void main(String[] args) {
		
		//제네릭을 사용하지 않고 HashSet 클래스로 객체 생성 -> 권장X(경고나옴)
		//HashSet 객체에는 모든 자료형의 객체를 Object 타입으로 저장 가능하다.
		//=> 단점) HashSet 객체에 저장된 객체를 반환받아 사용할 경우 반드시 명시적 객체 형변환을 사용해야한다. 그렇지 않으면 Object 타입으로만 반환되기 때문.
		//게다가, 명시적 객체 형변환 잘못하면 예외도 뜸. 예외처리도 해줘야함. 귀찮,,
//		HashSet set = new HashSet();
		
		//배열은 요소의 값이 정해져있다는 단점有. HashSet은 안정해져있음.
		
		
		//따라서, 이렇게 사용하는 것을 권장.
		//제네릭을 사용하여 HashSet 클래스로 객체 생성
		//=> HashSet 클래스의 제네릭타입에 전달된 클래스의 객체만 저장가능하다.
		//=> HashSet 객체에 저장된 객체는 명시적 객체 형변환을 하지 않아도 된다.(저장된 객체가 String 밖에 없기때문)
//		HashSet<String> set = new HashSet<String>();
		
		//But, 참조변수는 부모클래스로 만든는것이 효율적이기 때문에 위의 코드 보다는 아래코드처럼 사용하는 것을 권장.
		//=>참조변수는 클래스가 상속받은 인터페이스(부모클래스)를 이용하여 선언하는 것을 권장한다.
		//==> 참조변수에는 인터페이스를 상속받은 모든 자식클래스의 객체저장가능
		//==> 클래스간의 결합도를 낮추어 유지보수의 효율성을 높일 수 있다.
		Set<String> set = new HashSet<String>(); 
		
		//HashSet 안에 표현되는 객체들도 요소라고 함.
		//set.add(E element) : Set 객체에 요소를 추가하는메소드 (이때 E는 제네릭임.) - 저장 순서 미제공
		//요소(Element) : Collection 클래스의 객체에 저장되는 객체 (=객체의 객체)
		set.add("홍길동");
		set.add("임꺽정");
		set.add("전우치");
		//-이렇게 저장해도 순서 없음. 홍길동이 먼저 저장되어도 출력은 순서없음. 
		//-저장은 메모리의 용량이 허용하는 한 계속 할 수 있다.
		//-기본적으로 요소 16개가 확보가 되지만 16개가 넘어가면 0.75를 곱한만큼 계속 증가됨. 용량이 없어질때까지 계속 가능.
		
		//set.toString() : Set 객체에 저장된 모든 요소값(객체)를 문자열로 변환하여 반환하는 메소드
		System.out.println("set.toString() = "+set.toString());
		System.out.println("set = "+set); //위 코드와 출력값 똑같음.
		
		System.out.println("===============================================================================");
		
		set.add("홍길동");
		System.out.println("set = "+set);	
		//홍길동은 값이 같기 때문에 중복저장되지 않는다. 출력시 홍길동은 한번만 출력됨.
		//=> Set 객체에는 동일한 객체가 요소로 중복 저장되지 않는 기능을 제공한다.(=중복저장되지 않는다.)
		
		System.out.println("===============================================================================");
		
		//set.size() : Set 객체에 저장된 요소의 개수를 반환하는 메소드
		System.out.println("요소의 갯수 = "+set.size());
		
		System.out.println("===============================================================================");
		
		//set.reomve() : 매개변수로 전달받아 객체와 동일한 요소를 Set객체에서 삭제하는 메소드
		set.remove("임꺽정");
		System.out.println("set = "+set);
		
		System.out.println("===============================================================================");
		
		//set.iterator() : Set 객체에 저장된 요소를 반복처리 할 수 있는 Iterator 객체를 반환하는 메소드
		//Iterator 객체 : 콜렉션 클래스의 객체요소를 반복처리하기 위한 기능을 제공하는 객체
		//=> "반복 지시자" : 커서(Cursor)를 사용하여 콜렉션 객체의 요소를 반복처리한다.
		Iterator<String> iterator = set.iterator();
		
		//*일괄처리 꼭 해줘야함. 하는 방법은 2가지. Iterator 객체를 직접사용 / 향상된 for문 사용
		//Iterator 객체를 사용하여 Set 객체에 저장된 모든 요소에 대한 *일괄처리*
		//iterator.hasNext() : Iterator 객체로 처리 가능한 요소의 존재유무를 반환하는 메소드
		//=> false 반환 : 처리요소 미존재.   true 반환 : 처리요소 존재.
		while(iterator.hasNext()) {
			//iterator.next() : 커서 위치의 요소(객체)를 반환하는 메소드
			//=> 커서위치의 요소를 반환하고 커서는 다음 요소의 위치로 자동이동한다.
			String str = iterator.next();
			System.out.print(str+" ");
		}
		System.out.println();
		
		System.out.println("===============================================================================");
		
//		요즘은 이렇게 잘 안씀
//		향상된 for문을 사용 多 (but, 둘다 알고있긴 해야함)
//		=> 향상된 for문을 사용하여 Set 객체에 저장된 모든 요소에 대한 일괄처리를 할 수 있다.
//		=> 이유) 향상된 for문을 사용하면 내부적으로 알아서 Iterator 객체를 만들어서 사용하기 때문
		for(String str : set) {
			System.out.print(str+" ");
		}
		System.out.println();
		
		
	}

}
