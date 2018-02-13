import java.util.Scanner;

public class Exam7 {
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		boolean run = true;
		
		int inputMoney = 0;
		int outputMoney = 0;
		int balance = 0;
		
		while(run) {
			System.out.println("=======================================================");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("=======================================================");
			System.out.print("선택> ");

			
			switch(in.nextInt()) {
			case 1:
				System.out.print("예금액> ");
				inputMoney = in.nextInt();
				balance = balance+inputMoney;
				break;
			case 2:
				System.out.print("출금액> ");
				outputMoney = in.nextInt();
				if(balance-outputMoney < 0) {
					System.out.println("잔고가 모자랍니다.");
				}
				else {
					balance = balance-outputMoney;
				}
				break;
			case 3:
				System.out.println("잔고> " + balance);
				break;
			case 4:
				System.out.println("프로그램 종료");
				run = false;
				break;
			default:
				System.out.println("잘못된 숫자를 입력했습니다.");
			}
		}
	}
}
