
public class CellPhone {
	String model;
	String color;
	
	//생성자
	//아래 생성자를 추가했을때 자식 class에서 에러가 났다.
	//이때 자식 class에는 default super 밖에 없었다.
	//super가 부모 클래스에서 디폴트 생성자를 찾으러 가려 했으나 여기엔 디폴트 생성자가 없다.
	//해결 방법은 아래 생성자에 맞는 모양으로 super에 인자를 넣어주는게 1번
	//아니면 디폴트 생성자를 생성해주는것도 방법이다.
	public CellPhone() {
		
	}
	public CellPhone(String model, String color) { 
		this.model = model;
		this.color = model;
	}
	
	//메소드
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	void sendVoice(String message) {
		System.out.println("자기: " + message);
	}
	
	void receiveVoice(String message) {
		System.out.println("상대방: " + message);
	}
	
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}

}
