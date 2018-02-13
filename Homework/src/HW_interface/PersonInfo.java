package HW_interface;

import java.util.Scanner;

public class PersonInfo extends Person implements Personable {
	
	String phone;
	String addr;
	
	
	PersonInfo(String hakbun, String irum){
		super(hakbun, irum);
	}

	@Override
	public void input() {
		Scanner in = new Scanner(System.in);
		System.out.println("전화 번호를 입력하세요");
		this.phone = in.next();
		System.out.println("주소를 입력하세요");
		this.addr = in.next();

	}

	@Override
	public void output() {
		/*System.out.println("학번" + hakbun);
		System.out.println("이름" + irum);
		System.out.println(this.phone);
		System.out.println(this.addr);*/
		System.out.printf("%-15s%-15s%-15s%-15s\n", this.hakbun, this.irum, this.phone, this.addr);

	}
	static void printFormat() {
		String format = "%-15s%-15s%-15s%-15s\n";
		System.out.println("\t\t\t*** 개인 정보 ***");
		System.out.println("==============================================================");
		System.out.printf(format, "hakbun","irum", "phone", "addr");
		System.out.println("==============================================================");
		
	}

}
