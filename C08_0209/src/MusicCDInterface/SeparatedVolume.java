package MusicCDInterface;

public class SeparatedVolume implements Lendable {
	String requestNo;
	String bookTitle;
	String writer;
	String borrorwer;
	String checkOutDate;
	int state;

	public SeparatedVolume(String requestNo, String bookTitle, String writer) {
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}
	
	public void checkOut(String borrower, String date) {
		if(state != STATE_NORMAL) {
			return;
		}
		this.bookTitle = borrower;
		this.checkOutDate = date;
		this.state = STATE_BORROWED;
		System.out.println("*" + bookTitle + "이(가) 대출되었습니다.");
		System.out.println("대출인 : " + borrower);
		System.out.println("대출일 : " + date + "\n");
	}
	
	public void checkIn() {
		this.borrorwer = null;
		this.checkOutDate = null;
		this.state = STATE_NORMAL;
		System.out.println("*" + bookTitle + "이(가) 반납되었습니다.");
	}
}
