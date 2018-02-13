
public class DiceExam {
	
	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1;
		System.out.println(num);
		
		if(num == 1) {
			System.out.println("1나옴");
		}
		else if(num == 2) {
			System.out.println("2나옴");
		}
		else if(num == 3) {
			System.out.println("3나옴");
		}
		else if(num == 4) {
			System.out.println("4나옴");
		}
		else if(num == 5) {
			System.out.println("5나옴");
		}
		else if(num == 6) {
			System.out.println("6나옴");
		}
	}

}