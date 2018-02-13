package Polymo_;

public class InheritanceExample6 {
	public static void main(String[] args) {
		MessageSender obj = new MessageSender("aaa", "bbb");
		EMailSender obj1 = new EMailSender("생일을 축하합니다.", "고객센터", "이메일샌더@naver.com", "10%할인 쿠폰이 발행됐습니다.");
		SMSSender obj2 = new SMSSender("생일을 축하합니다.", "고객센터", "sms샌더02-000-0000", "10% 할인쿠폰이 발행됐습니다.");
		
		send(obj1, "dongom@naver.com");
		send(obj2, "010-000-0000");
		
		obj = obj1;
		System.out.println(obj instanceof EMailSender); //원형이 부모타입인 애를 자식으로 케스팅할 수는 없어
		obj1 = (EMailSender)obj;
		
	}
	
	static void send(MessageSender obj, String str) {
		obj.sendMessage(str);
	}

}
