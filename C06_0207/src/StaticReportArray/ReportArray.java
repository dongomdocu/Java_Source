package StaticReportArray;

import java.util.Scanner;

public class ReportArray {
	String number;
	String name;
	int kor;
	int eng;
	int math;
	
	int sum;
	double aver;
	String grade;
	static double total_avg = 0;
	
	ReportArray() {
		
	}
	
	static double printAvgOfAvg() {
		//System.out.println(total_avg/ReportArrayExam.cnt);
		return total_avg/ReportArrayExam.cnt;
		
	}
	
	boolean input_report() {
		Scanner in = new Scanner(System.in);
		System.out.println("학번을 입력하세요");
		this.number = in.next();
		if(this.number.equals("exit")) {
			return true;
		}
		System.out.println("이름을 입력하세요");
		this.name = in.next();
		System.out.println("언어 점수을 입력하세요");
		this.kor = in.nextInt();
		System.out.println("영어 점수를 입력하세요");
		this.eng = in.nextInt();
		System.out.println("수학 점수를 입력하세요");
		this.math = in.nextInt();
		return false;
	}
	
	void process_report() {
		this.sum = this.kor + this.eng + this.math;
		this.aver = sum/3;
		this.grade = (this.aver>= 90) ? "수" :((this.aver >= 80) ? "우" : "미");
		this.total_avg += this.aver;
	}
	
	static void print_format() {
		String format = "%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n";
		System.out.println("\t\t\t\t\t\t\t*** 성적표 ***");
		System.out.println("=======================================================================================================================");
//		System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n", "number","name", "lang", "engl", "math", "sum", "average", "grade");
		System.out.printf(format, "number","name", "lang", "engl", "math", "sum", "average", "grade");
		//System.out.printf(format, detailFormat);
		//System.out.printf("%15s  %15s   %15s   %15s   %15s   %15s   %15s   %15s\n", "학번","이름", "국어", "영어", "수학", "총점", "평균", "등급");
		System.out.println("=======================================================================================================================");		
	}
	
	void output_report() {
		System.out.printf("%-15s%-15s%-15d%-15d%-15d%-15d%-15.1f%-15s\n", this.number, this.name, this.kor, this.eng, this.math, this.sum, this.aver, this.grade);
		//System.out.printf("%10s  %15s   %15d   %15d   %15d   %15d   %15.1f   %15s\n", studentNumber, name, lang, english, math, sum, average, grade);
	}
}
