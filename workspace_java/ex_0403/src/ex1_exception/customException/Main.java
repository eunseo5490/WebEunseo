package ex1_exception.customException;

public class Main {
	public static void main(String[] args) {
		
		Account a = new Account();
		
		a.deposit(100000);
		System.out.println("예금액 : " + a.getBalance());
		
		try {
			a.withdraw(100000);
			
			System.out.println("예금액 : "+a.getBalance());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
