package exam.employee;


public class Employee {
	
	String name;
	String dept;
	
	public Employee(String name, String dept) {
		this.name = name;
		this.dept = dept;
		
		
	}

	public String getDept() {
		return dept;
	}

	public String getName() {
		return name;
	}
}
