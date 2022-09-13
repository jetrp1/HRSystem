public class SalaryCompensationModel implements CompensationModel {
    //Instance Varriables
    private double salary;

    public SalaryCompensationModel(double salary) {
        //TODO: Validate the value of salary and throw illegalArgumentException

        this.salary = salary;
    }

    public double earnings() {
        return salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
