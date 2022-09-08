import java.util.ArrayList;

public class EmployeeApplication {
	public static void main(String[] args) {
		//Employee[] empArray = new Employee[3];
		
		ArrayList<Employee> empArrayList = new ArrayList();
		
		//Create an object of type Employee
		Employee emp1 = new CommissionEmployee("Mitra", "1234", 2, 0.1);
		
		//Polymorphism
		Employee emp2 = new BasePlusCommissionEmployee("Erik", "2345", 5, 0.5, 100);
		
		CommissionEmployee emp3 = new BasePlusCommissionEmployee("Caroline",
				"3456", 3, 0.6, 700);
		
		CommissionEmployee emp4 = new CommissionEmployee("Marcella", "6788", 
				10, 0.7);
		
		//Downcasting is not allowed in OOP
		/*BasePlusCommissionEmployee emp5 = new CommissionEmployee("Samin",
		 *  "0987"6, 0.9);
		 */
		
		empArrayList.add(emp1);
		empArrayList.add(emp2);
		empArrayList.add(emp3);
		empArrayList.add(emp4);
		
		for(Employee emp: empArrayList) {
			System.out.println(emp.toString());
		}
		
	}
}