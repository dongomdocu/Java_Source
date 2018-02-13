package Selling;

import java.util.Scanner;

public class Selling {
	String code, name;
	int price, count, amount;
	
	void input_data() {
		Scanner in = new Scanner(System.in);
		System.out.println("코드를 입력하세요");
		this.code = in.next();
		System.out.println("이름를 입력하세요");
		this.name = in.next();
		System.out.println("단가를 입력하세요");
		this.price = in.nextInt();
		System.out.println("수량를 입력하세요");
		this.count = in.nextInt();
	}
	
	void process_data() {
		this.amount = this.price * this.count;
	}
	void output_data() {
		System.out.println("코드 : " + code);
		System.out.println("이름 : " + name);
		System.out.println("단가 : " + price);
		System.out.println("수량 : " + count);
		System.out.println("금액 : " + amount);
	}
	
	void output_data_Form() {
		String format = "%-15s%-15s%-15s%-15s%-15s\n";
		System.out.println("\t\t\t\t\t\t\t*** 영수증 ***");
		System.out.println("=======================================================================================================================");
		System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", "코드", "이름", "단가", "수량", "금액");
		System.out.println("=======================================================================================================================");
		System.out.printf(format, code, name, price, count, amount);
		System.out.println("=======================================================================================================================");

	}


}
