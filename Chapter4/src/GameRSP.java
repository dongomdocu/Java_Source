import java.util.Random;
import java.util.Scanner;

public class GameRSP {
	public static void main(String args[]) {
		
		int playerCard;
		int comsCard;
		
		System.out.println("숫자를 입력해주세요. 가위! 바위! 보! (1:가위, 2:바위, 3:보)");
		System.out.print("=> ");

		Scanner in = new Scanner(System.in);//System class에 in field를 인자로 넣으면 발생하는 현상???
		playerCard = in.nextInt(); // int만 들어가게 예외처리가 필요함
		in.close();
		
		comsCard = getComsCard();

		switch(playerCard) {
		case 1 :
			System.out.println("플레이어 : 가위");
			switch (comsCard) {
			case 1:
				System.out.println("컴퓨터 : 가위");
				System.out.println("결과 : 비겼습니다.");
				break;
			case 2:
				System.out.println("컴퓨터 : 바위");
				System.out.println("결과 : 졌습니다.");
				break;
			case 3:
				System.out.println("컴퓨터 : 보");
				System.out.println("결과 : 이겼습니다.");
				break;
			}
			break;
		case 2 :
			System.out.println("플레이어 : 바위");
			switch (comsCard) {
			case 1:
				System.out.println("컴퓨터 : 가위");
				System.out.println("결과 : 이겼습니다.");
				break;
			case 2:
				System.out.println("컴퓨터 : 바위");
				System.out.println("결과 : 비겼습니다.");
				break;
			case 3:
				System.out.println("컴퓨터 : 보");
				System.out.println("결과 : 졌습니다."); 
				break;
			}
			break;
		case 3 :
			System.out.println("플레이어 : 보");
			switch (comsCard) {
			case 1:
				System.out.println("컴퓨터 : 가위");
				System.out.println("결과 : 졌습니다.");
				break;
			case 2:
				System.out.println("컴퓨터 : 바위");
				System.out.println("결과 : 이겼습니다.");
				break;
			case 3:
				System.out.println("컴퓨터 : 보");
				System.out.println("결과 : 비겼습니다.");
				break;
			}
			break;
		default :
			System.out.println("잘못된 숫자를 입력했습니다.");
			System.out.println("[Help]  1:가위, 2:바위, 3:보");
			break;
		
		}
	}
	
	public static int getComsCard() {
		Random generator = new Random();
		int comsCard = generator.nextInt(3)+1; //next int = 0~(x-1)
		return comsCard;
	}

}
