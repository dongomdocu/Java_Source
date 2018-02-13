package HW_interface;

public class Person { //Person은 여러 class에서 상속 받는다. 인터페이스에 학번과 이름을 입력받을 필요는 없는데 구조 copy 하다가 잘못 썼으므로 바꿔주어야 한다.
	
	String hakbun;
	String irum;
	Person(){
		
	}

	Person(String hakbun, String irum) {
		this.hakbun = hakbun;
		this.irum = irum;
	}

}
