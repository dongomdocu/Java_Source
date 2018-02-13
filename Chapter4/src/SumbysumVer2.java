
public class SumbysumVer2 {
	public static void main(String[] args) {
		
		int oddNum = 0;
		int evenNum = 0;
		
		for(int indexNum = 1;  indexNum<=100; indexNum++) {
			if(indexNum%2 == 1) {
				oddNum += indexNum;
			}
			else {
				evenNum += indexNum;
			}
		}
		System.out.println("sum oddNum = " + oddNum);
		System.out.println("sum evenNum = " + evenNum);
		
	}

}
