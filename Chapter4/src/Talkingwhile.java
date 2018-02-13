public class Talkingwhile {
	public static void main(String[] args) throws Exception {
		

		int i = 0;
		boolean run = true;
		int keyCode = 0;
		int speed = 0;
		
		
		while(run) {
			if(keyCode!=13 && keyCode != 10) {
				System.out.println("-----------------------------");
				System.out.println("1.가속 | 2.감속 | 3.중지");
				System.out.println("-----------------------------");
				System.out.println("선택: ");
			}
				keyCode = System.in.read();
				
				if (keyCode == 49) {
					speed++;
					System.out.println("현재 속도는 : " + speed);
				}
				else if (keyCode == 50) {
					speed--;
					System.out.println("현재 속도는 : " + speed);
				}
				else if (keyCode == 51) {
					run = false;
				}
		}
		System.out.println("끝");
	}
}