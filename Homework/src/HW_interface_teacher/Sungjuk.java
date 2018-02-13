package HW_interface_teacher;

import java.util.Scanner;
//Sungjuk 클래스는 Person클래스로부터 상속받고, Personable 인터페이스로부터 상속받는다.
public class Sungjuk extends Person implements Personable {

	int kor;
	int eng;
	int math;
	int tot;
	float avg;
	char grade;

	Sungjuk()
	{

	}


	// 인터페이스 메소드 오버라이딩 - 반드시 public
	@Override
	public boolean Input() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("학번 입력 >> ");
		this.hakbun = sc.next();
		if(this.hakbun.toLowerCase().equals("exit"))
		{
			return true;
		}
		System.out.println("이름 입력 >> ");
		this.irum = sc.next();
		System.out.println("국어점수 입력 >> ");
		this.kor = sc.nextInt();
		System.out.println("영어점수 입력 >> ");
		this.eng = sc.nextInt();
		System.out.println("수학점수 입력 >> ");
		this.math = sc.nextInt();
		process();
		return false;
	}
	// 인터페이스에서 오버라이드 하는게 아님으로 접근제한자는 상황에 따라서 설정
	void process()
	{

		this.tot = this.kor+this.eng+this.math;
		this.avg = (float)this.tot/3;
		switch((int)this.avg / 10)
		{
		case 10:
		case 9:
			grade = '수';
			break;
		case 8:
			grade = '우';
			break;
		case 7:
			grade = '미';
			break;
		case 6:
			grade = '양';
			break;
		default:
			grade = '가';
		}

	}

	@Override
	public void Output() 
	{
		System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%s\n", this.hakbun , this.irum, this.kor,
				this.eng, this.math, this.tot, this.avg, this.grade);
	}

}