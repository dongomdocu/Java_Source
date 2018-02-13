package HW_interface_teacher;

public class InterfaceMain {

	static final int MAX = 100;

	public static void main(String[] args) {

		// 인터페이스에서 process메소드를 접근 할 수 없기때문에 각각 선언함.
		Sungjuk arr1[] = new Sungjuk[MAX];
		PersonInfo arr2[] = new PersonInfo[MAX];
		int i, arr1_cnt=0, arr2_cnt=0;

		System.out.println("### 성적 입력 ###");
		for(i=0; i<MAX; i++)
		{
			arr1[i] = new Sungjuk();
			if(arr1[i].Input())   // false값 반환 시 정상 진행.
				break;

			arr1[i].process();
			arr1_cnt++;
			System.out.println();
		}

		System.out.println("\n### 개인정보 입력  ###");
		for(i=0; i<MAX; i++)
		{
			arr2[i] = new PersonInfo();
			if(arr2[i].Input())   // false값 반환 시 break;
				break;
			arr2_cnt++;
			System.out.println();
		}

		/*for(int i=0; i<MAX; i++)
	      {
	         arr1[i] = new Sungjuk();
	         arr2[i] = new PersonInfo();
	      }*/

		//Personable arr1[] = new Sungjuk[MAX];
		//Personable arr2[] = new PersonInfo[MAX];
		// 배열에다 100개까지의 학번부터 성적입력.
		System.out.println();
		System.out.println("\t*** 성적표  ***");
		System.out.println("=============================================================");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println("=============================================================");
		// printData메소드에 배열객체 주소값 전달
		printData(arr1, arr1_cnt);
		System.out.println("=============================================================");
		System.out.println();
		System.out.println("\t*** 개인정보  ***");
		System.out.println("=============================================================");
		System.out.println("학번\t이름\t전화번호\t주소");
		System.out.println("=============================================================");
		printData(arr2, arr2_cnt);
		System.out.println("=============================================================");
	}

	// 접근가능한 멤버는 Input과 Output
	static void printData(Personable arr[], int cnt)
	{
		for(int i=0; i<cnt; i++)
		{
			arr[i].Output();   // output() 메소드에 대한 다형성 규현
		}
	}
}