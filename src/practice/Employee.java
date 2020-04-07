package practice;


public class Employee {
	int id;
	int salary;
	public Employee(int id, int salary) {
		this.id = id;
		this.salary = salary;
	}
	public void printEmployee() {
		System.out.println("Employee id : " + id + " Salary : " + salary);
	}
}
