package Selling;

public class StaticSellingArrayExam {
	static int objCount = 10;

	public static void main(String[] args) {
		
		SellingArray dongom = new SellingArray(); //static 필드를
		dongom.printAge();//이런식으로 쓰는건 올바르지 않아.
		
		SellingArray[] sells = new SellingArray[objCount]; //Selling2형 배열 sells는 Selling 클래스의 주소를 담을수 있는 배열이지 객체 그 자체를 담는 배열이 아니다. el 구분해야됨
		int j;
		
		memAddrArray(sells);
		j = createObj(sells);
		printFormat();
		printRst(sells, j);
		System.out.println(SellingArray.total_price);	
		
	
	}
	static void memAddrArray(SellingArray[] sells) {
		for(int i = 0; i < objCount; i++) {
			sells[i] = new SellingArray();//배열과 객체를 연결하는 라인
		}	
	}
	static int createObj(SellingArray[] sells) {
		int j;
		int stopFlag = 0;
		for(j = 0; j < objCount; j++) {
			System.out.println(j);
			stopFlag = sells[j].input_data();
			if(stopFlag == 1) {
				break;
			}
			sells[j].process_data();
		}	
		return j;
	}
	static void printRst(SellingArray sells[], int j) {
		
		
		for(int k = 0; k <=j-1; k++) {
			//j-1 정상 플로우를 탄 경우, j가 ++ 되고서 탈출한다. / 
			//exit 플로우를 탄 경우 마지막 라인(exit을 입력해서 입력되지 않은 데이터들을 가진 라인)을 출력하지 않아야 한다.
			//고로 두가지 플로우 모두에서 j보다 하나 적은 라인을 출력 해야돼서  j-1을 해놨다. / 
			//하지만 obj를 초기화하는 순간에 cnt를 ++ 하는 로직이 더 좋아보인다. / 1+1 =2 인결과가 1+1=2-1 인 결과보다 더 좋다.  
			sells[k].output_data_Form();
		}
		System.out.println("=======================================================================================================================");	
	}
	static void printFormat() {
		String format = "%-15s%-15s%-15s%-15s%-15s\n";
		//System.out.println("입력된 제품 count" + j);

		System.out.println("\t\t\t\t\t\t\t*** 영수증 ***");
		System.out.println("=======================================================================================================================");
		System.out.printf(format, "code", "name", "price", "count", "amount");
		System.out.println("=======================================================================================================================");
		
	}
}