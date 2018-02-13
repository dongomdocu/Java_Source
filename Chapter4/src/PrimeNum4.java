import java.awt.Checkbox;
import java.util.Scanner;

public class PrimeNum4 {
	public static void main(String[] args) {
		
		int num1;
		int num2;
		int min;
		int max;
		int lineCheck = 1;
		int primeNumCount = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("첫번쨰 숫자를 입력하세요");
		num1 = in.nextInt();
		System.out.println("두번쨰 숫자를 입력하세요");
		num2 = in.nextInt();
		
		if(num1>num2) {
			min = num2;
			max = num1;
		}
		else {
			min = num1;
			max = num2;
		}
		
//		if(min <= 1) {
//			System.out.println("범위를 1보다 크게 해주세요");
//		}
		
		Outer: for(int i = min; i<=max; i++) {
			if(i-1 < 1) {
				continue Outer;
			}
			else {
				int checkPrimeNum = 0;
				for(int startNum = 2; startNum <= i-1; startNum++) {
					if(i%startNum == 0) {
						checkPrimeNum = 1;
					}
				}
				if(checkPrimeNum ==0) {
					primeNumCount ++;
					if(lineCheck <=9) {
						System.out.printf("%-10d", i);
						lineCheck++;
					}
					else {
						System.out.printf("%-10d", i);
						System.out.println();
						lineCheck = 1;
					}
				}
			}
		}
		System.out.println();
		System.out.println("총소수의 갯수 " + primeNumCount);
	}

}
