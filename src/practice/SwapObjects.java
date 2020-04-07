package practice;

public class SwapObjects {
	public static void swap(EmployeeWrapper ew1, EmployeeWrapper ew2) {
		Employee temp = ew1.e;
		ew1.e = ew2.e;
		ew2.e = temp;
	}
	
	public static void main(String args[]) {
		Employee e1 = new Employee(1, 1000);
		Employee e2 = new Employee(2, 2000);
		
		e1.printEmployee();
		e2.printEmployee();
		
		EmployeeWrapper ew1 = new EmployeeWrapper(e1);
		EmployeeWrapper ew2 = new EmployeeWrapper(e2);
		
		swap(ew1, ew2);
		
		ew1.e.printEmployee();
		ew2.e.printEmployee();
	}
}
