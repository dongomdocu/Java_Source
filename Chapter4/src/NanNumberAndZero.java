import java.util.Scanner;

public class NanNumberAndZero {
	public static void main(String[] args) {
		int min = 0;
		int max = 0;
		int inputNum;
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자를 입력해주세요");
			inputNum = in.nextInt();
			if(inputNum == 0) {
				break;
			}
			else if(inputNum<min) {
				min = inputNum;
			}
			else if(inputNum>max) {
				max = inputNum;
			}

		}
		if(min == 0) {
			System.out.println("입력된 최소값이 없습니다.");
		}
		else {
			System.out.println("최소값 : " + min);
		}
		if(max == 0) {
			System.out.println("입력된 최대값이 없습니다.");
		}
		else {
			System.out.println("최대값 : " + max);
		}

	}
}
