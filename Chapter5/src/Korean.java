
public class Korean {
	String nation = "대한민국";
	String name;
	String ssn;
	
	public Korean() {
		
	}
	
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	public Korean(String name, String ssn, String nation) {
		this.name = name;
		this.ssn = ssn;
		this.nation = nation;

	}
	public Korean(String name, String ssn, String nation, String address) {
		this(name, ssn);//이런것도 가능 
		this.nation = nation;
	}
		
}
