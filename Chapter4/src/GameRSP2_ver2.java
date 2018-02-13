import java.util.Random;
import java.util.Scanner;

public class GameRSP2_ver2 {
	public static void main(String args[]) {
		
		int comsCard;
		int playerCard;
		int result;//0 = 이김 , 1 = 비김, 2= 짐 3 = 숫자를 잘못입력했습니다.
		
		
		
		System.out.println("숫자를 입력해주세요. 가위! 바위! 보! (1:가위, 2:바위, 3:보)");
		System.out.print("=> ");
		Scanner in = new Scanner(System.in);
		playerCard = in.nextInt();
		in.close();
		
		comsCard = comsCard();

		switch(playerCard) {
		case 1 :
			System.out.println("플레이어 : 가위");
			switch (comsCard) {
			case 1:
				System.out.println();
				result = 1;
				break;
			case 2:
				result = 2;
				break;
			case 3:
				result = 0;
				break;
			}

			break;
		case 2 :
			System.out.println("플레이어 : 바위");
			switch (comsCard) {
			case 1:
				result = 0;
				break;
			case 2:
				result = 1;
				break;
			case 3:
				result = 2;
				break;
			}
			break;
		case 3 :
			System.out.println("플레이어 : 보");
			switch (comsCard) {
			case 1:
				result = 2;
				break;
			case 2:
				result = 0;
				break;
			case 3:
				result = 1;
				break;
			}
			break;
		default :
			System.out.println("잘못된 숫자를 입력했습니다.");
			result = 3;
			break;
		
		}
	}
	
	public static int comsCard() {
		Random generator = new Random();
		int num = generator.nextInt(3)+1;
		return num;
	}

}
