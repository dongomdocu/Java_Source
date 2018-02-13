import java.util.Scanner;

public class NineToNine {
	public static void main(String[] args) {
		
		int inNum;
		
		Scanner in = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.\n=>");
		
		inNum = in.nextInt();
		in.close();

		for(int i=1; i<=9; i++) {
			System.out.println(inNum + " * " + i + " = " + inNum * i);
		}
		
		int j = 1;
		for( ; ; ) {
			if( j>=10) {
				break;
			}
			System.out.println(inNum + " * " + j + " = " + inNum * j);
			j++;
		}
		
		for(int k =2; k>=9; k++) {
			for(int l = 1; l>=9; l++) {
				System.out.println(inNum + " * " + k + " = " + inNum * k);
			}
		}
	}
}