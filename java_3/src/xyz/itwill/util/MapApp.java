package xyz.itwill.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//Map 인터페이스를 상속받은 콜렉션 클래스 - *HashMap(동기화X), Hashtable(동기화0), *Properties 등
//=> 이름(Key)과 객체(Value)을 하나의 그룹으로 묶어 Map 객체에 저장하여 관리할 수 있도록 한다.
//=> 엔트리(Entry) : Map 객체에 이름과 객체를 하나로 "묶어 저장"하기 위한 단위
//(장점) 이름을 이용하여 객체를 빠르게 검색하여 제공하기 위한 콜렉션 클래스
//일괄처리가 목적이 아님. 단지 키를 통해 value를 빠르게 찾기 위한 목적
//순서가 없기 때문에 일괄처리를 해주려면 iterator 해줘야함.


public class MapApp {
	public static void main(String[] args) {
		
		//이름(K;Key)과 저장 객체(V;Value)에 대한 제네릭 타입 2개에 자료형을 전달하여 객체를 생성한다. 
		Map<String, String> map = new HashMap<String, String>(); 
		
		//Map.put(K key, V value) : Map 객체에 엔트리를 추가하는 메소드 (여기는add가 아니라 put 써야함!)
		//=> Map 객체에 저장되는 엔트리는 이름(Key)을 Set 객체로 저장(내부적으로) 
		//-> Key(이름)은 절대 중복되어 저장되지 않는다!(중복되면 내가 원하는 값을 찾을 수 없으니까. key는 내가 원하는 값을 찾으려고 있는것.)
		//-> 객체는 중복 가능
		map.put("1000", "홍길동");
		map.put("2000", "임꺽정");
		map.put("3000", "전우치");
		map.put("4000", "일지매");
		map.put("5000", "장길산");
		
		System.out.println("map.toString = "+map.toString());
		System.out.println("map = "+map); //toString 생략 가능.
		//출력시, 순서 없음. (key가 Set이기 때문에).
		//but, 핵심은 Key를 이용해 value를 빠르게 찾을 수 있는 것!(검색속도의 빠르기) 순서 중요X
		
		System.out.println("=========================================================================");
		
		//Map.put(K key, V value) 메소드 호출시 이름(Key)이 중복되면 해당이름의 엔트리의 객체(Value)를 변경하여 저장한다.
		//따로 변경메소드가 없음.
		//=> put은 저장과 변경 두가지 역할 모두 가능.
		map.put("2000", "임걱정");
		//출력시, 임꺽정이 임걱정으로 변경되어 출력도미.
		
		System.out.println("=========================================================================");
		
		//Map.remove(K key) : Map 객체에 저장된 엔트리에서 매개변수로 전달받은 이름(Key)에 대한 엔트리를 검색하여 삭제하는 메소드
		map.remove("4000");
		System.out.println("map = "+map);
		//출력시, key 4000의 일지매가 삭제됨.
		
		System.out.println("=========================================================================");
		
		//Map.get(K key) : Map 객체에 저장된 엔트리에서 매개변수로 전달받은 이름(Key)에 대한 엔트리를 검색하여 엔트리의 객체를 반환하는 메소드
		//=> 이름(Key)에 대한 엔트리가 없는 경우 null 반환
		String name = map.get("1000");
		System.out.println("name = "+name);
		
		System.out.println("=========================================================================");
		
		//map.keySet() : Map 객체에 저장된 모든 엔트리의 이름(Key)을 Set객체로 반환하는 메소드
		Iterator<String> iteratorKey = map.keySet().iterator();	
		
		//Map.values() : Map 객체에 저장된 모든 엔트리의 객체(Value)을 Collection 객체(List 객체)로 반환하는 메소드
		Iterator<String> iteratorValue = map.values().iterator();
		
		//방법1
		while(iteratorKey.hasNext()) {
			String key = iteratorKey.next();	//key를 먼저 뽑아내고
			String value = map.get(key);//key를 이용해 value를 찾기
			System.out.println(key+" = "+value);
		}
		
		//방법2
		for(String key : map.keySet()) {
			System.out.println(key+" = "+map.keySet());
		}
		
		System.out.println("=========================================================================");
		

		
		
	}

}
