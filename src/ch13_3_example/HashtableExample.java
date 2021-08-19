package ch13_3_example;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {
	public static void main(String[] args) {
		/**
		 * [Hashtable] implements Map
		 * 
		 * HashMap과 동일한 내부구조를 가지고 있다.
		 * 	동기화(synchronized)된 메소드로 구성.
		 * 	하나의 스레드가 실행 완료가 되어야만 다른 스레드에 접근가능하다.
		 */
		
		
		Map<String, String> map = new Hashtable<String, String>();
		
		// 아이디와 비밀번호를 미리 저장
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		// 키보드로부터 입력된 내용을 받기위해 생성
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.println("아이디 : ");
			String id = scanner.nextLine(); // 키보드로 입력한 아이디를 읽음
			
			System.out.println("비밀번호 : ");
			String password = scanner.nextLine();
			System.out.println();
			
			if (map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("로그인 되었습니다.");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			} else {
				System.out.println("입력하신 아이디가 존재하지 않습니다");
			}
		}
		
		
	}

}
