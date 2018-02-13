package MusicCDInterface;

public interface Lendable {
	final static int STATE_BORROWED = 1;
	final static int STATE_NORMAL = 0;
	
	abstract void checkOut(String borrower, String date);
	void checkIn(); //public abstract를 생략하더라도 자동적으로 컴파일 과정에서 붙게 됨


}
