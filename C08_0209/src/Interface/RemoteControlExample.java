package Interface;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);

		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
	}

}
