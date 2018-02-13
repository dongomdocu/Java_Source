package InnerClass;

public class NestedClassExample8 {
	public static void main(String[] args) {
		/*class SatelliteSender implements MessageSender {//이너 클래스 예시
			public void send(String message) {
				System.out.println("발신: 마이다스");
				System.out.println("수신 : 빌 게이츠");
				System.out.println("메세지: " + message);
				System.out.println();
			}
			}

		}*/
		//SatelliteSender obj = new SatelliteSender();

		MessageSender obj = new MessageSender() { //익명구현 객체 예시
			public void send(String message) {
				System.out.println("발신: 마이다스");
				System.out.println("수신 : 빌 게이츠");
				System.out.println("메세지: " + message);
				System.out.println();
			}
		};
		obj.send("굿 모닝");
	}
}
