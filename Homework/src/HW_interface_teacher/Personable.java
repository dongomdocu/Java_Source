package HW_interface_teacher;

public interface Personable {

	public final static int MAX = 100;
	// 추상클래스
	// public abstract가 자동추가됨.
	// 상속받는 자식들은 public 접근제한자 사용할것.
	abstract boolean Input();   // 입력받기때문에 parameter 필요없음

	abstract void Output();
}