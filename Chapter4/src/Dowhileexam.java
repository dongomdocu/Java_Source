import java.util.Scanner;

public class Dowhileexam {
	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하시려면 q를 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		String inputString = null;
		
		do {
			System.out.print("$> ");
			inputString = scanner.next();
			System.out.println(inputString);
		} while(!inputString.equals("q"));
	}
}
