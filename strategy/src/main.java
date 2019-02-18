
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cs1 = new Customer(new StudentStrategy());
		cs1.salecustom();
		Customer cs2 = new Customer(new EmployeeStrategy());
		cs2.salecustom();
	}

}
