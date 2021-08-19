package ch13_3_example;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;



//class 





public class LottoGenExample { //로또번호 만들기
	
	
	static final int MAX   = 45;
	static final int COUNT = 6;
	
	
	
	public static void main(String[] args) {
		
		/**
		 * 
		 *  [로또번호 생성기]
		 *  중복저장되지 않는 HashSet을 이용
		 *  
		 **/
		
		
		// 번호의 생성 (무작위) - Math.random()
		// 리턴된 값을 뭐시기에 넣어서 중복검사 시키기
		
		
		Set<Integer> set = new HashSet<>(COUNT);
		
		int n = 0;
		while (set.size() < COUNT) { // set.size - set에 저장되어있는 요소의 길이
			n++;
			set.add((int)(Math.random() * MAX) + 1);
		
		}
		// 작은수부터 나오게 정렬
		List<Integer> lotto = new LinkedList<>(set);
		
		Collections.sort(lotto);
		
		System.out.println(lotto + ", " + n + "회");
		
		
	}

}
