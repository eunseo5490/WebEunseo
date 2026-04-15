package exma;

import java.util.function.Consumer;

class Printer {
	public void print(String message) {
		System.out.println("출력내용 : "+message);
	}
}

public class Main2 {
	
	public static void executePrint(Consumer<String> action, String message) {
		action.accept(message);
	}
	
	public static void main(String[] args) {
		Printer prt = new Printer();
		
		executePrint(prt::print, "람다식 전달 연습");
	}
}
