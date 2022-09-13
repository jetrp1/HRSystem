public class Employee {
	//instance variable
	private String name;
	private String ssn;
	private CompensationModel compModel;
	
	public Employee(String name, String ssn, CompensationModel model) {
		this.compModel = model;
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
		return String.format("%s: %s, %s: %s, %s: %f\n", 
				"Name", this.name, "Social Security Number", 
				this.ssn, "earnings", compModel.earnings());
	}
	
	// public abstract double earnings();
	

}