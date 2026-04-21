package test3;

public class Employee {
	private String name;
	private int salary;
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public void printInfo() {
		System.out.printf("이름: %s, 급여: %d\n", name, salary);
	}
	
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
}