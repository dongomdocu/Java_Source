import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("첫번째 숫자 입력 = > ");
		int x = in.nextInt();
		System.out.println("두번째 숫자 입력 = > ");
		int y = in.nextInt();
		int result = x + y;
		System.out.println(result); //out.print = 출력후 개행문자 없음, println은 개행문자 있음
		
	}
}
