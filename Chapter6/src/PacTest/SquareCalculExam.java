package PacTest;

public class SquareCalculExam {
	public static void main(String[] args) {
		SquareCalcul calcul = new SquareCalcul();
		
		double sq1 = calcul.areaRectangle(2);
		double sq2 = calcul.areaRectangle(10.1, 20.1);
		
		System.out.println(sq1);
		System.out.println(sq2);
	}

}
