
public class ContinueExam {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			if(i%2 != 0 ) {
				continue;
			}
		}
	}

}
