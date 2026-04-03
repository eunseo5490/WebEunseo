package ex2_object;

public class Student {
	
	private int no;
	private String name;
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public int getNo() {
		return no;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public int hashCode() {
		int hashcode = no + name.hashCode();
		return hashcode;
	}
	
	

}
