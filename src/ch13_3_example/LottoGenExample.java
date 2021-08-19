package ch13_3_example;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;



//class 





public class LottoGenExample { //�ζǹ�ȣ �����
	
	
	static final int MAX   = 45;
	static final int COUNT = 6;
	
	
	
	public static void main(String[] args) {
		
		/**
		 * 
		 *  [�ζǹ�ȣ ������]
		 *  �ߺ�������� �ʴ� HashSet�� �̿�
		 *  
		 **/
		
		
		// ��ȣ�� ���� (������) - Math.random()
		// ���ϵ� ���� ���ñ⿡ �־ �ߺ��˻� ��Ű��
		
		
		Set<Integer> set = new HashSet<>(COUNT);
		
		int n = 0;
		while (set.size() < COUNT) { // set.size - set�� ����Ǿ��ִ� ����� ����
			n++;
			set.add((int)(Math.random() * MAX) + 1);
		
		}
		// ���������� ������ ����
		List<Integer> lotto = new LinkedList<>(set);
		
		Collections.sort(lotto);
		
		System.out.println(lotto + ", " + n + "ȸ");
		
		
	}

}
