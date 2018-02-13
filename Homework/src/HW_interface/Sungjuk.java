package HW_interface;

import java.util.Scanner;

public class Sungjuk extends Person implements Personable {
	
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	String grade;
	
	Sungjuk(){
		// TODO Auto-generated constructor stub
	}
	
	Sungjuk(String hakbun, String irum){
		super(hakbun, irum);
	}

	@Override	
//	public void input(String hakbun,String irum) {
	public void input() {
		Scanner in = new Scanner(System.in);
		System.out.println("언어 점수을 입력하세요");
		this.kor = in.nextInt();
		System.out.println("영어 점수를 입력하세요");
		this.eng = in.nextInt();
		System.out.println("수학 점수를 입력하세요");
		this.math = in.nextInt();
		
		processData();
		
	}
	@Override
	public void output() {
		/*System.out.println("학번" + hakbun);
		System.out.println("이름" + irum);
		System.out.println(this.kor);
		System.out.println(this.math);
		System.out.println(this.eng);
		System.out.println(this.total);
		System.out.println(this.avg);*/
		System.out.printf("%-15s%-15s%-15d%-15d%-15d%-15d%-15.1f%-15s\n", this.hakbun, this.irum, this.kor, this.eng, this.math, this.total, this.avg, this.grade);
	}
	
	static void printFormat() {
		String format = "%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n";
		System.out.println("\t\t\t\t\t\t\t*** 성적표 ***");
		System.out.println("=======================================================================================================================");
//		System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n", "number","name", "lang", "engl", "math", "sum", "average", "grade");
		System.out.printf(format, "number","name", "lang", "engl", "math", "sum", "average", "grade");
		//System.out.printf(format, detailFormat);
		//System.out.printf("%15s  %15s   %15s   %15s   %15s   %15s   %15s   %15s\n", "학번","이름", "국어", "영어", "수학", "총점", "평균", "등급");
		System.out.println("=======================================================================================================================");
	}
	
	void processData() {
		this.total = kor + eng + math;
		this.avg = total/3;
		this.grade = (this.avg>= 90) ? "수" :((this.avg >= 80) ? "우" : "미");
	}
}
