package e1_method;

public class TimesTable {
	public void showTable(int num) {
		
		System.out.println("--------------------------------");
		System.out.printf("[ %d단 ]\n", num);
		
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d\n", num, i, (num*i));
		}
		
		System.out.println("--------------------------------");
		
		
		
	}

}
