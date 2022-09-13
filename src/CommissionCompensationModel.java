public class CommissionCompensationModel implements CompensationModel {
    //Instance Varriables
    private double commissionRate;
    private double grossSales;

    public CommissionCompensationModel(double commissionRate, double grossSales) {
        //TODO: check the validity of the values and throw an illegal ArgumentException

        
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    @Override
    public double earnings() {
        return 0;
    }

    //Setters and Getters
    public double getCommissionRate() {
        return commissionRate;
    }

    

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    } 

    @Override
    public String toString() {
        return "CommissionCompensationModel [commissionRate=" + commissionRate + ", grossSales=" + grossSales + "]";
    }
    
}
