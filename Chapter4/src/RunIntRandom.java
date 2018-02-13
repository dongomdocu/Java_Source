import java.util.Random;

public class RunIntRandom {
	
	public static void main(String[] args) {
		
		Random generator = new Random();
		
		int num = generator.nextInt(11);
		
		System.out.println(num);
		
	}

}
