package exam2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.lang.Number;

public class Main {
	public static void main(String[] args) {
		PaymentProcessor<Payment> card = new PaymentProcessor<Payment>(new CardPayment());
		PaymentProcessor<Payment> kakaoPay = new PaymentProcessor<Payment>(new KakaoPay());
		
		card.process();
		kakaoPay.process();
		
		List<Dog> dogs = new ArrayList<Dog>();
		List<Cat> cats = new ArrayList<Cat>();
		
		AnimalPrint ap = new AnimalPrint();
		
		ap.printAnimals(dogs);
		ap.printAnimals(cats);
		
		List<Integer> a = Arrays.asList(1,2,3,4,5);
		List<Double> b = Arrays.asList(1.1,2.2,3.3,4.4,5.5);
		
		
		System.out.println(sum(a));
		System.out.println(sum(b));
		
		
		
		
		
	}
	
	public static double sum(List<? extends Number> list) {
		double n = 0;
		for(Number number : list) {
			n = n + number.doubleValue();
		}
		return n;
	}
}
