import java.util.Scanner;

public class GameEx01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("게스트 : 1~3사이의 숫자 입력(1:가위, 2:바위, 3:보) => ");
		int num1 = in.nextInt();
		int num2 = (int)(Math.random()*3) + 1; 
		
		System.out.println();
		switch(num1) {
			case 1:
				switch(num2) {
					case 1:
						System.out.println("게스트 : " + "가위");
						System.out.println("컴퓨터 : " + "가위");
						System.out.println("결과 : " + "비겼다!!");
						break;
					case 2:
						System.out.println("게스트 : " + "가위");
						System.out.println("컴퓨터 : " + "바위");
						System.out.println("결과 : " + "졌다.ㅠㅠ");
						break;
					case 3:
						System.out.println("게스트 : " + "가위");
						System.out.println("컴퓨터 : " + "보");
						System.out.println("결과 : " + "앗싸! 이겼다!!");
						break;
				}
				break;
			case 2:
				switch(num2) {
					case 1:
						System.out.println("게스트 : " + "바위");
						System.out.println("컴퓨터 : " + "가위");
						System.out.println("결과 : " + "앗싸! 이겼다!!");
						break;
					case 2:
						System.out.println("게스트 : " + "바위");
						System.out.println("컴퓨터 : " + "바위");
						System.out.println("결과 : " + "비겼다.");
						break;
					case 3:
						System.out.println("게스트 : " + "바위");
						System.out.println("컴퓨터 : " + "보");
						System.out.println("결과 : " + "졌다.ㅠㅠ");
						break;
				}
				break;
			case 3:
				switch(num2) {
					case 1:
						System.out.println("게스트 : " + "보");
						System.out.println("컴퓨터 : " + "가위");
						System.out.println("결과 : " + "졌다.ㅠㅠ");
						break;
					case 2:
						System.out.println("게스트 : " + "보");
						System.out.println("컴퓨터 : " + "바위");
						System.out.println("결과 : " + "앗싸! 이겼다!!");
						break;
					case 3:
						System.out.println("게스트 : " + "보");
						System.out.println("컴퓨터 : " + "보");
						System.out.println("결과 : " + "비겼다.");
						break;
				}
				break;
			default:
				System.out.println("입력오류!!!~~~다시 입력하세요!!");
		}
	}
}
