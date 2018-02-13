
public class ArrayPrint {
	public static void main(String[] args) {
		System.out.println("args.length: " + args.length);
		int sum=0;
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
			sum += Integer.parseInt(args[i]);
		}
		
	}

}
