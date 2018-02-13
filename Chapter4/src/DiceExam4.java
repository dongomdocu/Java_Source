
public class DiceExam4 {
	public static void main(String[] args) {
		boolean run = true;
		int count = 1;
		int escapeNum = 5;
		
//		System.out.println(num1);
//		System.out.println(num2);
		
		while(run) {
			int num1 = (int)(Math.random()*6)+1;
			int num2 = (int)(Math.random()*6)+1;
			System.out.printf("count : %d (%d, %d)\n", count, num1, num2);
			if(num1 + num2 == escapeNum) {
				run = false;
			}
			count++;
		}
	}
}