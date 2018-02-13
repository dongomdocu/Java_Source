import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

public class SwitchExam {
	
	public static void main(String[] args) {
//		switchExamWithNoBreak();
		switchExamNoBreak2();
	}
	
	public static void switchExam() {
		Random generator = new Random();
		int num = generator.nextInt(7);

		switch(num) {
		case 1:
			System.out.println("1임");
			break;
		case 2:
			System.out.println("2임");
			break;
		case 3:
			System.out.println("3임");
			break;
		case 4:
			System.out.println("4임");
			break;
		case 5:
			System.out.println("5임");
			break;
		case 6:
			System.out.println("6임");
			break;
		default :
			System.out.println("Random int가 6보다 큽니다.");
		}
	}
	
	public static void switchExamWithNoBreak() {
		Random generator = new Random();
		int num = generator.nextInt(5)+1;
		System.out.println("random result = " + num);

		switch(num) {
		case 1:
			System.out.println("1임");
		case 2:
			System.out.println("2임");
		case 3:
			System.out.println("3임");
		case 4:
			System.out.println("4임");
			break;
		case 5:
			System.out.println("5임");
			break;
		case 6:
			System.out.println("6임");
			break;
		default :
			System.out.println("Random int가 6보다 큽니다.");
		}
	}
	public static void switchExamNoBreak2() {
		System.out.println("char 입력하세요");
		Scanner in = new Scanner(System.in);
		String grade = in.next();
		
		switch(grade){
		case "A":
		case "a":
			System.out.println("grade is " + grade);
			break;
		
		case "B":
			System.out.println("grade is " + grade);
			break;
		case "b":
			System.out.println("grade is " + grade);
			break;
		}
	}
}
