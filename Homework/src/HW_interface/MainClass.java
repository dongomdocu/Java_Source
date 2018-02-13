package HW_interface;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class MainClass {
	final static int MAX_COUNT = 100;
	
	public static void main(String[] args) {
		
		int sungJunCnt = 0;
		int personCnt = 0;
		Personable[] sungJukArr = new Personable[MAX_COUNT]; //인터페이스 접근 완료
		Personable[] personArr = new Personable[MAX_COUNT]; //인터페이스 접근 완료

		Scanner in = new Scanner(System.in);
		
		for (int i = 0; i < MAX_COUNT; i++) {
			String hakbun = null;
			String irum = null;
			System.out.println("### 성적 입력 ###");
			System.out.println("학번 입력");
			hakbun = in.next();
			if(hakbun.equals("exit")) {
				break;
			}
			System.out.println("이름 입력");
			irum = in.next();
			sungJukArr[i] = new Sungjuk(hakbun, irum);
			sungJukArr[i].input();
			sungJunCnt ++;
			
		}
		for (int i = 0; i < MAX_COUNT; i++) {
			String hakbun = null;
			String irum = null;
			System.out.println("### 개인정보 입력 ###");
			System.out.println("학번 입력");
			hakbun = in.next();
			if(hakbun.equals("exit")) {
				break;
			}
			System.out.println("이름 입력");
			irum = in.next();
			personArr[i] = new PersonInfo(hakbun, irum);
			personArr[i].input();
			personCnt ++;
			
		}
		if(sungJunCnt == 0) {
			System.out.println("입력한 성적 데이터가 없습니다.");
		}
		else {
			Sungjuk.printFormat();
			printData(sungJukArr, sungJunCnt);
			System.out.println("=======================================================================================================================");		
			
		}
		if(personCnt == 0) {
			System.out.println("입력한 개인정보 데이터가 없습니다.");
		}
		else {
			PersonInfo.printFormat();
			printData(personArr, personCnt);
			System.out.println("==============================================================");
		}
	}
		
	static void printData(Personable arr[], int cnt) {
		for(int i = 0; i < cnt; i++) {
			arr[i].output();
		}
	}
}