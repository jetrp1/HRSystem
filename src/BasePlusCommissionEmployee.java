public class BasePlusCommissionEmployee extends CommissionEmployee{
	
	//instance variable 
	private double baseSalary;
	
	//constructor
	public BasePlusCommissionEmployee(String name, String ssn,
			double grossSales, double commissionRate, 
			double baseSalary) {
		super(name, ssn, grossSales, commissionRate);
		//validate the base salary
		if(baseSalary < 0) {
			throw new IllegalArgumentException("Base salary should be > 0");
		}
		
		this.baseSalary = baseSalary;
	}
	
	public void setBaseSalary(double baseSalary) {
		if(baseSalary < 0) {
			throw new IllegalArgumentException("Base salary should be > 0");
		}
		
		this.baseSalary = baseSalary;
	}
	
	public double getBaseSalary() {
		return baseSalary;
	}
	
	public double earnings() {
		//return (super.getCommissionRate * super.getGrossSalaes + baseSalary)
		return (super.earnings() + baseSalary);
	}
	
	//override the toString method
	public String toString() {
		return String.format("%s, %s: %f",
				super.toString(), "Base-Salaried", earnings());
	}

}