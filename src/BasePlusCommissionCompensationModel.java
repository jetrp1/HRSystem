public class BasePlusCommissionCompensationModel extends CommissionCompensationModel {
    // Instance Varriables
    private double base;

    public BasePlusCommissionCompensationModel(double commissionRate, double grossSales, double base) {
        //TODO check the validity of base, throw exception if not valid
        
        super(commissionRate, grossSales);
        this.base = base;
    }

    public double earnings() {
        return super.earnings() + base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }



}
