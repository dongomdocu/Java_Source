
public class ForExam {
	
	public static void main(String[] args) {
		
		int sum = 0;
		int i;

		String dongom;
		for(i=1; i<=10; i++) {
			System.out.println("i = " + i);
			System.out.println(sum);
			sum+=i; //+=을 보고 복합대입연산자라고 부른다.
		}
		System.out.println(i);
		System.out.println(i-1);
	}
}
