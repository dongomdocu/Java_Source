public class InheritanceExample6 {
	public static void main(String[] args) {
		MessageSender arr[] = new MessageSender[2]; //이건 배열을 만드는 new지 MessageSender class를 객체로 만드는것은 아니다
		arr[0] = new EMailSender("생일을 축하합니다.", "고객센터", "이메일샌더@naver.com", "10%할인 쿠폰이 발행됐습니다."); 
		arr[1] = new SMSSender("생일을 축하합니다.", "고객센터", "이메일샌더@naver.com", "10%할인 쿠폰이 발행됐습니다."); 
		
		send(arr, "test");
	}
	
	static void send(MessageSender obj[], String str) { 
		for (int i = 0; i < obj.length; i++) { //상속을 통해서 여러개의 객체를 짧은 문장, 하나의 객체로 접근 할 수 있다. 
			obj[i].sendMessage(str);
			obj[i].printMessage();
		}
	}

}
