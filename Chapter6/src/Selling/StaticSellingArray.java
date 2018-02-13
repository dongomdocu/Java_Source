package Selling;

import java.util.Scanner;

public class StaticSellingArray {
	String code, name;
	int price, count, amount;
	
	static double total_price = 0;
	
	static int printAge() {
		int age = 28;
		return age;
	}
	
	int input_data() {
		Scanner in = new Scanner(System.in);
		System.out.println("코드를 입력하세요");
		this.code = in.next();
		if(code.equals("exit")) {
			return 1;
		}
		System.out.println("이름를 입력하세요");
		this.name = in.next();
		System.out.println("단가를 입력하세요");
		this.price = in.nextInt();
		System.out.println("수량를 입력하세요");
		this.count = in.nextInt();
		return 0;
	}
	
	void process_data() {
		this.amount = this.price * this.count;
		total_price = this.amount + total_price;
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
		System.out.printf(format, code, name, price, count, amount);
	}
}
