package resorce;

public class Main {
	public static void main(String[] args) {
		
		try(Myresource res = new Myresource("A")) {
			
			String data = res.read1();
			int value = Integer.parseInt(data);
			
		} catch (Exception e) {
			
			System.out.println("예외 처리 : "+e.getMessage());
			
		}
	}
}
