package Polymo_;

public class MessageSender {
	String title;
	String senderName;
	
	MessageSender(String title, String senderName) {
		this.title = title;
		this.senderName = senderName;
	}
	
	void sendMessage(String recipient) {
		System.out.println("메세지 전송");
	}
	
	void printMessage() {
		System.out.println("메시지 출력");
	}
	
	

}
