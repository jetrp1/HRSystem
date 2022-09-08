public abstract class Employee {
	//instance variable
	private String name;
	private String ssn;
	
	public Employee(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public String getSsn() {
		return ssn;
	}
	
	public String toString() {
		return String.format("%s: %s, %s: %s%n", 
				"Name", this.name, "Social Security Number", 
				this.ssn);
	}
	
	public abstract double earnings();
	

}