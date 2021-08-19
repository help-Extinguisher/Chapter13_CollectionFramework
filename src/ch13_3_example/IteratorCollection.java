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
		list.add("Box"); // list�� �ߺ������� ������ set�� �ߺ������� �ȵ�
		
		Iterator<String> itr = list.iterator();
		
		
		// �ݺ��ڸ� �̿��� ������ ����
		while(itr.hasNext()) { // �ֳ�? �ֳ�??? ��� �˻���
			System.out.println(itr.next() + ", ");
		}
		
		// ������ ��ġ�� �ٽ��ѹ� �ʱ�ȭ �ϱ� 
		// ++�Ǿ��ִ� ���±� ������ �ʱ�ȭ�� �ؾ� �� ����� �ȴ�
		itr = list.iterator();
		
	}

}
