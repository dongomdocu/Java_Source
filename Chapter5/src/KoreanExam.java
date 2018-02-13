
public class KoreanExam {
	public static void main(String[] args) {
		
		Korean person1 = new Korean();
		System.out.println(person1.name);
		System.out.println(person1.ssn);
		System.out.println(person1.nation);
		
		Korean person2 = new Korean("park", "22-22");
		System.out.println(person2.name);
		System.out.println(person2.ssn);
		System.out.println(person2.nation);

		Korean person3 = new Korean("park", "22-22", "몽골");
		System.out.println(person3.name);
		System.out.println(person3.ssn);
		System.out.println(person3.nation);
		
	}

}
