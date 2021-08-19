package ch13_3_example;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {
	public static void main(String[] args) {
		/**
		 * [Hashtable] implements Map
		 * 
		 * HashMap�� ������ ���α����� ������ �ִ�.
		 * 	����ȭ(synchronized)�� �޼ҵ�� ����.
		 * 	�ϳ��� �����尡 ���� �Ϸᰡ �Ǿ�߸� �ٸ� �����忡 ���ٰ����ϴ�.
		 */
		
		
		Map<String, String> map = new Hashtable<String, String>();
		
		// ���̵�� ��й�ȣ�� �̸� ����
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		// Ű����κ��� �Էµ� ������ �ޱ����� ����
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���.");
			System.out.println("���̵� : ");
			String id = scanner.nextLine(); // Ű����� �Է��� ���̵� ����
			
			System.out.println("��й�ȣ : ");
			String password = scanner.nextLine();
			System.out.println();
			
			if (map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("�α��� �Ǿ����ϴ�.");
					break;
				} else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			} else {
				System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�");
			}
		}
		
		
	}

}