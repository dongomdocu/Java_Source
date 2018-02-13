package Sungjuk;

import java.util.Scanner;

public class SungjukEx01 {
	int studentNum;
	String name;
	int korean;
	int english;
	int math;
	
	int total;
	double average;
	String grade;
	
	SungjukEx01(){
		
	}
	SungjukEx01(int studentNum, String Name, int korean, int english, int math) {
		this.studentNum = studentNum;
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
				
		// TODO Auto-generated constructor stub
	}
	void inputSungJuk() {
		Scanner in = new Scanner(System.in);
		System.out.println("학번을 입력하세요");
		this.studentNum = in.nextInt();
		System.out.println("이름을 입력하세요");
		this.name = in.next();
		System.out.println("언어 점수을 입력하세요");
		this.korean = in.nextInt();
		System.out.println("영어 점수를 입력하세요");
		this.english = in.nextInt();
		System.out.println("수학 점수를 입력하세요");
		this.math = in.nextInt();
	}
	
	void processSungjuk() {
		this.total = this.korean + this.english + this.math;
		this.average = (this.korean + this.english + this.math) /3;
		this.grade = (this.average >= 90) ? "수" :((this.average >= 80) ? "우" : "미");
	}
	
	void outputSungjuk() {
		System.out.println("학번 : " + this.studentNum);
		System.out.println("총점 : " + this.total);
		System.out.println("평균 : " + this.average);
		System.out.println("등급 : " + this.grade);
	}
	void outputSungjukForm() {
		String format = "%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n";
		System.out.println("\t\t\t\t\t\t\t*** 성적표 ***");
		System.out.println("=======================================================================================================================");
//		System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n", "number","name", "lang", "engl", "math", "sum", "average", "grade");
		System.out.printf(format, "number","name", "lang", "engl", "math", "sum", "average", "grade");
		//System.out.printf(format, detailFormat);
		//System.out.printf("%15s  %15s   %15s   %15s   %15s   %15s   %15s   %15s\n", "학번","이름", "국어", "영어", "수학", "총점", "평균", "등급");
		System.out.println("=======================================================================================================================");
		System.out.printf("%-15s%-15s%-15d%-15d%-15d%-15d%-15.1f%-15s\n", this.studentNum, this.name, this.korean, this.english, this.math, this.total, this.average, this.grade);
		//System.out.printf("%10s  %15s   %15d   %15d   %15d   %15d   %15.1f   %15s\n", studentNumber, name, lang, english, math, sum, average, grade);
	}
}
