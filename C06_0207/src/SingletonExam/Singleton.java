package SingletonExam;

public class Singleton {
	private static Singleton singleton = new Singleton();

	private Singleton() {} //생성자에 private를 붙였으므로 new를 통해 호출되지 않는다.
	
	static Singleton getInstance() {
		return singleton;
	}
}
