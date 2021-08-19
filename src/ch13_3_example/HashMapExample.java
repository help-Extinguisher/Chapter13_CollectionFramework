package ch13_3_example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		
		/**
		 * [HashMap] implements Map
		 * 
		 * 키(Key)객체, 값(Value)객체로 구성된 Map.Entry 객체를 저장하는 구조.
		 * Entry는 Map인터페이스 내부에 선언된 중첩 인터페이스.
		 * 
		 * 키는 중복저장될수 없지만 값은 중복 저장 가능.
		 */
		
		
		
		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		
		// 객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); // 홍길동 키가 같기 때문에 제일 마지막에 저장한 값으로 대체
		System.out.println("총 Entry 수 : " + map.size());
		
		
		// 객체 찾기
		System.out.println("\t홍길동 : " + map.get("홍길동")); // 이름(키)로 점수(값)을 검색
		System.out.println();
		
		
		// 객체를 하나씩 처리
		Set<String> KeySet = map.keySet();
		Iterator<String> keyIterator = KeySet.iterator();
		// 반복해서 키를 얻고 값을 Map에서 얻어냄
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		
		// 객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수 : " + map.size());
		
		
		// 객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		
		// 객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수 : " + map.size());
		
		
		
		
	}

}
