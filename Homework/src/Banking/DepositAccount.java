package Banking;

import java.util.Scanner;

public class DepositAccount extends CommonField implements Banking {
	
	static Scanner in = new Scanner(System.in);
	
	
	DepositAccount() {
		
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		if(haveAccount) {
			System.out.println("이미 계설된 계좌가 있습니다.");
		}
		else {
			System.out.println("계좌를 개설합니다.");
			System.out.println("이름을 입력해주세요");
			this.name = in.next();
			System.out.println("휴대폰번호를 입력해주세요");
			this.phone = in.next();
			this.haveAccount = true;
		}
	}

	@Override
	public void edit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void withdrawal() {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewBalance() {
		// TODO Auto-generated method stub

	}


	@Override
	public void selectMenu() {
		System.out.println("=================================");
		System.out.println("예금 메뉴 입니다.");
		System.out.println("=================================");
		System.out.println("메뉴를 골라주세요");
		System.out.println("1.입금 2.출금 3.조회 4.종료");
		System.out.println("=================================");
		int menu = in.nextInt();
		switch(menu) {
		case 1 :
			System.out.println("입금 입니다.");
			break;
		case 2 :
			System.out.println("출금 입니다.");
			break;
		case 3 :
			System.out.println("조회 입니다.");
			break;
		case 4 :
			System.out.println("종료 합니다.");
			//mainLogic = false;
			return; //switch 탈출에 return을 쓰는 방법도 있음
		default : 
			System.out.println("메뉴를 잘못 선택했습니다.");
		}
		
	}

}
