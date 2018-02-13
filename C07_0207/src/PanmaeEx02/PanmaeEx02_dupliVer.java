package PanmaeEx02;

import java.util.Scanner;

public class PanmaeEx02_dupliVer {
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
		System.out.println("종료한다.");
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
	
	static void search_data(Panmae obj[]) { //제품 코드가 중복이 없는경우 -> 있는 경우로 소스를 고쳐봤다.
		String code = null;
		int i;
		int flag = 0;
		Scanner in = new Scanner(System.in);

		System.out.println("조회할 제품 코드 입력 => ");
		code = in.next();
		
		for (i = 0; i < Panmae.cnt; i++) {
			if(code.equals(obj[i].code)) {
				if(flag == 0 ) {
					System.out.println("\n\t    *** 제품 판매 현황 ***");
					System.out.println("===================================================================");
					System.out.printf(format, "code", "name", "price", "count", "amount");
					System.out.println("===================================================================");
				}
				obj[i].output_data();
				flag = 1;
			}
		}
		if(flag == 0) {
			System.out.printf("\n조회할 제품코드 %s 가 존재하지 않습니다.!!\n", code);
		}
		else {
			System.out.println("===================================================================");
		}
	}

	static void update_data(Panmae obj[]) {
		String code = null;
		int i;
		Scanner in = new Scanner(System.in);

		System.out.println("수정할 제품 코드 입력 => ");
		code = in.next();
		
		for (i = 0; i < Panmae.cnt; i++) {
			if(code.equals(obj[i].code)) {
				System.out.println("제품 단가 입력 => ");
				obj[i].price = in.nextInt(); 
				System.out.println("제품 수량 입력 => ");
				obj[i].count = in.nextInt();

				obj[i].process_data();
				return;
			}
		}
		System.out.printf("\n수정할 제품코드 %s 가 존재하지 않습니다.!!\n", code);
	}

	static void delete_data(Panmae obj[]) {
		String code = null;
		int i, j;
		Scanner in = new Scanner(System.in);

		System.out.println("삭제할 제품 코드 입력 => ");
		code = in.next();
		
		for (i = 0; i < Panmae.cnt; i++) {
			if(code.equals(obj[i].code)) {
				for (j=i+1; j<Panmae.cnt; i++) {//삭제한 데이터의 주소 위치에 후속 데이터의 주소 저장
					obj[j-1] = obj[j];
					System.out.printf("\n제품코드 %s 를 삭제 했습니다.\n", code);
					Panmae.cnt--; //삭제후 총 데이터 갯수 1 감소
					return;
				}

				
			}
		}
		System.out.printf("\n삭제할 제품코드 %s 가 존재하지 않습니다.!!\n", code);
		
	}
}
