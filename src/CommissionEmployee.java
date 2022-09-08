public class CommissionEmployee extends Employee{
	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee(String name, String ssn,
			double grossSale, double commissionRate) {
		super(name, ssn);
		//Validate the double values
		
		if(commissionRate <= 0 || commissionRate >1) {
			throw new IllegalArgumentException("Commission "
					+ "rate should be > 0 and <= 1");
		}
		
		if (grossSale < 0 ) {
			throw new IllegalArgumentException("Gross sales must be"
					+ ">=0");
		}
		
		this.commissionRate = commissionRate;
		this.grossSales = grossSale;
	}
	
	public void setCommissionRate(double commissionRate) {
		//validate the local variable commissionRate
		if(commissionRate <= 0 || commissionRate >1) {
			throw new IllegalArgumentException("Commission "
					+ "rate should be > 0 and <= 1");
		}
		this.commissionRate = commissionRate;
		
	}
	
	public double getCommissionRate() {
		return this.commissionRate;
	}
	
	public void setGrossSales(double grossSales) {
		if (grossSales < 0 ) {
			throw new IllegalArgumentException("Gross sales must be"
					+ ">=0");
		}
		
		this.grossSales = grossSales;
	}
	
	public double earnings() {
		return commissionRate * grossSales;
	}
	
	public String toString() {
		return String.format("%s, %s: %f", super.toString(),
				"salary", earnings());
	}

}