package ex1_lambda.exam.textservice;

public class Main {
	public static void main(String[] args) {
		TextService ts = new TextService();
		
		String text = "This product is currently out of stock.";
		
		String result = ts.processText(text, str -> str.toUpperCase());
		System.out.println(result);
		
		String result2 = ts.processText(text, str -> str.replace("out of", "in"));
		System.out.println(result2);
		
	}
}
