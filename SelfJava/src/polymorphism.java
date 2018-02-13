
public class polymorphism {
	public static void main(String[] args) {
		Object obvar = "dongom";
		Object[] dongom = new Object[10];
		String a = "a";
		String[] dongomarray = new String[10];
		DmbCellPhone dmbobj = new DmbCellPhone("삼성", "검정", 10);
		int b = 1;
		char c = 'c';
		
		dongom[0] = a;
		dongom[1] = b;
		dongom[2] = c;
		dongom[3] = dongomarray;
		dongom[4] = dmbobj;
		
		
	}

}
