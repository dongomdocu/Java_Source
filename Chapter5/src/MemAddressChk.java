public class MemAddressChk {
	public static void main(String[] args) {
		String str1 = "안녕";
		String str2 = "안녕";
		
		boolean res1 = str1 == str2;
		System.out.println(res1);
		
		String str3 = new String("자바");
		String str4 = new String("자바");
		boolean res2 = str3 == str4;
		System.out.println(res2);
		boolean res3 = str3.equals(str4);
		System.out.println(res3);
		
		
	}
}
