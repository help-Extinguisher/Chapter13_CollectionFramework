package ch13_3_example;

import java.util.Stack;

class Coin {
	private int value;
	
	public Coin(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}

public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(100));			//
		coinBox.push(new Coin(50));             // 동전 끼우기
		coinBox.push(new Coin(500));			//
		coinBox.push(new Coin(10));				//
		
		
		while(!coinBox.isEmpty()) { // 동전케이스가 비었는지 확인
			Coin coin = coinBox.pop(); // 동전케이스에서 제일위의 동전을 꺼냄
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}
		
	}
	

}
