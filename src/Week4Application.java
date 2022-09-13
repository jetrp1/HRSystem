import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Week4Application {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();

        try {
            File inputFile = new File("data/employee.csv");
            Scanner s = new Scanner(inputFile);

            while (s.hasNext()) {
                String line = s.nextLine();
                String[] items = line.split(",");

                if (items.length == 3) {
                    //This is a Salary Employee

                    String name = items[0].trim(); 
                    String ssn = items[1].trim();
                    double salary = Double.parseDouble(items[2].trim());

                    CompensationModel compModel = new SalaryCompensationModel(salary);
                    Employee emp = new Employee(name, ssn, compModel);
                    employees.add(emp);
                }
                else if (items.length == 4) {
                    //TODO: create a comissionCompensation model
                }
                else if (items.length == 5) {
                    //BasePlusCommissionModel
                    String name = items[0].trim(); 
                    String ssn = items[1].trim();
                    double commissionRate = Double.parseDouble(items[2].trim());
                    double grossSales = Double.parseDouble(items[3].trim());
                    double base = Double.parseDouble(items[4].trim());
                    

                    CompensationModel compModel = new BasePlusCommissionCompensationModel(commissionRate, grossSales, base);
                    Employee emp = new Employee(name, ssn, compModel);
                    employees.add(emp);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Employee emp: employees) {
            System.out.println(emp.toString());
        }        
    }
    
}
