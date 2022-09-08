import java.util.ArrayList;

public class PayrollApplication {
    
    public static void main (String[] args) {

        ArrayList<Payable> payableArrayList = new ArrayList();

        //Instantiate an object from INovice

        try {
            Invoice invoice1 = new Invoice("122", "chair", -1, 100.0);
            payableArrayList.add(invoice1);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        try {
            Employee emp1 = new CommissionEmployee("Tyler", "345", 5, 0.5);
        } catch (Exception empE) {
            System.out.println(empE.getMessage());
        }

        System.out.println("Testing");

        for (Payable payable: payableArrayList) {
            System.out.println(payable.toString());
        }

        

    }
}

