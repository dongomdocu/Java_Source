import java.util.Scanner;

public class TwoNumNineTonine {
	public static void main(String[] args) {
		
		int num1;
		int num2;
		int startNum;
		int indexNum;
		int lastNum;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요");
		num1 = in.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		num2 = in.nextInt();
		in.close();
		
		if(num1 > num2) {
			startNum = num2;
			indexNum = num1-num2;
			lastNum = num2+indexNum;
		}
		else if(num2 > num1) {
			startNum = num1;
			indexNum = num2-num1;
			lastNum = num1+indexNum;
		}
		else {
			startNum = num1;
			lastNum = num1;
		}
		
		for(int i = startNum; i <= lastNum; i++) {
			System.out.print("**" + i + "단**         ");
		}
		System.out.println();

		for(int k = 1; k<=9; k++) {
			for(int j = startNum; j <= lastNum; j++) {
				String dongom = j + " * " + k + " = " + k * j + "   ";
				System.out.printf("%-15s", dongom);
			}
			System.out.println();
		}
	}
}
