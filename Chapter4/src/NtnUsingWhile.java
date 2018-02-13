import java.util.Scanner;

public class NtnUsingWhile {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num1;
		int num2;
		int min;
		int max;
		
		System.out.println("첫번째 숫자를 입력하세요");
		num1 = in.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		num2 = in.nextInt();
		in.close();
		
		if(num1>num2) {
			min = num2;
			max = num1;
		}
		else {
			min = num1;
			max = num2;
		}
		
		int i = min;
		int j = min;
		while(j<=max) {
			System.out.print("**" + j + "단**         ");
			j++;
		}
		System.out.println();
		
		int k = 1;
		int l;
		while(k<=9) {
			l = min;
			while(l<=max) {
				String dongom = l + " * " + k + " = " + l * k + "   ";
				System.out.printf("%-15s", dongom);
				l+=1;
			}
			k++;
			System.out.println();
		}
	}

}
