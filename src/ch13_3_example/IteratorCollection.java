package ch13_3_example;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorCollection {
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Box"); // list는 중복저장이 되지만 set은 중복저장이 안됨
		
		Iterator<String> itr = list.iterator();
		
		
		// 반복자를 이용한 순차적 참조
		while(itr.hasNext()) { // 있냐? 있냐??? 계속 검사함
			System.out.println(itr.next() + ", ");
		}
		
		// 수행을 마치면 다시한번 초기화 하기 
		// ++되어있는 상태기 때문에 초기화를 해야 잘 출력이 된다
		itr = list.iterator();
		
	}

}
