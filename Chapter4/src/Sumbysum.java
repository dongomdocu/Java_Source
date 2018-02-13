
public class Sumbysum {
	public static void main(String[] args) {
		
		int oddNum = 0;
		int evenNum = 0;
		
		for(int indexNum = 1;  indexNum<=100; indexNum+=2) {
			oddNum += indexNum;
		}
		System.out.println("sum oddNum = " + oddNum);
		
		for (int j=0; j <=100; j +=2) {
			evenNum += j;
		}
		System.out.println("sum evenNum = " + evenNum);
//		System.out.println("sum evenNum = " + evenNum);
		
	}

}
