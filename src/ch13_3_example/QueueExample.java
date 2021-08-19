package ch13_3_example;

import java.util.LinkedList;
import java.util.Queue;

class Message {
	public String command;
	public String to;
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}


public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail", "홍길동"));       //
		messageQueue.offer(new Message("sendSMS", "신용권"));        // 메시지 저장
		messageQueue.offer(new Message("sendKakaotalk", "홍두께"));  //
		
		
		
		while(!messageQueue.isEmpty()) { // 메시지 큐가 비었는지 확인
			Message message = messageQueue.poll(); // 메시지 큐에서 1개 꺼냄
			switch(message.command) {
			case "sendMail" :
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
				
			case "sendSMS" : 
				System.out.println(message.to + "님에게 SMS을 보냅니다.");
				break;
				
			case "sendKakaotalk" :
				System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
				break;
			}
		}
	}

}
