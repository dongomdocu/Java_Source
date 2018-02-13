package PacTest;

public class CalculExam {
	public static void main(String[] args) {
		Calcul myCalc = new Calcul();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("rst1 = " + result1);
		
		byte x = 10;
		byte y = 4;
		double  result2 = myCalc.divide(x, y);
		System.out.println("rst2 = " + result2);
		
		myCalc.powerOff();
	}

}
