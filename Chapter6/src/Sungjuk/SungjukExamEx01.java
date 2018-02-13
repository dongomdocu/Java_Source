package Sungjuk;

public class SungjukExamEx01 {
	public static void main(String[] args) {
	/*	int studentNum;
		String name;
		int koraen;
		int english;
		int math;
	 */		
		System.out.println("학번, 이름, 국어성적, 영어성적, 수학성적 을 입력하세요");
		
		SungjukEx01 sj = new SungjukEx01();
		//SungjukEx01 sj = new SungjukEx01(910910, "박종혁", 90, 91, 92);
		sj.inputSungJuk();
		sj.processSungjuk();
		//sj.outputSungjuk();
		sj.outputSungjukForm();
		
	}

}
