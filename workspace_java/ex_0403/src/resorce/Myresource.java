package resorce;

public class Myresource implements AutoCloseable{
	
	private String name;
	
	public Myresource(String name) {
		this.name = name;
		System.out.println("[MyResource("+name+") 열기]");
	}
	
	public String read1() {
		System.out.println("[MyResource("+name+") 읽기]");
		return "100";
	}
	
	
	@Override
	public void close() throws Exception {
		System.out.println("[MyResource("+name+") 닫기]");
		
	}

}
