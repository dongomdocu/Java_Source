package MusicCDInterface;

public class AppCDInfo extends CDInfo implements Lendable{
	
	String borrower;
	String checkOutDate;
	int state;
	
	AppCDInfo(String registerNo, String title) {
		super(registerNo, title);
	}
	
	public void checkOut(String borrower, String date) {
		if (state != STATE_NORMAL) {
			return;
		}
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = STATE_BORROWED;
		System.out.println("*" + title + "CD가 대출되었습니다.");
		System.out.println("대출인 : " + borrower);
		System.out.println("대출일 : " + date + "\n");
	}
	
	public void checkIn() {
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0;
		System.out.println("*" + title + "CD가 반납되었습니다.");
	}

}