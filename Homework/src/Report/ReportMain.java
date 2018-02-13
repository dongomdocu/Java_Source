package Report;

import java.util.Scanner;

public class ReportMain {
	static int STUDENT_COUNT = 10;
	static String FORMAT = "%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n";
	public static void main(String[] args) {

		int val;
		Scanner in = new Scanner(System.in);
		ReportClass[] obj = new ReportClass[STUDENT_COUNT];

		while(true) {
			menu();
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
	}
	static void menu() {
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 성적 조회");
		System.out.println("4. 성적 수정");
		System.out.println("5. 성적 삭제");
		System.out.println("6. 프로그램 종료");
	}

	static void input_data(ReportClass obj[]) {
		int flag = 0;
		obj[ReportClass.cnt] = new ReportClass();
		obj[ReportClass.cnt].input_data();
		obj[ReportClass.cnt].process_data();

		for(int index_i = 0; index_i<ReportClass.cnt; index_i++) {
			//System.out.println("index / cnt = "+ index_i + ReportClass.cnt);

			if(obj[ReportClass.cnt].number.equals(obj[index_i].number)) {
				flag = 1;
			}
		}
		if(flag == 1) {
			System.out.printf("%s 학번은 이미 존재 합니다.\n", obj[ReportClass.cnt].number);
		}
		else {
			ReportClass.cnt++;
			System.out.println("\n성적 입력 성공!!");
			System.out.println();
		}
	}
	static void output_data(ReportClass obj[]) {
		int i;

		if(ReportClass.cnt == 0) {
			System.out.println("\n출력할 데이터가 없습니다.!!");
			return;
		}
		System.out.println("\n\t    *** 성적 현황 ***");
		System.out.println("=======================================================================================================================");
		System.out.printf(FORMAT, "number","name", "lang", "engl", "math", "sum", "average", "grade");
		System.out.println("=======================================================================================================================");
		for(i=0; i<ReportClass.cnt; i++)
			obj[i].output_data();
		System.out.println("=======================================================================================================================");
	}

	static void search_data(ReportClass obj[]) { 
		String code = null;
		int i;
		int flag = 0;
		Scanner in = new Scanner(System.in);

		System.out.println("조회할 학번 입력 => ");
		code = in.next();

		for (i = 0; i < ReportClass.cnt; i++) {
			if(code.equals(obj[i].number)) {
				if(flag == 0 ) {
					System.out.println("\n\t    *** 성적 현황 ***");
					System.out.println("=======================================================================================================================");
					System.out.printf(FORMAT, "number","name", "lang", "engl", "math", "sum", "average", "grade");
					System.out.println("=======================================================================================================================");
				}
				obj[i].output_data();
				flag = 1;
			}
		}
		if(flag == 0) {
			System.out.printf("\n조회할 학번 %s 가 존재하지 않습니다.!!\n", code);
		}
		else {
			System.out.println("===================================================================");
		}
	}

	static void update_data(ReportClass obj[]) {
		String code = null;
		int i;
		Scanner in = new Scanner(System.in);

		System.out.println("수정할 학생의 학번을 입력 => ");
		code = in.next();

		for (i = 0; i < ReportClass.cnt; i++) {
			if(code.equals(obj[i].number)) {
				System.out.println("언어 성적 입력 => ");
				obj[i].kor = in.nextInt(); 
				System.out.println("영어 성적 입력 => ");
				obj[i].eng = in.nextInt();
				System.out.println("수학 성적 입력 => ");
				obj[i].math = in.nextInt();

				obj[i].process_data();
				return;
			}
		}
		System.out.printf("\n입력한 학번 %s 가 존재하지 않습니다.!!\n", code);
	}
	static void delete_data(ReportClass obj[]) {
		String code = null;
		int i, j;
		Scanner in = new Scanner(System.in);

		System.out.println("삭제할 학번 입력 => ");
		code = in.next();

		for (i = 0; i < ReportClass.cnt; i++) {
			if(code.equals(obj[i].number)) {
				for (j=i+1; j<ReportClass.cnt; i++) {
					obj[j-1] = obj[j];
					obj[j] = null;
					System.out.printf("\n학번 %s 를 삭제 했습니다.\n", code);
					ReportClass.cnt--;
					return;
				}
			}
		}
		System.out.printf("\n삭제할 학번 %s 가 존재하지 않습니다.!!\n", code);
	}

}
