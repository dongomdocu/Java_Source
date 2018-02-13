package Banking;

import java.util.Scanner;

public class BankingMain {
	
	final static int MAXCOUNT = 100; //상수선언 //상수는 모두 대문자로 하는게 관례다
	
	public static void main(String[] args) {
		
		DepositAccount[] objDP = new DepositAccount[MAXCOUNT];
		SavingAccount[] objSA = new SavingAccount[MAXCOUNT];
		Loan[] objLoan = new Loan[MAXCOUNT];
		Scanner in = new Scanner(System.in);
		
		int objDPCnt = 0;
		int objSACnt = 0;
		int LoanCnt = 0;

		int menu;
		boolean mainLogic = true;
		
		while(mainLogic) {
			System.out.println("=================================");
			System.out.println("응용 은행 ATM");
			System.out.println("=================================");
			System.out.println("메뉴를 골라주세요");
			System.out.println("1.예금 2.적금 3.대출 4.종료");
			System.out.println("=================================");
			
			menu = in.nextInt();
			
			switch(menu) {
			case 1 :
				objDP[objDPCnt] = new DepositAccount();
				objDP[objDPCnt].selectMenu();
				break;
			case 2 :
				System.out.println("적금 입니다.");
				break;
			case 3 :
				System.out.println("대출 입니다.");
				break;
			case 4 :
				System.out.println("종료 합니다.");
				mainLogic = false;
				break;
			default : 
				System.out.println("메뉴를 잘못 선택했습니다.");
			}
		}
	}
}
