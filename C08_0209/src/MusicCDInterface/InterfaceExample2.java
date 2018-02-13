package MusicCDInterface;

public class InterfaceExample2 {
	public static void main(String args[]) {
		Lendable arr[] = new Lendable[2];
		arr[0] = new SeparatedVolume("609.2",  "서양미술사",  "곰브리치");
		arr[1] = new AppCDInfo("02-17", "XML을 위한 자바 프로그래밍") ;
		checkOutALL(arr, "윤지혜", "20060315");
		
	}
	static void checkOutALL(Lendable arr[], String borrower, String date) {
		for (int cnt = 0; cnt < arr.length; cnt++)
			arr[cnt].checkOut(borrower, date);
	}
}