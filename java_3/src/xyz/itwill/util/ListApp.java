package xyz.itwill.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//List 인터페이스를 상속받은 콜렉션 클래스 - ArrayList(동기화X), Vector(동기화O), LinkedList 등
//(장점) List 객체는 요소를 차례대로 저장(= *순서가 존재한다.*)
//=> 첨자(index. 0부터 1씩 증가)를 이용하여 요소를 구분해 처리가능.(요소에 접근해 처리가능)
//다중스레드를 사용할때는 Vector를 쓰는게 좋지만, 웹은 다중스레드가 크게 필요가 없어서 속도가 더 빠른 ArrayList를 더 많이 사용함.
//(단점) List 객체에 저장된 요소를 검색하는 속도가 느림(비효율적).

public class ListApp {
	public static void main(String[] args) {
		
		//ArrayList
		List<String> list = new ArrayList<String>();
		
		//List.add(E element) : List 객체에 요소를 추가하는 메소드
		//=> List 객체에 요소가 차례대로 저장됨. 요소에 순서가 있음.(Set 인터페이스과 다름)
		list.add("홍길동");
		list.add("임꺽정");
		list.add("전우치");
		list.add("일지매");
		
		//list.toString() : List 객체에 저장된 모든 요소(객체)를 문자열로 변환하여 반환하는 메소드
		System.out.println("list.toString() = "+list.toString());
		System.out.println("list = "+list);
		
		System.out.println("========================================================================");

		list.add("임꺽정");
		System.out.println("list = "+list);
		//동일한 객체를 다시 저장했더니 저장됨!(Set인터페이스와 다름)
		
		System.out.println("========================================================================");
		
		//List.size() : List 객체에 저장된 요소의 갯수를 반환하는 메소드
		System.out.println("요소의 갯수 = "+list.size());
	
		System.out.println("========================================================================");
		
		//*List.get(int index) : List 객체에서 index 위치에 저장된 요소값(객체)을 반환하는 메소드
		System.out.println("3번째 위치에 저장된 문자열 = "+list.get(2));
		//Set 인터페이스에는 없음. 얘는 순서가 있으니까.
		
		System.out.println("========================================================================");
		
		//*List.add(int index, E element) : List 객체에서 index 위치에 요소를 삽입하는 메소드 
		//=> 원하는 위치에 삽입 가능.
		list.add(4, "장길산");	//5번째 위치에 장길산을 삽입해라.
		System.out.println("list = "+list);
		
		System.out.println("========================================================================");
		
		//List.remove(E element) : 매개변수로 전달받은 객체와 동일한 요소를 List 객체에서 삭제하는 메소드 - 첫번째로 검색된 요소만 삭제함.
//		list.remove("임꺽정");
//		System.out.println("list = "+list);
		
		//List.remove(int index) : 
		list.remove(5);
		System.out.println("list = "+list);
		
		System.out.println("========================================================================");

		//List.set(int index, E element) : List 객체에서 index 위치의 요소값(객체)를 변경하는 메소드
		list.set(1, "임걱정");
		System.out.println("list = "+list);
		
		System.out.println("========================================================================");
		
		//List 객체에 저장된 모든 요소에 대한 일괄처리① - 일반 for 구문 이용
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i)+" ");
		}
		
		System.out.println();
		
		System.out.println("========================================================================");
		
		//List 객체에 저장된 모든 요소에 대한 일괄처리② - Iterator 객체 사용
		//List.iterator() : List 객체에 저장된 요소를 반복 처리할 수 있는 Iterator 객체를 반환하는 메소드
		Iterator<String> iterator=list.iterator();
				
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
		
		System.out.println("========================================================================");
	
		//List 객체에 저장된 모든 요소에 대한 일괄처리③ - 향상된 for 구문 사용
		for(String str : list) {
			System.out.print(str+" ");
		}
		System.out.println();
		
		System.out.println("========================================================================");
		
		//Collections.sort(List list) : 매개변수로 전달받은 List 객체의 요소를 정렬하는 메소드
		//Collections 클래스 : List 객체의 요소를 관리하기 위한 기능의 메소드를 제공하는 클래스.
		Collections.sort(list);
		
		//List.clear() : List 객체에 저장된 모든 요소를 삭제하여 초기화 처리하는 메소드
		list.clear();
		
		
		//List.isEmpty() : List 객체에 요소가 저장되어 있는 경우 [false]를 반환하고 List 객체에 저장된 요소가 없는 경우 [true]를 반환하는 메소드
		if(list.isEmpty()) { 	//  if(list.size()==0){ } 이라고 해도 출력은 똑같이 됨.
			System.out.println("List 객체에 저장된 요소가 하나도 없습니다.");
		}
		
		System.out.println("========================================================================");

		//Arrays.asList(E...element) : 매개변수로 전달받은 0개 이상의 요소가 저장된 List 객체를 생성하여 반환하는 메소드
		List<Integer> numberList=Arrays.asList(10,20,30,40,50);
		System.out.println("numberList = "+numberList);

		System.out.println("========================================================================");

		
		
	}

}
