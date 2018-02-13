package Polymo_Array;

public class InheritanceExample6 {
	public static void main(String[] args) {
		MessageSender arr[] = new MessageSender[3];
		
		arr[0] = new MessageSender("aaa",  "bbb");
		arr[1] = new EMailSender("생일을 축하합니다.", "고객센터", "admin@naver.com", "10%할인 쿠폰이 발행됐습니다.");
		arr[2] = new SMSSender("생일을 축하합니다.", "고객센터", "sms샌더02-000-0000", "10% 할인쿠폰이 발행됐습니다.");
		
		send(arr, "test");
	}
	
	static void send(MessageSender obj[], String str) {
		for (int i = 0; i<obj.length; i++) {
			obj[i].sendMessage(str);
		}
	}

}
