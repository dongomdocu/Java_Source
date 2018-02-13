package PanmaeEx02;

import java.util.Scanner;

public class PanmaeEx02 {
	static final int MAX = 10;
	static String format = "%-15s%-15s%-15s%-15s%-15s\n";

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Panmae obj[] = new Panmae[MAX];
		int val;
		
		while(true) {
			menu();
			
			System.out.println();
			System.out.println("메뉴 선택(1~6) => ");
			val = in.nextInt();
			
			if(val == 6) {
				break;
			}
			
			switch(val) {
			case 1:
				input_data(obj);
				break;
			case 2:
				output_data(obj);
				break;
			case 3:
				search_data(obj);
				break;
			case 4:
				update_data(obj);
				break;
			case 5:
				delete_data(obj);
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요!!");
				break;
			}
		}
		in.close();
	}
	
	static void menu() {
		System.out.println("1. 제품정보 입력");
		System.out.println("2. 제품정보 출력");
		System.out.println("3. 제품정보 조회");
		System.out.println("4. 제품정보 수정");
		System.out.println("5. 제품정보 삭제");
		System.out.println("6. 제품정보 종료");
	}
	
	static void input_data(Panmae obj[]) {
		obj[Panmae.cnt] = new Panmae();
		obj[Panmae.cnt].input_data();
		obj[Panmae.cnt].process_data();
		Panmae.cnt++;
		System.out.println("\n제품 입력 성공!!");
		System.out.println();
	}
	
	static void output_data(Panmae obj[]) {
		int i;

		if(Panmae.cnt == 0) {
			System.out.println("\n출력할 데이터가 없습니다.!!");
			return;
		}
		System.out.println("\n\t    *** 제품 판매 현황 ***");
		System.out.println("===================================================================");
		System.out.printf(format, "code", "name", "price", "count", "amount");
		System.out.println("===================================================================");
		for(i=0; i<Panmae.cnt; i++)
			obj[i].output_data();
		System.out.println("===================================================================");
	}
	
	static void search_data(Panmae obj[]) {
		String code = null;
		int i;
		int flag = 0;
		Scanner in = new Scanner(System.in);

		System.out.println("조회할 제품 코드 입력 => ");
		code = in.next();
		
		for (i = 0; i < Panmae.cnt; i++) {
			if(code.equals(obj[i].code)) {
				System.out.println("\n\t    *** 제품 판매 현황 ***");
				System.out.println("===================================================================");
				System.out.printf(format, "code", "name", "price", "count", "amount");
				System.out.println("===================================================================");
				obj[i].output_data();
				System.out.println("===================================================================");
				in.close();
				flag = 1;
				return;
			}
		}
		if(flag == 0) {
			System.out.printf("\n조회할 제품코드 %s 가 존재하지 않습니다.!!\n", code);
		}
		in.close();
	}

	static void update_data(Panmae obj[]) {
		
	}
	static void delete_data(Panmae obj[]) {
		
	}
}
